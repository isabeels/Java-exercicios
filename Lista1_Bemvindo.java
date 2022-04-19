package br.com.residencia;

import java.util.Scanner;

public class Lista1_Bemvindo {


	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		String nome, apelido;
		String sobrenome;
		int resposta;

		System.out.println("Qual é o seu nome?");
		nome = leia.next();
		System.out.println("Qual é o seu sobrenome?");
		sobrenome = leia.next();
		System.out.println("Você gostaria de ser chamado por algum apelido? Digite [1] para sim e [2] para não");
		resposta = leia.nextInt();

				while(resposta < 1 || resposta > 2 ) {
					System.out.println("Resposta inválida!");
					System.out.println("Você gostaria de ser chamado por algum apelido? Digite [1] para sim e [2] para não");
					resposta = leia.nextInt(); }
				
		switch(resposta) 
		{	
		case 1: 
			System.out.println("Qual apelido você deseja ser chamado?");
			apelido = leia.next();
			leia.close();
			System.out.println("Olá, " + apelido + "! Seja bem vindo ao mundo da programação!");
			break;


		case 2:
			System.out.println("Olá, "+ nome +" "+sobrenome + " seja bem vindo!");
			break;

		}	
	
	}
}
