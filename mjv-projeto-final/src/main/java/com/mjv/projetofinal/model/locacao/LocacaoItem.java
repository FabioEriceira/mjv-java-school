package com.mjv.projetofinal.model.locacao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="locacao_item")
public class LocacaoItem {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column (name="equipamento_id")
	private Integer equipamentoId;
	
	@Column (name="qtd_dias_locacao")
	private Integer qtdDiasLocacao;
	 
	private Double subtotal;
}
