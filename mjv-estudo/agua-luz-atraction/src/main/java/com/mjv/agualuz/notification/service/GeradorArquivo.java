package com.mjv.agualuz.notification.service;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Locale;

import com.mjv.agualuz.notification.model.Cadastro;
import com.mjv.agualuz.notification.model.Contrato;
import com.mjv.agualuz.notification.model.Endereco;
import com.mjv.agualuz.notification.util.FormatadorUtil;
import com.mjv.agualuz.notification.util.TextoUtil;

public class GeradorArquivo {
	public void csv(List<Contrato> contratos) {
		
		StringBuilder sb = new StringBuilder();
		
		for (Contrato c : contratos) {
			Cadastro cad = c.getCliente();
			Endereco end = c.getCliente().getEndereco();
						
			sb.append(cad.getCpf()+";");
			sb.append(cad.getRg()+";");
			sb.append(cad.getNome()+";");
			sb.append(cad.getNumeroCelular()+";");
			
			sb.append(end.getLogradouro()+";");
			sb.append(end.getNumero()+";");
			sb.append(end.getComplemento()+";");
			sb.append(end.getBairro()+";");
			sb.append(end.getCidade()+";");
			sb.append(end.getEstado()+";");
			sb.append(end.getCep()+";");
			sb.append(end.getPais().getDescricao()+";");

			sb.append(c.getProtocolo()+";");
			sb.append(c.getDataHora().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))+";");
			sb.append(c.getDataHora().format(DateTimeFormatter.ofPattern("HH:mm"))+";");
			sb.append(c.getServico()+";");
			sb.append(FormatadorUtil.formatarValor(c.getValor())+";");
			sb.append(c.getNotificacao());
			
			System.out.println(sb.toString());
			
			escrever(sb.toString(),"agua-luz-output.csv");
			
		}
	}
	
	public void txt(List<Contrato> contratos) {
		StringBuilder sb = new StringBuilder();
		
		for (Contrato c : contratos) {
			
			Cadastro cad = c.getCliente();
			Endereco end = c.getCliente().getEndereco();
			
			sb.append(cad.getCpf().replace(".", ""));
			sb.append(String.format("%-10s",cad.getRg()));
			sb.append(TextoUtil.ajustar(cad.getNome(), 30).toUpperCase());
			sb.append(cad.getNumeroCelular().replaceAll("[\\D]",""));
			sb.append(TextoUtil.ajustar(end.getLogradouro().toUpperCase(), 20));
			sb.append(String.format("%06d", Integer.parseInt(end.getNumero())));
			sb.append(TextoUtil.ajustar(end.getComplemento(),10));
			sb.append(TextoUtil.ajustar(end.getBairro().toUpperCase(),15));
			sb.append(TextoUtil.ajustar(end.getCidade().toUpperCase(),30));
			sb.append(end.getEstado().toUpperCase());
			sb.append(end.getCep().replaceAll("[\\D]",""));
			sb.append(end.getPais().getSigla());
			sb.append(String.format("%010d",c.getProtocolo()));
			sb.append(c.getDataHora().format(DateTimeFormatter.ofPattern("yyyyMMdd")));
			sb.append(c.getDataHora().format(DateTimeFormatter.ofPattern("HHmm")));
			sb.append(c.getServico().getSigla());
			sb.append(String.format("%,09.2f",c.getServico().getValor()).replace(",", ""));
			sb.append(c.getNotificacao().getNotificacao());
			
			System.out.println(sb.toString());
			
			escrever(sb.toString(),"agua-luz-output.txt");
		}
	}
	
	public void escrever(String conteudo, String nomeArquivo) {
		File dir = new File("./estudo/mjv-java-school/agua-luz-output");
		dir.mkdirs(); // cria o diretorio
		
		Path path = Paths.get(dir.getAbsolutePath(),nomeArquivo);
		
		try {
			Files.write(path, conteudo.getBytes(StandardCharsets.UTF_8));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
}
