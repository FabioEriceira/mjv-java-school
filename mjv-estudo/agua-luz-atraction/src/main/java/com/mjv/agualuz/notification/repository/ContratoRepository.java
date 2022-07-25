package com.mjv.agualuz.notification.repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.mjv.agualuz.notification.model.Cadastro;
import com.mjv.agualuz.notification.model.Contrato;
import com.mjv.agualuz.notification.model.Endereco;
import com.mjv.agualuz.notification.model.Pais;
import com.mjv.agualuz.notification.model.Servico;
import com.mjv.agualuz.notification.model.TipoNotificacao;

public class ContratoRepository {
	// gerar nosso banco de dados fake
	private List<Contrato> contratos = new ArrayList<Contrato>();
	
	public List<Contrato> listar() {
		Contrato contrato = new Contrato();
		contrato.setServico(Servico.LUZ);
		contrato.getServico().getValor();  // como setamos o valor do serviço, aqui pegamos o valor do serviço

		contrato.setDataHora(LocalDateTime.of(2022,05,07, 15, 21));
		contrato.setProtocolo(1984365L);
		contrato.setNotificacao(TipoNotificacao.SMS);
		
		Cadastro cliente = new Cadastro(); 	// 	instancia o cliente para ter a informacao 
		contrato.setCliente(cliente); 		// 	aonde o cliente está? no contrato, então contrato.setCliente(cliente), 
											//	isto faz a amarracao das informacoes entre o cliente e o cadastro
		cliente.setCpf("007.324.223.21");		// continua colocando as informações para o cadastro
		cliente.setNome("Raimundo Nonato Loureiro Castelo Branco");
		cliente.setRg("33765-5");
		cliente.setNumeroCelular("(11) 99768-1515");
		
		Endereco endereco = new Endereco();
		cliente.setEndereco(endereco); 	//	aonde o endereço está? no cliente, então: cliente.setEndereco(endereco) 
										//	isto faz a amarracao das informacoes entre o endereco e o cliente
		endereco.setBairro("São Sebastião");
		endereco.setCep("07.210.715");
		endereco.setCidade("São Raimundo Nonato");
		endereco.setEstado("Sp");
		endereco.setLogradouro("Rua Sebastião Firmino");
		endereco.setComplemento("AP 210 BL CENTAURO");
		endereco.setNumero("123");
		endereco.setPais(Pais.BRASIL);
		
		contratos.add(contrato);
		return contratos;
	}
	
}
