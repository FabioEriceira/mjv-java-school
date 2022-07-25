package pacote20220414;

import java.io.File;

public class FileTeste {
	public static void main(String[] args) {
		
		File file = new File("file.txt");
		
		System.out.println("Nome do arquivo: " + file.getName());
		System.out.println("Caminho completo do arquivo: "+file.getAbsolutePath());
		System.out.println("Arquivo existe:" + file.exists());
		
		if (file.exists()) {
			System.out.println("É gravável: "+file.canWrite());
			System.out.println("É legível: "+file.canRead());
			System.out.println("É um diretório: "+file.isDirectory());
			System.out.println("Tamanho do arquivo em bytes: "+file.length());
		}
		
	}
}
