package plp.enquanto;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import plp.enquanto.Linguagem.*;
import plp.enquanto.parser.EnquantoBaseListener;
import plp.enquanto.parser.EnquantoParser.*;

import static java.lang.Integer.parseInt;

import java.beans.Expression;

public class Regras extends EnquantoBaseListener {
	private final Leia leia;
	private final Skip skip;
	private final Propriedades valores;

	private Programa programa;

	public Regras() {
		leia = new Leia();
		skip = new Skip();
		valores = new Propriedades();
	}

	public Programa getPrograma() {
		return programa;
	}

	@Override
	public void exitBool(BoolContext ctx) {
		valores.insira(ctx, new Booleano("verdadeiro".equals(ctx.getText())));
	}

	@Override
	public void exitLeia(LeiaContext ctx) {
		valores.insira(ctx, leia);
	}

	@Override
	public void exitSe(SeContext ctx) {
		final Bool condicao = (Bool) valores.pegue(ctx.booleano(0));
		final Map<Bool, Comando> senaoses = new HashMap<Bool, Comando>();
		
		for (int i = 1; i < ctx.booleano().size(); i++) {
			senaoses.put(
					(Bool) valores.pegue(ctx.booleano(i)),
					(Comando) valores.pegue(ctx.comando(i))
					);
		}
		
		final Comando entao = (Comando) valores.pegue(ctx.comando(0));
		final Comando senao = (Comando) valores.pegue(ctx.comando(ctx.comando().size()-1));
		valores.insira(ctx, new Se(condicao, entao, senaoses, senao));
	}

	@Override
	public void exitPara(ParaContext ctx) {
		final String id = ctx.ID().getText();
		final Expressao start = valores.pegue(ctx.expressao(0));
		final Expressao end = valores.pegue(ctx.expressao(1));
		final Comando comando = valores.pegue(ctx.comando());		
		valores.insira(ctx, new Para(id, start, end, comando));
	}	

	@Override
	public void exitRepita(RepitaContext ctx) {
		final Expressao expressao = valores.pegue(ctx.expressao());
		final Comando comando = valores.pegue(ctx.comando());
		valores.insira(ctx, new Repita(expressao, comando));
	}

	@Override
	public void exitEscolha(EscolhaContext ctx) {
		final Id id = new Id(ctx.ID().getText());
		final Map<Expressao, Comando> escolhas = new HashMap<Expressao, Comando>();
		for (int i = 0; i < ctx.expressao().size(); i++) {
			escolhas.put(
				(Expressao) valores.pegue(ctx.expressao(i)),
				(Comando) valores.pegue(ctx.comando(i))
			);
		}
		final Comando outro = (Comando) valores.pegue(ctx.comando(ctx.comando().size()-1));
		valores.insira(ctx, new Escolha(id, escolhas, outro));
	}

	@Override
	public void exitInteiro(InteiroContext ctx) {
		valores.insira(ctx, new Inteiro(parseInt(ctx.getText())));
	}

	@Override
	public void exitSkip(SkipContext ctx) {
		valores.insira(ctx, skip);
	}

	@Override
	public void exitEscreva(EscrevaContext ctx) {
		final Expressao exp = valores.pegue(ctx.expressao());
		valores.insira(ctx, new Escreva(exp));
	}

	@Override
	public void exitPrograma(ProgramaContext ctx) {
		final List<Comando> cmds = valores.pegue(ctx.seqComando());
		programa = new Programa(cmds);
		valores.insira(ctx, programa);
	}

	@Override
	public void exitId(IdContext ctx) {
		final String id = ctx.ID().getText();
		valores.insira(ctx, new Id(id));
	}

	@Override
	public void exitSeqComando(SeqComandoContext ctx) {
		final List<Comando> comandos = new ArrayList<>();
		for (ComandoContext c : ctx.comando()) {
			comandos.add(valores.pegue(c));
		}
		valores.insira(ctx, comandos);
	}

	@Override
	public void exitAtribuicao(AtribuicaoContext ctx) {
		final String id = ctx.ID().getText();
		final Expressao exp = valores.pegue(ctx.expressao());
		valores.insira(ctx, new Atribuicao(id, exp));
	}

	@Override
	public void exitBloco(BlocoContext ctx) {
		final List<Comando> cmds = valores.pegue(ctx.seqComando());
		valores.insira(ctx, new Bloco(cmds));
	}

	@Override
	public void exitOpBin(OpBinContext ctx) {
		final Expressao esq = valores.pegue(ctx.expressao(0));
		final Expressao dir = valores.pegue(ctx.expressao(1));
		final String op = ctx.getChild(1).getText();
		final Expressao exp = switch (op) {
			case "^" -> new ExpExp(esq, dir);
			case "*" -> new ExpMult(esq, dir);
			case "/" -> new ExpDiv(esq, dir);
			case "-" -> new ExpSub(esq, dir);
			default  -> new ExpSoma(esq, dir);
		};
		valores.insira(ctx, exp);
	}

	@Override
	public void exitEnquanto(EnquantoContext ctx) {
		final Bool condicao = valores.pegue(ctx.booleano());
		final Comando comando = valores.pegue(ctx.comando());
		valores.insira(ctx, new Enquanto(condicao, comando));
	}

	@Override
	public void exitELogico(ELogicoContext ctx) {
		final Bool esq = valores.pegue(ctx.booleano(0));
		final Bool dir = valores.pegue(ctx.booleano(1));
		valores.insira(ctx, new ELogico(esq, dir));
	}

	@Override
	public void exitOuLogico(OuLogicoContext ctx) {
		final Bool esq = valores.pegue(ctx.booleano(0));
		final Bool dir = valores.pegue(ctx.booleano(1));
		valores.insira(ctx, new OuLogico(esq, dir));
	}

	@Override
	public void exitXouLogico(XouLogicoContext ctx) {
		final Bool esq = valores.pegue(ctx.booleano(0));
		final Bool dir = valores.pegue(ctx.booleano(1));
		valores.insira(ctx, new XouLogico(esq, dir));
	}

	@Override
	public void exitBoolPar(BoolParContext ctx) {
		final Bool booleano = valores.pegue(ctx.booleano());
		valores.insira(ctx, booleano);
	}

	@Override
	public void exitNaoLogico(NaoLogicoContext ctx) {
		final Bool b = valores.pegue(ctx.booleano());
		valores.insira(ctx, new NaoLogico(b));
	}

	@Override
	public void exitExpPar(ExpParContext ctx) {
		final Expressao exp = valores.pegue(ctx.expressao());
		valores.insira(ctx, exp);
	}

	@Override
	public void exitExiba(ExibaContext ctx) {
		if (ctx.TEXTO() != null) {
			// Caso seja um texto literal
			final String t = ctx.TEXTO().getText();
			final String texto = t.substring(1, t.length() - 1); // Remove aspas
			valores.insira(ctx, new Exiba(texto));
		} else if (ctx.expressao() != null) {
			// Caso seja uma expressão
			final Expressao exp = valores.pegue(ctx.expressao());
			valores.insira(ctx, new Exiba(exp));
		}
	}

	@Override
	public void exitOpRel(OpRelContext ctx) {
		final Expressao esq = valores.pegue(ctx.expressao(0));
		final Expressao dir = valores.pegue(ctx.expressao(1));
		final String op = ctx.getChild(1).getText();
		final Bool exp = switch (op) {
			case "="  -> new ExpIgual(esq, dir);
			case "<>" -> new ExpDiferente(esq, dir);
			case "<"  -> new ExpMenorQue(esq, dir);
			case "<=" -> new ExpMenorIgual(esq, dir);
			case ">"  -> new ExpMenorQue(esq, dir);
			case ">=" -> new ExpMaiorIgual(esq, dir);
			default   -> new ExpIgual(esq, esq);
		};
		valores.insira(ctx, exp);
	}
}
