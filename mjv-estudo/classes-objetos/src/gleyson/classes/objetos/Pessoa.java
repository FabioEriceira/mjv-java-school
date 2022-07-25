package gleyson.classes.objetos;

public class Pessoa {
	String nome;
	String cpf;
	String endereco;
	String bairro;
	
	Pessoa(String cpf, String nome) {
		this.cpf = cpf;
		
	}
	
	Pessoa(String cpf) {
		this (cpf,"B");
	}
	
	
	
}
