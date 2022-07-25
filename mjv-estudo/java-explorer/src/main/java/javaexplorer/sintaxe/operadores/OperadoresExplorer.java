package javaexplorer.sintaxe.operadores;

public class OperadoresExplorer {
	public static void main(String[] args) {
		//exemploOperadorUnario();
		exemploOperadorLogico();
	}
	static void exemploOperadorLogico() {
		int numero1=5;
		int numero2=3;
		
		if(numero1 > 5 && numero2<5) {
			System.out.println("as duas condições são verdadeiras");
		}
		if(numero1 > 5 || numero2<5) {
			System.out.println("uma das condições é verdadeira");
		}
		System.out.println("finalizar");
	}
	static void exemploOperadorUnario() {
		int numero = 10;
		
		numero = -numero;
		//System.out.println(numero);
	
		numero = -numero;
		//System.out.println(numero);
		
		int valor = 5;
		
		//valor = valor +1;
		//valor++;
		System.out.println(++valor);//pre / pos incremento
		System.out.println(--valor);
		
		boolean verdadeira = false;
		
		System.out.println(!verdadeira);
	
	}
}
