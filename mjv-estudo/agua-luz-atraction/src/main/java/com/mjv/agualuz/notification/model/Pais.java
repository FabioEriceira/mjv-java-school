package com.mjv.agualuz.notification.model;

import java.util.HashMap;
import java.util.Map;


public enum Pais {
	AFEGANISTAO ("Afeganistao","AF"),
	ALEMANHA("Alemanha","DE"),
	ARGENTINA("Argentina","AR"),
	BRASIL("Brasil","BR"),
	ESTADOSUNIDOS("Estados Unidos","US"),
	FRANCA("Franca","FR"),
	JAPAO("Japão","JP"),
	PORTUGAL("Portugal","PT");
	
	private String descricao;
	private String sigla;
	
	private Pais(String descricao, String sigla) {
		this.descricao = descricao;
		this.sigla = sigla;
	}
	
	public String getSigla() {
		return sigla;
	}
	
	public String descricao() {
		return descricao;
	}
	
	public static Pais funcaoSigla(String sigla) {
		for (Pais p: Pais.values()) {
			if (p.getSigla().equals(sigla))
				return p;
		}
		return null;
	}
	
}
