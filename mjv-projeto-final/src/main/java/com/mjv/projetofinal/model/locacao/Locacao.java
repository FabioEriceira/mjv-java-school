package com.mjv.projetofinal.model.locacao;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="locacao")
public class Locacao {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column (name="data_retirada")
	@DateTimeFormat(pattern="dd-MM-yyyy")
	private LocalDateTime dataRetirada;
	
	@Column (name="data_devolucao")
	@DateTimeFormat(pattern="dd-MM-yyyy")
	private LocalDateTime dataDevolucao;
	
	@JoinColumn(name="cliente_id")
	private Integer clienteId;
	
	@Column (name="valor_final")
	private Double valorFinal;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "locacao_id")
	private List<LocacaoItem> itens;
}
