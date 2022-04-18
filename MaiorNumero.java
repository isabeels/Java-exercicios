package br.com.residencia;

import java.util.Scanner;

public class MaiorNumero {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite três números inteiros:");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if (a > b && a > c) {
		System.out.println("Maior = " + a);
		} else if (b > c) {
		System.out.println("Maior = " + b);
		} else {
		System.out.println("Maior = " + c);
		}
		sc.close();
	}

}
