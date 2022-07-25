package com.mjv.agualuz.notification.model;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Cadastro {
	private String cpf;
	private String nome;
	private String rg;
	private String numeroCelular;
	private Pais pais;
	private Endereco endereco;
	
}
