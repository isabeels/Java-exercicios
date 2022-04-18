package br.com.residencia;

import java.util.Scanner;

import java.util.Locale;

public class AreaCirculo {
	
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		Locale.setDefault(Locale.US); //PARA TRANSFORMAR A VIRGULA EM PONTO NO CONSOLE.
		
		double r, area;
		double pi = 3.14159;
		
		System.out.println("Digite o raio do c�rculo: ");
		r = scan.nextDouble();
		scan.close();
		
		area = pi * (Math.pow(r, 2));
		
		System.out.printf("O valor da �rea deste c�rculo �: %.4f", area);
		//para arredondar casas, nesse caso sao 4 decimais.
		// poderia ser escrito tamb�m "%.4f%n" para pular linha.
		// o area vai entrar onde o %.4f est� escrito.
	}

}
