package javaexplorer.util.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import javaexplorer.util.FormatadorUtil;

public class FormatadorUtilTest {
	@DisplayName("Testando o método de formatação de cep")
	@Test
	public void formatacaoValidaCepTest() {
		String parametro = "65300123";
		String resultado = FormatadorUtil.formatarCep(parametro);
		
		//é o que vcs precisam prever, imaginar, deduzir
		String expectativa = "65.300-123";
		
		Assertions.assertEquals(expectativa, resultado);
	}
	@DisplayName("Testando o método de formatação de cep")
	@Test
	public void formatacaoCepSemOsOitoDigitos() {
		String parametro = "5623598";
		String resultado = FormatadorUtil.formatarCep(parametro);
		
		//é o que vcs precisam prever, imaginar, deduzir
		String expectativa = "05.623-598";
		
		Assertions.assertEquals(expectativa, resultado);
	}
}
