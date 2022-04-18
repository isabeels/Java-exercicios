package br.com.residencia;

import java.util.Scanner;

public class AcessoSenha {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String login, senha;
		int i;

		System.out.println("Digite seu login: ");
		login = scan.next();
		System.out.println("Digite sua senha: ");
		senha = scan.next();

		if(login.equals("Isabel") && senha.equals("1234")) {

			System.out.println("Bem vindo, "+login+"!");
		} 
		else {
			for(i=1; i<= 3; i++) {
				if (login != "Isabel" && senha != "1234") {
					System.out.println("Login e/ou senha inválido! Você só possui 3 tentativas. Esta é sua tentativa "+i+".");
					System.out.println("Digite seu login: ");
					login = scan.next();
					System.out.println("Digite sua senha: ");
					senha = scan.next();
				}
				else {
					System.out.println("Bem vindo,"+login+"!");
				}
				System.out.println("Acesso Bloqueado!");
				scan.close();
			}
		}

	}
}
