/* Ler um n�mero inteiro e dizer se este n�mero � par ou �mpar*/

package br.com.residencia;

import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int i;
	
		System.out.println("Digite um n�mero inteiro: ");
		i = scan.nextInt();
		scan.close();
		
		if (i%2==0) {
			System.out.println("O n�mero � par!");
		} else {
			System.out.println("O n�mero � �mpar!");
		}

	}

}
