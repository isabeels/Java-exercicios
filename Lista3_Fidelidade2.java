package br.com.residencia;

import java.util.Scanner;

public class Lista3_Fidelidade2 {

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
			System.out.println("Seu saldo triplicou e agora valem "+qtd*3+ " pontos!");
		}
	}

}