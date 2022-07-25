package com.mjv.agualuz.notification.model;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

public class Contrato {
	@Getter private Servico servico;
	@Getter @Setter private double valor;
	@Getter @Setter private LocalDateTime dataHora;
	@Getter @Setter private Cadastro cliente;
	@Getter @Setter private long protocolo;
	@Getter @Setter private TipoNotificacao notificacao;
	
	
	public void setServico(Servico servico) {
		this.servico = servico;
		this.valor = servico.getValor();
	}
	
	
	
	
}
