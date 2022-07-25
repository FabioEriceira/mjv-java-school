package javaexplorer.fundamentos.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StringExplorerTest {
	@DisplayName("Testando o método contains da classe String")
	@Test
	public void testeContainsMethodTrue() {
		String palavra = "gleyson";
		//boolean expectativa=true;
		boolean resultado = palavra.contains("gl");
		Assertions.assertTrue(resultado);
	}
	@DisplayName("Testando o método contains da classe String")
	@Test
	public void testeContainsMethodFalse() {
		String palavra = "gleyson";
		
		boolean resultado = palavra.contains("oli");
		Assertions.assertFalse(resultado);
		
	}
}
