package br.com.residencia;

import java.util.Scanner;

public class TestandoChar {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		char x;
		
		System.out.println("Digite seu nome e a 1� letra ser� selecionada: ");
		x=sc.next().charAt(0);
		sc.close();
		
		//0 � para pegar a primeira letra.
		//Se quiser a segunda letra, digite 1. 
		//Se quiser a terceira, digite 2. Etc.
		
		System.out.printf("A letra �: %s", x);
		


	}

}
