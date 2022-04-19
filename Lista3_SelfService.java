package br.com.residencia;
import java.util.Scanner;
public class Lista3_SelfService {
	public static void main(String[] args) {

		int tara = 465;
		float vlKg, vl100g, vlTotal, kgConsumo, kgTotal;

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o preço do kg:");
		vlKg = scan.nextFloat();
		System.out.println("Digite o peso total da refeição (em gramas): ");
		kgTotal = scan.nextFloat();

		scan.close();

		kgConsumo = kgTotal - tara;
		vlTotal = (kgConsumo * vlKg) / 1000;
		vl100g = vlKg / 10;

		System.out.println("Bem vindo ao restaurante Isabel's food.");
		System.out.println("Tara do Prato: "+ tara +" gramas");
		System.out.println("Preço a cada 100g:" + vl100g);
		System.out.println("Peso consumido:" + kgConsumo);
		System.out.println("VALOR TOTAL DA REFEIÇÃO: "+ vlTotal);


	}

}
