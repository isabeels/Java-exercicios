/*O “mini DP” aumentou seus cálculos. Agora, considera a jornada de
trabalho semanal de um funcionário, que é de 40 horas. O funcionário que
trabalhar mais de 40 horas receberá hora extra, cujo cálculo é o valor da
hora regular com um acréscimo de 50%. Considerando que o mês possui 4
semanas exatas, e que a entrada de horas será um valor maior que a
jornada normal.
a. Salário base (valor da hora * horas normais)
b. Valor de horas extras
c. Valor do desconto para o INSS
d. Salário líquido (Salário base + horas extras – desconto INSS)
e. Imprimir o contracheque do funcionário.*/

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
		System.out.println("Alíquota de desconto do INSS: ");
		inss = scan.nextFloat();
		scan.close();
		
		
		if (totalHoras > 40) {
			
			qtdHora = totalHoras - 40;
			vlExtra = (vlHora * 0.5) * qtdHora;
			salario = vlHora * totalHoras;
			
			
			System.out.println("O valor de horas extras é: " + vlExtra);
			System.out.println("O salário base é:" +salario);
			System.out.println("O desconto do INSS será de:"+ (inss * salario));
			System.out.println("Salário líquido: " +((salario + vlExtra) - (inss * salario)));
			}
		else {
			
			salario = vlHora * totalHoras;
			desconto = inss * salario;
			
		
			System.out.println("O salário base é:" +salario);
			System.out.println("O desconto do INSS será de:"+desconto);
			System.out.println("Salário líquido: " + (salario-desconto));
			
			
		}
		
		
		
	}

}
