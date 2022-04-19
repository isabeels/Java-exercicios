/*O “Programa de fidelidade” solicitou a criação do sistema “Ver os seus
pontos”, onde o cliente poderá consultar seu saldo de pontos. O cliente irá
digitar um número inteiro correspondente aos seus cupons. Cada cupom
corresponde a 1 ponto.
 */
package br.com.residencia;

import java.util.Scanner;

public class Lista3_Fidelidade {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int qtd;

		System.out.println("Consulte seu saldo de pontos!\n Digite a quantidade de cupons que você possui:");
		qtd = scan.nextInt();
		scan.close();

		if (qtd<=0) {			
			System.out.println("Você não possui saldo conosco! :( ");
		}
		else {
			System.out.println("Você possui "+qtd+ " pontos!");
		}
	}

}
