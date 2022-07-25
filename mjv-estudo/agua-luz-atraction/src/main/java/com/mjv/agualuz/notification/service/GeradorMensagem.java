package com.mjv.agualuz.notification.service;

import java.time.format.DateTimeFormatter;

import com.mjv.agualuz.notification.model.Contrato;
import com.mjv.agualuz.notification.model.Servico;
import com.mjv.agualuz.notification.util.FormatadorUtil;

public class GeradorMensagem {
	public void gerar(Contrato contrato) {
		StringBuilder sb = new StringBuilder();
		
		String nome = contrato.getCliente().getNome();
		String cpfFormatado = contrato.getCliente().getCpf();
		Long protocolo = contrato.getProtocolo();
		
		String data = contrato.getDataHora().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		String hora = contrato.getDataHora().format(DateTimeFormatter.ofPattern("HH:mm"));
		Servico servico = contrato.getServico();
		String valor = FormatadorUtil.formatarValor(contrato.getValor());
		String cep = contrato.getCliente().getEndereco().getCep();
		
		sb.append("Senhor(a) "+nome+" cpf de número "+cpfFormatado+", informamos que conforme contrato com protocolo de número "+protocolo+" está"+"\n");
		
		sb.append("agendado para a data/hora "+ data +" / "+hora+ "h a instalação do serviço de "+servico+" com taxa de valor R$ "+valor+ " em sua residência localizada no\n");
		sb.append("endereço abaixo:\n\n");
		sb.append("Logradouro:"+contrato.getCliente().getEndereco().getLogradouro()+", "+contrato.getCliente().getEndereco().getNumero()+ "\n");
		sb.append("Complemento:"+contrato.getCliente().getEndereco().getComplemento()+"\n");
		sb.append("Bairro:"+contrato.getCliente().getEndereco().getBairro()+"\n");
		sb.append("Cidade:"+contrato.getCliente().getEndereco().getCidade().toUpperCase()+"/"+contrato.getCliente().getEndereco().getEstado()+"\n");
		sb.append("Cep:"+cep);
		
		System.out.println(sb.toString());
		
	}
	
}
