/*O �Programa de fidelidade� solicitou a cria��o do sistema �Ver os seus
pontos�, onde o cliente poder� consultar seu saldo de pontos. O cliente ir�
digitar um n�mero inteiro correspondente aos seus cupons. Cada cupom
corresponde a 1 ponto.
 */
package br.com.residencia;

import java.util.Scanner;

public class Lista3_Fidelidade {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int qtd;

		System.out.println("Consulte seu saldo de pontos!\n Digite a quantidade de cupons que voc� possui:");
		qtd = scan.nextInt();
		scan.close();

		if (qtd<=0) {			
			System.out.println("Voc� n�o possui saldo conosco! :( ");
		}
		else {
			System.out.println("Voc� possui "+qtd+ " pontos!");
		}
	}

}
