package br.com.residencia;

import java.util.Scanner;

public class Lista1_Minicalculadora2 {


	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int a, b, soma, sub, div, mult;

		System.out.println ("Digite o primeiro número: ");
		a = scan.nextInt();
		System.out.println("Digite o segundo número: ");
		b = scan.nextInt();
		scan.close();

		soma = a + b;
		sub = a - b;
		mult = a * b;

		if (b == 0) {

			System.out.println("O resultado de "+a+"+"+b+ " é: "+soma);
			System.out.println("O resultado de "+a+"-"+b+ " é: "+sub);
			System.out.println("O resultado de "+a+"*"+b+ " é: "+mult);
			System.out.println("O resultado de "+a+"/"+b+ " é inválido, pois não existe divisão por 0."); 
		}
		else {

			div = a / b;

			System.out.println("O resultado de "+a+"+"+b+ " é: "+soma);
			System.out.println("O resultado de "+a+"-"+b+ " é: "+sub);
			System.out.println("O resultado de "+a+"/"+b+ " é: "+div);
			System.out.println("O resultado de "+a+"*"+b+ " é: "+mult);

		}

	}
}
