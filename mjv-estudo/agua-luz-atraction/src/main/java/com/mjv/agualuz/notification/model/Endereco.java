package com.mjv.agualuz.notification.model;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Endereco {
	private String logradouro;
	private String numero;
	private String complemento;
	private String bairro;
	private String cidade;
	private String estado;
	private String cep;
	private Pais pais;
	
	
}
