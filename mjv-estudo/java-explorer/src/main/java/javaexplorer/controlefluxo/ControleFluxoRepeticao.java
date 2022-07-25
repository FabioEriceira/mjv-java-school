package javaexplorer.controlefluxo;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ControleFluxoRepeticao {
	public static void main(String[] args) {
		//exemploBreakContinue();
		//exemploWhile();
		//exemploDoWhile();
		System.out.println(valorAleatorio());
	}
	static void exemploDoWhile() {
		System.out.println("Discando...");
		
		do {
			//excutando repetidas vezes até alguém atender
			System.out.println("Telefone tocando");
		
		}while(tocando());
		
		System.out.println("Alô !!!");
	}
	private static boolean tocando() {
		boolean atendeu = new Random().nextInt(3)==1;
		System.out.println("Atendeu? " + atendeu);
		//negando o ato de continuar tocando
		return ! atendeu;
	}
	static void exemploWhile() {
		double mesada = 50.0;
        while(mesada>0) {
            Double valorDoce = valorAleatorio();
            if(valorDoce > mesada)
                valorDoce = mesada;

            System.out.println("Doce do valor: " + valorDoce + " Adicionado no carrinho");
            mesada = mesada - valorDoce;
        }
        System.out.println("Mesada:" + mesada);
        System.out.println("Joãozinho gastou toda a sua mesada em doces");
        
	}
	
	static double valorAleatorio() {
		return ThreadLocalRandom.current().nextDouble(1800, 2200);
	}
	static void exemploBreakContinue() {
		for(int x = 1; x<=5; x++) {
			if(x==3) {
				//break;
				continue;
			}
			System.out.println(x);
		}
	}
	
	
}
