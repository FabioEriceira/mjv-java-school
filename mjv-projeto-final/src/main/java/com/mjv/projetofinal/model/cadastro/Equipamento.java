package com.mjv.projetofinal.model.cadastro;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.mjv.projetofinal.enums.TipoEquipamento;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="equipamento")
public class Equipamento {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	public static enum tipoEquipamento {MTB,SPEED};
	@Enumerated(EnumType.STRING)
	@Column (name="tipo_equipamento")
	private TipoEquipamento tipoEquipamento;
	
	private String fabricacao;
	private String marca;
	private String grupo;
	@Column (name="qtd_disponivel") 
	private Integer qtdDisponivel;
	@Column (name="valor_locacao")
	private Double valorLocacao;
	
}
