/*Crie o programa �mini calculadora�, que ap�s ler dois n�meros inteiros
apresenta as opera��es de soma, subtra��o, multiplica��o e divis�o com
eles. Obs.: Trate o maior n�mero poss�vel de erros (ex: opera��es com n�meros
negativos, divis�o por zero, uso de letras, etc).*/

package br.com.residencia;

import java.util.Scanner;

public class Lista1_Minicalculadora {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int a, b, op, soma, sub, div, mult;
		
		System.out.println("Qual opera��o voc� deseja realizar? \n[1]soma\t\t [2]subtra��o\n[3]divis�o\t [4]multiplica��o");
		op = scan.nextInt();
		
		switch (op) {
		
		case 1:
			
			System.out.println ("Digite o primeiro n�mero: ");
			a = scan.nextInt();
			System.out.println("Digite o segundo n�mero: ");
			b = scan.nextInt();
			
			
			soma = a + b;
			
			System.out.println("O resultado de "+a+"+"+b+ " �: "+soma);
			
			break;
			
		case 2:
			System.out.println ("Digite o primeiro n�mero: ");
			a = scan.nextInt();
			System.out.println("Digite o segundo n�mero: ");
			b = scan.nextInt();
			
			sub = a - b;
			
			System.out.println("O resultado de "+a+"-"+b+ " �: "+sub);
			
			break;
			
		case 3:
			System.out.println ("Digite o primeiro n�mero: ");
			a = scan.nextInt();
			System.out.println("Digite o segundo n�mero: ");
			b = scan.nextInt();
			
			while (b == 0) {
				System.out.println("Opera��o Inv�lida. N�o existe divis�o por zero. Repita a opera��o");
				System.out.println ("Digite o primeiro n�mero: ");
				a = scan.nextInt();
				System.out.println("Digite o segundo n�mero: ");
				b = scan.nextInt();
				
			}
			
			div = a / b;
			
			System.out.println("O resultado de "+a+"/"+b+ " �: "+div);
			
			break;
			
		case 4: 
			System.out.println ("Digite o primeiro n�mero: ");
			a = scan.nextInt();
			System.out.println("Digite o segundo n�mero: ");
			b = scan.nextInt();
			
			
			mult = a * b;
			
			System.out.println("O resultado de "+a+"*"+b+ " �: "+mult);
			break;
		}
		
		scan.close();

		
		
	}
}
