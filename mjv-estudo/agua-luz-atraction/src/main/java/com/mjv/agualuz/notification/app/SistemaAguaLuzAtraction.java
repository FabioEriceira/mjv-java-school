package com.mjv.agualuz.notification.app;

import java.util.List;

import com.mjv.agualuz.notification.model.Contrato;
import com.mjv.agualuz.notification.repository.ContratoRepository;
import com.mjv.agualuz.notification.service.GeradorArquivo;

public class SistemaAguaLuzAtraction {
	public static void main(String[] args) {
		
		ContratoRepository rep = new ContratoRepository();
		List<Contrato> contratos = rep.listar();
		
		GeradorArquivo ga = new GeradorArquivo();
		ga.csv(contratos);
		ga.txt(contratos);
	}
}
