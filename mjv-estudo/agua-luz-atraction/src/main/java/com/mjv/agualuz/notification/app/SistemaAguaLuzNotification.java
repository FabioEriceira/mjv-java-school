package com.mjv.agualuz.notification.app;

import java.util.List;
import java.util.Locale;

import com.mjv.agualuz.notification.model.Contrato;
import com.mjv.agualuz.notification.service.GeradorMensagem;
import com.mjv.agualuz.notification.service.LeitorArquivo;

public class SistemaAguaLuzNotification {
	public static void main(String[] args) {
		LeitorArquivo la = new LeitorArquivo();
		/*
		List <Contrato> contratosVindoCsv = la.lerContratosCsv();
		
		GeradorMensagem gm = new GeradorMensagem();
		for (Contrato c: contratosVindoCsv) {
			gm.gerar(c);
		}
		*/
		
				
		List <Contrato> contratosVindoTxt = la.lerContratosTxt();
		GeradorMensagem gm = new GeradorMensagem();
		for (Contrato t: contratosVindoTxt) {
			gm.gerar(t);
		}
		
	}
}
