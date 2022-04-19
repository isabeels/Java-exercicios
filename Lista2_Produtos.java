/*Um programa "Total de produtos" irá solicitar que o cliente digite quantos
produtos irá comprar. Depois, exibe a mensagem: "Parabéns por comprar x
produtos!", substituindo x pela quantidade.*/

package br.com.residencia;

import java.util.Scanner;

public class Lista2_Produtos {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int qtd;

		System.out.println("Prezado Cliente, digite a quantidade de produto(s) que deseja adquirir:");
		qtd = scan.nextInt();

		while (qtd < 0) {

			System.out.println("Número inválido.");
			System.out.println("Prezado Cliente, digite a quantidade de produto(s) que deseja adquirir:");
			qtd = scan.nextInt();
		}
		scan.close();

		if (qtd == 0) {

			System.out.println("Que pena! Volte sempre!");
		}
		else {
			System.out.println("Parabéns por comprar " + qtd + " produto(s)!");

		}
	}

}
