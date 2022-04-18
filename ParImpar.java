/* Ler um número inteiro e dizer se este número é par ou ímpar*/

package br.com.residencia;

import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int i;
	
		System.out.println("Digite um número inteiro: ");
		i = scan.nextInt();
		scan.close();
		
		if (i%2==0) {
			System.out.println("O número é par!");
		} else {
			System.out.println("O número é ímpar!");
		}

	}

}
