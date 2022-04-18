/* Fazer um programa para ler um número inteiro,
e depois dizer se este número é negativo ou não.*/

package br.com.residencia;

import java.util.Scanner;

public class NegativoOuNao {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n;
		
		System.out.println("Digite um número inteiro: ");
		n=scan.nextInt();
		scan.close();
		
		if (n<0) {
			System.out.println("É um número negativo.");
		} else {
			System.out.println("É um número positivo.");
		}
		
		
	}

}
