package javaexplorer.arrays;

import java.util.HashSet;
import java.util.Set;

public class ArraysExplorer {
	public static void main(String[] args) {
		Set <String> alunos = new HashSet<String>();
		
		System.out.println(alunos.add("GLEYSON"));
		alunos.add("ARAMIS");
		
		System.out.println(alunos.size());
		        
        alunos.remove(1);
        
        for(String aluno:alunos) {
        	System.out.println(aluno);
        }
        System.out.println(alunos.size());
        
        alunos.add("MARCOS");
        alunos.add( "JULIA");
        System.out.println(alunos.add("GLEYSON"));
        
        for(String aluno:alunos) {
        	System.out.println(aluno);
        }
        System.out.println(alunos.size());
		
	}
}
