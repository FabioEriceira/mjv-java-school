package com.mjv.agualuz.notification.model;

import lombok.Getter;

public enum TipoNotificacao {

	SMS("S"),
	WHATS("W");
	
	@Getter private String notificacao;
	private TipoNotificacao (String notificacao) {
		this.notificacao = notificacao;
		
	}
}
