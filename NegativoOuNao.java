/* Fazer um programa para ler um n�mero inteiro,
e depois dizer se este n�mero � negativo ou n�o.*/

package br.com.residencia;

import java.util.Scanner;

public class NegativoOuNao {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n;
		
		System.out.println("Digite um n�mero inteiro: ");
		n=scan.nextInt();
		scan.close();
		
		if (n<0) {
			System.out.println("� um n�mero negativo.");
		} else {
			System.out.println("� um n�mero positivo.");
		}
		
		
	}

}
