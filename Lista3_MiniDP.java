package br.com.residencia;

import java.util.Scanner;

public class Lista3_MiniDP {

	public static void main (String[] args) {

		int horasTrabalho;
		double valorHora, vlBruto, vlLiquido, inss;

		Scanner scan = new Scanner(System.in);

		System.out.println("Quantidade de horas trabalhadas: ");
		horasTrabalho = scan.nextInt();
		System.out.println("Valor da hora de trabalho: ");
		valorHora = scan.nextDouble();
		scan.close();

		vlBruto = horasTrabalho * valorHora;

		if (vlBruto <= 1212) {
			inss = 0.075;
			vlLiquido = vlBruto - (vlBruto * inss);
			System.out.println("Salário Bruto: "+ vlBruto);
			System.out.println("Valor de desconto do INSS: " + inss);
			System.out.println("Salário líquido: "+ vlLiquido);
		} 
		
		else{
			inss = 0.11;
			vlLiquido = vlBruto - (vlBruto * inss);
			System.out.println("Salário Bruto: "+ vlBruto);
			System.out.println("Valor de desconto do INSS: " + inss);
			System.out.println("Salário líquido: "+ vlLiquido);
		}
	}

}
