package javaexplorer.util;

public class FormatadorUtil {
	public static String formatarCep(String cep) {
		//poderá ser um outro método futuramente
		cep = String.format("%08d", Long.valueOf(cep));
		
		String b1 = cep.substring(0,2);
		String b2 = cep.substring(2,5);
		String b3 = cep.substring(5,8);
		
		return b1 +"." +b2+"-"+b3;
	}
}
