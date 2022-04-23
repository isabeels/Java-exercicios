package aplicacoes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

import model.entidades.Reserva;
import model.excecoes.DataInvalidaException;

public class Principal {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		try {

			System.out.println("Escolha o número do quarto que deseja: [1] individual, [2] duplo ou [3] coletivo: ");
			int numero = scan.nextInt();

			System.out.println("Escolha a data de check-in: ");
			Date checkIn = sdf.parse(scan.next());

			System.out.println("Escolha a data de check-out: ");
			Date checkOut = sdf.parse(scan.next());

			Reserva r1 = new Reserva(numero, checkIn, checkOut);

			r1.verificarData();
			System.out.println(r1);

			System.out.println("Deseja modificar a data escolhida? Sim [s] ou Não [n]");
			char resposta = scan.next().charAt(0);

			switch (resposta) {

			case 's':
				System.out.println("Escolha a data para atualizar o check-in: ");
				checkIn = sdf.parse(scan.next());

				System.out.println("Escolha a data para atualizar o check-out: ");
				checkOut = sdf.parse(scan.next());

				r1.alterarData(checkIn, checkOut);
				System.out.println(r1);
				System.out.println("Reserva confirmada, até breve!");
				break;
				
			default:
				System.out.println("Reserva confirmada, até breve!");

			}

		} catch (ParseException e) {
			System.out.println("Data inválida");
		} catch (DataInvalidaException e) {
			System.out.println("Erro na reserva. Motivo: " + e.getMessage());
		}
		catch (InputMismatchException e) {
			System.out.println("Digite um número inteiro. Apenas 1, 2 ou 3.");
		}

		scan.close();
	}
}
