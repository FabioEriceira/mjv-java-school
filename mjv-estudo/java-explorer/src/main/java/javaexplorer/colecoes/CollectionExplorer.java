package javaexplorer.colecoes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

/*
 * Esta classe tem a finalidade de explorar
 * particularidades no uso de coleções na linguagem
 * Como: List / Set / Queue / Map
 */
public class CollectionExplorer {
	//Todo o nosso cenário será com base na nossa School
	public static void main(String[] args) {
		//faseAtracao();
		//ordemApresentacao();
		ranking();
	}
	static void faseAtracao() {
		/*
		 * Vamos imaginar que iniciou a fase de inscrição pelo site da MJV
		 */
		
		//PESQUISA A DIFERENÇA ENTRE
		//ArrayList e Vector
		
		List<String> inscritos = new ArrayList();
		inscritos.add("RENATO GONÇALVES");
		inscritos.add("AURI MARTINS");
		inscritos.add("DAVY LUCAS");
		inscritos.add("PRISCILA PASSARO");
		inscritos.add("DIEGO CARDOSO");
		
		//renato por segurança se cadastrou novamente
		inscritos.add("RENATO GONÇALVES");
		
		//A Nicole foi e pediu para o time de TI a Lista de inscritos
		imprimirColecao(inscritos);
		
		//A Nicole se deparou com problemas
		//1 A Lista não está "classificada"
		//Isso é um trabalho para a classe utilitária Collections
		Collections.sort(inscritos);
		System.out.println("\nImprimindo a lista ordenada\n");
		imprimirColecao(inscritos);
		
		//2 o cadastro de renato está duplicado
		/*
		 * esse desenvolvedor back não imaginou que alguém 
		 * poderia se cadastrar mais de uma vez
		 * para fazer alguma validação
		 * mas a linguagem por ela ser TOP DAS GALAXIAS tem um solução
		 * SET Power. 
		 */
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
	static void ordemApresentacao() {
		//tempos se passaram e chegou o grande dia
		//a apresentação, dai a Nicole foi e pediu
		//para os alunos mencionarem quem vai apresentar
		//dai a ordem será definida pelo chat no discord
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
	static void imprimirColecao(Collection colecao) {
		for(Object itemColecao: colecao) {
			System.out.println(itemColecao);
		}
	}
}