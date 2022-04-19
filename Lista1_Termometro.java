/*O programa “termômetro” lê uma temperatura em graus celsius, e devolve
sua equivalência na escala fahrenheit. (Use: F = C * 1, 8 + 32)*/

package br.com.residencia;

import java.util.Scanner;

public class Lista1_Termometro {

	public static void main(String[] args) {

	double c, f;
		
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Digite uma temperatura em Celsius: ");
	c = scan.nextDouble();
	scan.close();
	
	f = (c * 1.8) + 32;
	
	System.out.println("Esta temperatura em Fahrenheit é: " + f);

	}

}
