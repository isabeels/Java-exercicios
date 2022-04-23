package aplicacoes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entidades.Reserva;

public class Principal {

	public static void main(String[] args) throws ParseException {

		Scanner scan = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat ("dd/MM/yyyy");

		System.out.println("Escolha o quarto que deseja: ");
		int numero = scan.nextInt();

		System.out.println("Escolha a data de checkIn: ");
		Date checkIn = sdf.parse(scan.next());

		System.out.println("Escolha a data de checkOut: ");
		Date checkOut = sdf.parse(scan.next());

		Reserva r1 = new Reserva(numero, checkIn, checkOut);
		Date now = new Date();

		while (checkIn.before(now) || checkOut.before(now) || !checkOut.after(checkIn)) {
			System.out.println("Erro. Escolha datas válidas.");
			
			System.out.println("Escolha a data de checkIn e depois escolha a data de checkOut: ");
			r1.alterarData(sdf.parse(scan.next()), sdf.parse(scan.next()));
	
		}	
		System.out.println(r1);	

		System.out.println("Deseja atualizar a data da reserva? Digite [s] para SIM e [n] para NÃO");
		char resposta = scan.next().charAt(0);

		switch (resposta) {

		case 's':

			if(checkIn.before(now) || checkOut.before(now)) {
				System.out.println("Erro. Escolha datas futuras.");
			}
			else if (!checkOut.after(checkIn)) {
				System.out.println("Erro na escolha das datas. O check-out não pode ser antes que o check-in.");
			}
			else {
				System.out.println("Escolha a data de checkIn e depois escolha a data de checkOut: ");
				r1.alterarData(sdf.parse(scan.next()), sdf.parse(scan.next()));
				System.out.println(r1);
				System.out.println("Obrigada pela preferência!");
			}
			break;
			
		default:
			System.out.println("Obrigada pela preferência!");

		}
		scan.close();
	}
}
