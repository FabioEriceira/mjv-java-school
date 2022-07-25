package javaexplorer.colecoes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

public class CollectionExplorer2 {
	public static void main(String[] args) {
		//faseAtracao();
		//ordemApresentacao();
		//ranking();
		//mapa();
		mapaColecao();
	}
	
	static void faseAtracao() {
		List<String> inscritos = new ArrayList();
		inscritos.add("RENATO GONÇALVES");
		inscritos.add("AURI MARTINS");
		inscritos.add("DAVY LUCAS");
		inscritos.add("PRISCILA PASSARO");
		inscritos.add("DIEGO CARDOSO");
		
		
		//renato por segurança se cadastrou novamente
		inscritos.add("RENATO GONÇALVES");
		Collections.sort(inscritos);
		
		imprimirColecao(inscritos);
		
		setPower(inscritos);
	}
	static void setPower(List<String> inscritos) {
		//pesquisa sobre HashSet e TreeSet
		Set<String> inscritosArrumado = new TreeSet();
		for(String inscrito: inscritos) {
			
			boolean adicionei = inscritosArrumado.add(inscrito);
			String adicionou = adicionei?"Adicionei": "NÃO Adicionei";
			System.out.println(adicionou + " o inscrito " + inscrito);
		}
		System.out.println("\nimprimindo os inscritos sem repetição\n");
		imprimirColecao(inscritosArrumado);
	}
	static void imprimirColecao(Collection colecao) {
		for(Object itemColecao: colecao) {
			System.out.println(itemColecao);
		}
	}
	static void ordemApresentacao() {
		//tempos se passaram e chegou o grande dia
		//a apresentação, dai a Nicole foi e pediu
		//para os alunos mencionarem quem vai apresentar
		//dai a ordem será definida pelo chat no discord
		//PriorityQueue
		Queue<String> alunos = new LinkedList<String>();
		
		alunos.add("DAVY LUCAS");
		alunos.add("PRISCILA PASSARO");
		alunos.add("RENATO GONÇALVES");
		alunos.add("AURI MARTINS");
		
		imprimirColecao(alunos);
		
		System.out.println("Chamando próximo da fila para a apresentação");
		String selecionado = alunos.poll();
		System.out.println( selecionado + " foi selecionado para a apresetação");
		
		System.out.println("Gleyson pergunta para a Nicole quantos ainda faltam");
		imprimirColecao(alunos);
		
		System.out.println("Gleyson pergunta para a Nicole quem é o próximo da fila");
		System.out.println( alunos.peek() + " é o próximo da fila");
		
		alunos.add("DIEGO CARDOSO");
		imprimirColecao(alunos);
		
		
		//veja a diferença da interface Queue para Deque
		
	}
	static void mapaColecao() {
		
		List<String> municipios = new ArrayList<String>();
		municipios.add("TERESINA");
		municipios.add("ESPERANTIA");
		
		Map<String, List> estados = new HashMap<String, List>();
		estados.put("PI", municipios);
		
		
		List<String> municipiosPorEstado = estados.get("PI");
		for(String m: municipiosPorEstado) {
			System.out.println(m);
		}
		
	}
	static void mapa() {
		Map<String, String> simbolosMonetarios = new HashMap<String, String>();
		simbolosMonetarios.put("R$", "REAL");
		simbolosMonetarios.put("$", "DOLAR");
		
		String simboloLocalizado = simbolosMonetarios.get("DOLAR");
		
		System.out.println(simboloLocalizado);
		
	}
	static void ranking() {
		//chegou a hora da verdade
		//a Nicole me pediu para definir o Ranking dos alunos que apresentaram o projeto
		//como eu não gostaria de criar um objeto somente devido +1 atributo
		//eu resolvi o recurso do map para este finalidade
		
		//esta foi a minha analise
		/*
		 * 1 - DAVY LUCAS
		 * 2 - DIEGO CARDOSO
		 * 3 - PRISCILA PASSARO
		 * 4 - AURI MARTINS
		 * 5 - RENATO GONÇALVES 
		 */
		
		Map<Integer, String> ranking = new HashMap();
		ranking.put(1, "DAVY LUCAS");
		ranking.put(5, "RENATO GONÇALVES");
		ranking.put(3, "PRISCILA PASSARO");
		ranking.put(2, "DIEGO CARDOSO");
		ranking.put(4, "AURI MARTINS");
		
		//imprimindo a listagem contendo o ranking
		for (Map.Entry<Integer, String> entry : ranking.entrySet()) {
	        System.out.println("Ranking: " + entry.getKey() + "° - Aluno: " + entry.getValue());
	    }
		
		//Agora quando o time de recrutamento precisar localizar um aluno 
		//basta informar a sua posição no ranking
		
		String alunoRanking2 = ranking.get(2);
		System.out.println(alunoRanking2);
		
	}
}
