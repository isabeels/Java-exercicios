package br.com.residencia;

public class Lista2_MaisqueMil {

	public static void main(String[] args) {

		int soma, resultado1, resultado2, resultado3, resultado4;


		soma = 1004+1008+1012+1016;

		resultado1 = soma - 2;
		resultado2 = resultado1 - 3;
		resultado3 = resultado2 - 5;
		resultado4 = resultado3 - 7;

		System.out.println("O valor "+ soma+" menos o n�mero primo 2 �: "+ resultado1);
		System.out.println("O valor "+soma+" menos o n�mero primo 3 �: "+ resultado2);
		System.out.println("O valor "+soma+" menos o n�mero primo 5 �: "+ resultado3);
		System.out.println("O valor "+soma+" menos o n�mero primo 7 �: "+ resultado4);
	}

}
