package br.com.dio;

import br.com.dio.model.Gato;

public class ProgramaJavaIDEEclipse {

	public static void main(String[] args) {
		/*int a =2;
		int b = 3;
		System.out.println("Hello World! " + (a+b));
	*/
		
		Gato gato = new Gato();
		Livros livro = new Livros();
		System.out.println(gato);
		System.out.println(livro);
	}

}

class Livros {
	private String nome;
	private String npag;
}