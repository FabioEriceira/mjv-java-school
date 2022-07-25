package com.mjv.agualuz.notification.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import com.mjv.agualuz.notification.model.Cadastro;
import com.mjv.agualuz.notification.model.Contrato;
import com.mjv.agualuz.notification.model.Endereco;
import com.mjv.agualuz.notification.model.Pais;
import com.mjv.agualuz.notification.model.Servico;
import com.mjv.agualuz.notification.util.FormatadorUtil;

public class LeitorArquivo {
	public List<Contrato> lerContratosCsv(){ // pega o arquivo lido no método ler, converter em uma lista de contratos para podermos fazer o que quiser com estes contratos
		List<String> conteudo = ler("agua-luz-output.csv");
		List<Contrato> contratos = new ArrayList<Contrato>();
		
		for (String linha : conteudo) {
			
			String[] campos = linha.split(";");
			Contrato con = new Contrato();
			Cadastro cli = new Cadastro();
			Endereco end = new Endereco();
			
			con.setCliente(cli); //amarrando o contrato ao cadastro
			cli.setEndereco(end);
						
			cli.setCpf(FormatadorUtil.formatarCpfCsv(campos[0]));
			cli.setRg(campos[1]);
			cli.setNome(campos[2]);
			cli.setNumeroCelular(campos[3]);
			
			end.setLogradouro(campos[4]);
			end.setNumero(campos[5]);
			end.setComplemento(campos[6]);
			end.setBairro(campos[7]);
			end.setCidade(campos[8]);
			end.setEstado(campos[9]);
			end.setCep(campos[10]);

			con.setProtocolo(Long.parseLong(campos[12]));
			con.setDataHora(FormatadorUtil.formatarDataHora(campos[13],campos[14]));
			con.setServico(Servico.valueOf(campos[15]));
			con.setValor(FormatadorUtil.formatarValorDoubleStringCsv(campos[16]));
			
			contratos.add(con);
		}
		
		return contratos;
	}
	
	public List<Contrato> lerContratosTxt(){ // pega o arquivo lido no método ler, converter em uma lista de contratos para podermos fazer o que quiser com estes contratos
		List<String> conteudo = ler("agua-luz-output.txt");
		List<Contrato> contratos = new ArrayList<Contrato>();
		
		/*
		Locale locale = Locale.getDefault();
		System.out.println(locale);
		
		Locale us = new Locale ("us");
		System.out.println(us);
		Locale.setDefault(us);
		System.out.println(Locale.getDefault());
		*/
		
			
		
		for (String linha : conteudo) {
			Contrato con = new Contrato();
			Cadastro cli = new Cadastro();
			Endereco end = new Endereco();
			
			
			Locale lingua = new Locale(linha.substring(153,155));
			Locale.setDefault(lingua);
			
			cli.setEndereco(end); // amarrando o endereco ao cliente e
			con.setCliente(cli); //amarrando o cliente ao contrato
						
			cli.setCpf(FormatadorUtil.formatarCpf(linha.substring(0,11)));
			cli.setRg(linha.substring(11,21));
			cli.setNome(linha.substring(21,51));
			cli.setNumeroCelular(linha.substring(51,62));
			
			con.setProtocolo(Long.parseLong(linha.substring(155,165)));
			con.setDataHora(FormatadorUtil.formatarDataHoraTxt(linha.substring(165,173),linha.substring(173,177)));
			con.setServico(Servico.funcaoSigla(linha.substring(177,178))); //funcao para retornar o emun através da sigla
			con.setValor(FormatadorUtil.formatarValorDoubleStringTxt(linha.substring(178,186)));
			
			end.setLogradouro(linha.substring(62,82));
			end.setNumero(linha.substring(82,88));
			end.setComplemento(linha.substring(88,98));
			end.setBairro(linha.substring(98,113));
			end.setCidade(linha.substring(113,143).trim());
			end.setEstado(linha.substring(143,145));
			end.setCep(FormatadorUtil.formatarCep(linha.substring(145,153)));
			
			contratos.add(con);
			
		}
		
		return contratos;
	}
	
	
	private List<String> ler(String nomeArquivo) { // aqui o ler ele ler o arquivo e pega o conteudo
		Path filePath = Paths.get("./estudo/mjv-java-school/agua-luz-output", nomeArquivo);
		try {
			List <String> lines = Files.readAllLines(filePath);
			return lines;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
				
		
	}
	
		
}
