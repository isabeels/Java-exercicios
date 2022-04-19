/*O programa “Riuju” escreve na tela o resultado das expressões abaixo:
a. 2 + 3 - 5 * 8 - 4 + 354 - 521 + 7 * 66*/

package br.com.residencia;

public class Lista1_Riuju {

	public static void main(String[] args) {

		int resultado1, resultado2;

		resultado1 = 2 + 3 - 5 * 8 - 4 + 354 - 521 + 7 * 66;
		resultado2 = 2 + 7 * (14 - 21) + 28 * 3 * 42 + 740 - (156 + 4 + 40) * 9;

		System.out.println("O resultado da expressão 1: 2 + 3 - 5 * 8 - 4 + 354 - 521 + 7 * 66 é: "+resultado1);
		System.out.println("O resultado da expressão 2: 2 + 7 * (14 - 21) + 28 * 3 * 42 + 740 - (156 + 4 + 40) * 9  é: "+resultado2);
	}

}
