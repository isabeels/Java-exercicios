package br.com.residencia;

import java.util.Scanner;

public class DesafiodoBiel {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int a = 0;
		int b = 0;
		int c = 0;

		System.out.println("Digite um valor para a: ");
		a = leia.nextInt();
		System.out.println("Digite um valor para b: ");
		b = leia.nextInt();
		System.out.println("Digite um valor para c: ");
		c = leia.nextInt();
		leia.close();

		c=a;
		a=b;
		b=c;

		System.out.println("O valor de a é:" + a);
		System.out.println("O valor de b é:" + b);

	}
}
