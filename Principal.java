package br.com.residencia;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		System.out.println("Hello World!");
		System.out.println("\tHello World!");
		System.out.println("\nHello World!");
		System.out.println("\\Hello World!");
		System.out.println("\'Hello World!"); //Para botar aspas simples precisamos botar a contra barra.
		System.out.println("\"Hello World!\""); //Mesmo caso de cima para aspas duplas.
		System.out.println("Então eu disse pela primeira vez no Java: "+"\"olá mundo!\"");

		String nome, sobrenome;
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite seu nome:");
		nome = leia.next();
		System.out.println("Digite seu sobrenome:");
		sobrenome = leia.next();
		for (int i = 0; i <= 5; i++) {
			System.out.println("\n");
		}
		System.out.println("Meu nome é " + nome + " " + sobrenome);	
		leia.close();

		

	
	
	
	
	
	
	}

}

