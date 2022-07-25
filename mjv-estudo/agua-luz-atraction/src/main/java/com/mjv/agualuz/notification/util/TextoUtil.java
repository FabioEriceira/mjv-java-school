package com.mjv.agualuz.notification.util;

public class TextoUtil {
	/*
	public static void main(String[] args) {
	
		Pais pais = Pais.funcaoSigla("BR");
		System.out.println(pais);
		
		/*
		String[] contratos = {"Gleyson Sampaio", "Fábio Trindade Ericeira", "Raimundo Nonato Loureiro Castelo Branco"};
		for (String contrato : contratos) {
			System.out.println(ajustar(contrato,40));
		}
		
		String palavra = "Fabio Trindade Ericeira";
		String novaPalavra = completar(palavra,20);
		System.out.println(novaPalavra);
		
		String nome = "Raimundo Nonato";
		String nomeCortado = cortar(nome,30);
		System.out.println(nomeCortado);
		
	}
	*/
			
	public static String ajustar(String textoOriginal, int tamanhoMaximo) {
		String textoAjustado = completar(textoOriginal, tamanhoMaximo);
		textoAjustado = cortar(textoAjustado, tamanhoMaximo);
		return textoAjustado;
	}
	public static String completar(String textoOriginal, int tamanhoMaximo) {
		String formato = "%-" + tamanhoMaximo + "s";
		String textoFormatado = String.format(formato, textoOriginal);
		return textoFormatado;
	}
	
	public static String cortar(String textoOriginal, int tamanhoMaximo) {
		int max = Math.min(tamanhoMaximo, textoOriginal.length()); // o método Math tem uma classe chamada min que retorna o menor dos números.
		return textoOriginal.substring(0,max);
	}
	
}
