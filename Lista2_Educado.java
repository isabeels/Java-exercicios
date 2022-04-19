/*O programa "Educado" irá perguntar seu nome, e também como você
gostaria de ser chamado. Depois disso uma saudação para você aparece na
tela.*/

package br.com.residencia;

import java.util.Scanner;

public class Lista2_Educado {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String nome, apelido;
		int opcao;
		
		System.out.println("Qual é o seu nome?");
		nome = scan.next();
		System.out.println("Olá "+nome+ "! Gostaria de ser chamado por algum apelido? [1]Sim ou [2]Não");
		opcao = scan.nextInt();
		
		switch (opcao) {
		
		case 1: 
			System.out.println("Como gostaria de ser chamado?");
			apelido = scan.next();
			System.out.println("Olá, "+apelido+"! Seja bem vindo!");
			scan.close();
			break;
			
		case 2:
			
			System.out.println("Bem vindo, "+nome+ "!");
		
			break;
		}
	}

}
