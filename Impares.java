/*Leia um valor inteiro X (1 <= X <= 1000). 
 Em seguida mostre os ímpares de 1 até X, um valor por linha, 
 inclusive o X, se for o caso.*/

package br.com.residencia;

import java.util.Scanner;

public class Impares {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int x, i;
		
		System.out.println("Digite um valor inteiro entre 1 e 1000: ");
		x = scan.nextInt();
		scan.close();
		
		System.out.println("De 1 até "+x+" são ímpares: ");
		for (i=1; i<=x; i++) {
			if(i%2 != 0) {
				System.out.println(i);
			}
		}

	}

}
