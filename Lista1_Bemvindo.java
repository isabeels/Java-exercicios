package br.com.residencia;

import java.util.Scanner;

public class Lista1_Bemvindo {


	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		String nome, apelido;
		String sobrenome;
		int resposta;

		System.out.println("Qual � o seu nome?");
		nome = leia.next();
		System.out.println("Qual � o seu sobrenome?");
		sobrenome = leia.next();
		System.out.println("Voc� gostaria de ser chamado por algum apelido? Digite [1] para sim e [2] para n�o");
		resposta = leia.nextInt();

				while(resposta < 1 || resposta > 2 ) {
					System.out.println("Resposta inv�lida!");
					System.out.println("Voc� gostaria de ser chamado por algum apelido? Digite [1] para sim e [2] para n�o");
					resposta = leia.nextInt(); }
				
		switch(resposta) 
		{	
		case 1: 
			System.out.println("Qual apelido voc� deseja ser chamado?");
			apelido = leia.next();
			leia.close();
			System.out.println("Ol�, " + apelido + "! Seja bem vindo ao mundo da programa��o!");
			break;


		case 2:
			System.out.println("Ol�, "+ nome +" "+sobrenome + " seja bem vindo!");
			break;

		}	
	
	}
}
