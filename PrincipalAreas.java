package aulapratica;

import java.util.Scanner;

public class PrincipalAreas {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Retangulo r1 = new Retangulo();

		System.out.println("Digite a base do retangulo: ");
		r1.base = sc.nextDouble();
		
		System.out.println("Digite a altura do retangulo: ");
		r1.altura = sc.nextDouble();
		
		System.out.println("A área do retangulo é: "+ r1.calcularArea());

	}

}
