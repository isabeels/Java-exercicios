/*O programa �Tempo de vida� ir� imprimir a soma das idades de todos os
colegas da sua equipe (6 pessoas). Pergunte a cada um a idade e n�o
esque�a a sua! Depois fa�a a atribui��o direta da express�o em uma
vari�vel inteira.*/

package br.com.residencia;

import java.util.Scanner;

public class Lista1_TempoVida {

	public static void main(String[] args) {
		
	Scanner leia = new Scanner(System.in);
	int idade[] = new int[7];
	int i;
	int resultado=0; 
	
	for (i=0;i<7; i++) {
		
		if(i!=6){
			System.out.println("Idade do colega " +i+ ":");
			
		}else{
			System.out.println("Qual a sua idade?");
		}
		
		leia.close();
		idade[i] = leia.nextInt();
		resultado += idade[i];
	}
	
	System.out.println("A soma das idades �:" + resultado);
	
	
	}

}
