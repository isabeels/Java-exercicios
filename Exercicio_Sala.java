package br.com.residencia;

import java.util.Scanner;

public class Exercicio_Sala {

	public static void main(String[] args) {

	int num1, num2;

	System.out.println("O primeiro n�mero: ");
	Scanner leia = new Scanner(System.in);
	num1 = leia.nextInt();
	System.out.println("Digite o segundo n�mero: ");
	num2 = leia.nextInt();
	System.out.println("A soma desses numeros �: " + (num1 + num2));
	leia.close();				
	
	}
}
