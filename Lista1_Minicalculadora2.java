package br.com.residencia;

import java.util.Scanner;

public class Lista1_Minicalculadora2 {


	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int a, b, soma, sub, div, mult;

		System.out.println ("Digite o primeiro n�mero: ");
		a = scan.nextInt();
		System.out.println("Digite o segundo n�mero: ");
		b = scan.nextInt();
		scan.close();

		soma = a + b;
		sub = a - b;
		mult = a * b;

		if (b == 0) {

			System.out.println("O resultado de "+a+"+"+b+ " �: "+soma);
			System.out.println("O resultado de "+a+"-"+b+ " �: "+sub);
			System.out.println("O resultado de "+a+"*"+b+ " �: "+mult);
			System.out.println("O resultado de "+a+"/"+b+ " � inv�lido, pois n�o existe divis�o por 0."); 
		}
		else {

			div = a / b;

			System.out.println("O resultado de "+a+"+"+b+ " �: "+soma);
			System.out.println("O resultado de "+a+"-"+b+ " �: "+sub);
			System.out.println("O resultado de "+a+"/"+b+ " �: "+div);
			System.out.println("O resultado de "+a+"*"+b+ " �: "+mult);

		}

	}
}
