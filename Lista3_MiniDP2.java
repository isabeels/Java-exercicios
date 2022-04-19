/*O �mini DP� aumentou seus c�lculos. Agora, considera a jornada de
trabalho semanal de um funcion�rio, que � de 40 horas. O funcion�rio que
trabalhar mais de 40 horas receber� hora extra, cujo c�lculo � o valor da
hora regular com um acr�scimo de 50%. Considerando que o m�s possui 4
semanas exatas, e que a entrada de horas ser� um valor maior que a
jornada normal.
a. Sal�rio base (valor da hora * horas normais)
b. Valor de horas extras
c. Valor do desconto para o INSS
d. Sal�rio l�quido (Sal�rio base + horas extras � desconto INSS)
e. Imprimir o contracheque do funcion�rio.*/

package br.com.residencia;

import java.util.Scanner;

public class Lista3_MiniDP2 {

	public static void main(String[] args) {
		
		double vlHora, qtdHora; 
		double totalHoras;
		double salario, vlExtra;
		double inss, desconto;
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite o valor total por hora de trabalho:");
		vlHora = scan.nextFloat();
		System.out.println("Digite quantas horas semanais trabalhou: ");
		totalHoras = scan.nextFloat();
		System.out.println("Al�quota de desconto do INSS: ");
		inss = scan.nextFloat();
		scan.close();
		
		
		if (totalHoras > 40) {
			
			qtdHora = totalHoras - 40;
			vlExtra = (vlHora * 0.5) * qtdHora;
			salario = vlHora * totalHoras;
			
			
			System.out.println("O valor de horas extras �: " + vlExtra);
			System.out.println("O sal�rio base �:" +salario);
			System.out.println("O desconto do INSS ser� de:"+ (inss * salario));
			System.out.println("Sal�rio l�quido: " +((salario + vlExtra) - (inss * salario)));
			}
		else {
			
			salario = vlHora * totalHoras;
			desconto = inss * salario;
			
		
			System.out.println("O sal�rio base �:" +salario);
			System.out.println("O desconto do INSS ser� de:"+desconto);
			System.out.println("Sal�rio l�quido: " + (salario-desconto));
			
			
		}
		
		
		
	}

}
