package javaexplorer.controlefluxo;

public class ControleFluxoCondicional {
	public static void main(String[] args) {
		simuladorNotaEscolarFluxoComposto(6);
		simuladorNotaEscolarFluxoComposto(8);
		
	}

	static void simuladorCaixaEletronicoFluxoSimples(double saldo,double valorSolicitado) {
		//foco do exemplo
		if (valorSolicitado < saldo) {
			saldo = saldo - valorSolicitado;
		}
		//perfumar
		System.out.println(saldo);
		System.out.println("fim");
	}
	static void simuladorNotaEscolarFluxoComposto(double nota) {
		//foco do exemplo
		if (nota >= 7) {
			System.out.println("Aprovado");
		}else {
			System.out.println("Reprovado");
		}
		
		System.out.println("fim");
	}
}
