
package br.com.residencia;

import java.util.Scanner;

public class Lista3_alcool70 {

	public static void main(String[] args) {
		
		double capacidade;
		double volumeAlcool;
		double volumeGel;
		
		System.out.println("Laboratório de Química");
		System.out.println("Digite a capacidade total em mL do recipiente: ");
		
		Scanner leia = new Scanner(System.in);
		
		capacidade = leia.nextDouble();
		
	    volumeAlcool = capacidade * 0.7;
	    		
		volumeGel = capacidade - volumeAlcool;
		
		System.out.println("O volume total de álcool a ser utilizado é de: " + volumeAlcool + " mL");
		System.out.println("O volume total de gel a ser utilizado é de: " + volumeGel+ "mL");
		leia.close();
}
}
