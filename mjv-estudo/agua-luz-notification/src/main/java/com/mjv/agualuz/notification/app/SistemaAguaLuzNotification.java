package com.mjv.agualuz.notification.app;

import java.time.LocalDateTime;

import com.mjv.agualuz.notification.model.Cadastro;
import com.mjv.agualuz.notification.model.Contrato;
import com.mjv.agualuz.notification.model.Endereco;
import com.mjv.agualuz.notification.service.GeradorMensagem;

public class SistemaAguaLuzNotification {
	public static void main(String[] args) {
		
		Contrato contrato = new Contrato();
		contrato.setServico("Água");
		contrato.setValor(127.33);
		contrato.setDataHora(LocalDateTime.of(2022,02,21, 16, 00));
		contrato.setProtocolo(2022025687L);
		
		Cadastro cliente = new Cadastro(); 	// 	instancia o cliente para ter a informacao 
		contrato.setCliente(cliente); 		// 	aonde o cliente está? no contrato, então contrato.setCliente(cliente), 
											//	isto faz a amarracao das informacoes entre o cliente e o cadastro
		cliente.setCpf("23476598727");		// continua colocando as informações para o cadastro
		cliente.setNome("Gleyson Sampaio");
		
		Endereco endereco = new Endereco();
		cliente.setEndereco(endereco); 	//	aonde o endereço está? no cliente, então: cliente.setEndereco(endereco) 
										//	isto faz a amarracao das informacoes entre o endereco e o cliente
		endereco.setBairro("Santo Antonio");
		endereco.setCep("27310657");
		endereco.setCidade("São Paulo");
		endereco.setEstado("SP");
		endereco.setLogradouro("Rua das Marias");
		endereco.setComplemento("Ap 207, Bloco C");
		endereco.setNumero("243");
 		
		// System.out.println(contrato.getProtocolo());
		// System.out.println(contrato.getCliente().getNome());
		// System.out.println(contrato.getCliente().getEndereco().getBairro());
		
		GeradorMensagem gm = new GeradorMensagem();
		gm.gerar(contrato);
	}
}
