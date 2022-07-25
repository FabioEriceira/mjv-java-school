package com.mjv.agualuz.notification.util;

import java.text.DecimalFormat;
import java.text.Normalizer;
import java.time.LocalDateTime;

public class FormatadorUtil {
/*	
	public static void main(String[] args) {
		
		LocalDateTime resultado = formatarDataHora("07/05/2022", "15:21");
		System.out.println(resultado);
		
	}
*/
	public static Double formatarValorDoubleStringCsv(String valor) {
		
		double valord = Double.parseDouble(valor.replace(",","."));
		
		return(valord);
	}

	public static Double formatarValorDoubleStringTxt(String valor) {
		
		String inteiro = valor.substring(0,6);
		String dec = valor.substring(6,8);
		String numero = String.format("%s.%s", inteiro, dec );
		
		double valord = Double.parseDouble(numero);
		
		return(valord);
	}
	
	public static LocalDateTime formatarDataHora(String data, String hora) {
		
		String dia = data.substring(0,2);
		String mes = data.substring(3,5);
		String ano = data.substring(6,10);
		
		String var = String.format("%s-%s-%sT%s", ano, mes, dia, hora );
		LocalDateTime dataFormatada = LocalDateTime.parse(var);
		
		return(dataFormatada);
	}
	public static LocalDateTime formatarDataHoraTxt(String data, String hora) {
		
		String ano = data.substring(0,4);
		String mes = data.substring(4,6);
		String dia = data.substring(6,8);
		
		String hor = hora.substring(0,2);
		String min = hora.substring(2,4);
		
		String var = String.format("%s-%s-%sT%s:%s", ano, mes, dia, hor, min );
		LocalDateTime dataFormatada = LocalDateTime.parse(var);
		
		return(dataFormatada);
	}


	public static String formatarCpf(String cpf) {
		
		String part1 = cpf.substring(0,3);
		String part2 = cpf.substring(3,6);
		String part3 = cpf.substring(6,9);
		String part4 = cpf.substring(9,11);
		
		String cpfFormatado = String.format("%s.%s.%s-%s", part1, part2, part3, part4 );
		
		return(cpfFormatado);
	}
	
	public static String formatarCpfCsv(String cpf) {
		
		String part1 = cpf.substring(0,11);
		String part2 = cpf.substring(12,14);
		
		String cpfFormatado = String.format("%s-%s", part1, part2 );
		
		return(cpfFormatado);
	}
	
	public static String formatarValor(Double valor) {
		DecimalFormat df = new DecimalFormat("#,###.00");
		
		String valorFormatado = df.format(valor);
		
		return(valorFormatado);
	}

	public static String formatarSemPontos(Double valor) {
		DecimalFormat df = new DecimalFormat("####00");
		
		String valorFormatado = df.format(valor);
		
		return(valorFormatado);
	}
	
	public static String formatarCep(String cep) {
		String cep1 = cep.substring(0,2);
		String cep2 = cep.substring(2,5);
		String cep3 = cep.substring(5,8);
		
		String cepFormatado = String.format("%s.%s-%s", cep1,cep2,cep3);

		return(cepFormatado);
	}
	
	public static String removerAcentos(String palavra) {
		return Normalizer.normalize(palavra, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "");
	}
		
	
}

