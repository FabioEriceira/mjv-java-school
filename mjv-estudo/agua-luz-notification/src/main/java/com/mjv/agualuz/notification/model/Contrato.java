package com.mjv.agualuz.notification.model;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Contrato {
	private String servico;
	private double valor;
	private LocalDateTime dataHora;
	private Cadastro cliente;
	private long protocolo;
}
