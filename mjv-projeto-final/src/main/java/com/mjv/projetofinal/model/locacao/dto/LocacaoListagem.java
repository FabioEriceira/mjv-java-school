package com.mjv.projetofinal.model.locacao.dto;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class LocacaoListagem {

	private Integer id;
	private java.math.BigDecimal subtotal;
	private String cliente;
	private java.sql.Date devolucao;
	private java.sql.Date retirada;
	private java.math.BigDecimal valor;
	
	
}

	
	
	

