package com.mjv.agualuz.notification.model;

import java.util.HashMap;
import java.util.Map;

import lombok.Getter;

public enum Servico {
		AGUA("Água",137.21,"A"),
		LUZ("Energia",132.15,"L");
	
	@Getter private String descricao;
	@Getter private Double valor;
	private String sigla;
	
	private Servico(String descricao, Double valor, String sigla) {
		this.descricao = descricao;
		this.valor = valor;
		this.sigla = sigla;
	}
	
	private Servico(String sigla) {
		this.sigla = sigla;
	}
	
	private static final Map<String, Servico> siglaServico = new HashMap<>();
	
	static {
		for (Servico funcao : Servico.values()) {
			siglaServico.put(funcao.getSigla(), funcao);
		}
	}
	
	public String getSigla() {
		return sigla;
	}
	
	public static Servico funcaoSigla(String sigla) {
		return siglaServico.get(sigla);
	}
	
	
	
	
	
	
}
