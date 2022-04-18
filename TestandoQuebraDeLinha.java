package br.com.residencia;

import java.util.Scanner;

public class TestandoQuebraDeLinha {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String logradouro, bairro, cidade, estado;
		int cep;

		System.out.println("Digite seu endereço na ordem: Logradouro, Bairro, Cidade, Estado e CEP ");
		
		logradouro = sc.nextLine();
		bairro = sc.nextLine();
		cidade = sc.nextLine();
		estado = sc.nextLine();
		cep = sc.nextInt();
		sc.close();
		
		System.out.printf("Seu endereço é: %s, %s, %s, %s, %d", logradouro, bairro, cidade, estado, cep);
	}

}
