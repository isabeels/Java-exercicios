/*Crie o programa “mini calculadora”, que após ler dois números inteiros
apresenta as operações de soma, subtração, multiplicação e divisão com
eles. Obs.: Trate o maior número possível de erros (ex: operações com números
negativos, divisão por zero, uso de letras, etc).*/

package br.com.residencia;

import java.util.Scanner;

public class Lista1_Minicalculadora {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int a, b, op, soma, sub, div, mult;
		
		System.out.println("Qual operação você deseja realizar? \n[1]soma\t\t [2]subtração\n[3]divisão\t [4]multiplicação");
		op = scan.nextInt();
		
		switch (op) {
		
		case 1:
			
			System.out.println ("Digite o primeiro número: ");
			a = scan.nextInt();
			System.out.println("Digite o segundo número: ");
			b = scan.nextInt();
			
			
			soma = a + b;
			
			System.out.println("O resultado de "+a+"+"+b+ " é: "+soma);
			
			break;
			
		case 2:
			System.out.println ("Digite o primeiro número: ");
			a = scan.nextInt();
			System.out.println("Digite o segundo número: ");
			b = scan.nextInt();
			
			sub = a - b;
			
			System.out.println("O resultado de "+a+"-"+b+ " é: "+sub);
			
			break;
			
		case 3:
			System.out.println ("Digite o primeiro número: ");
			a = scan.nextInt();
			System.out.println("Digite o segundo número: ");
			b = scan.nextInt();
			
			while (b == 0) {
				System.out.println("Operação Inválida. Não existe divisão por zero. Repita a operação");
				System.out.println ("Digite o primeiro número: ");
				a = scan.nextInt();
				System.out.println("Digite o segundo número: ");
				b = scan.nextInt();
				
			}
			
			div = a / b;
			
			System.out.println("O resultado de "+a+"/"+b+ " é: "+div);
			
			break;
			
		case 4: 
			System.out.println ("Digite o primeiro número: ");
			a = scan.nextInt();
			System.out.println("Digite o segundo número: ");
			b = scan.nextInt();
			
			
			mult = a * b;
			
			System.out.println("O resultado de "+a+"*"+b+ " é: "+mult);
			break;
		}
		
		scan.close();

		
		
	}
}
