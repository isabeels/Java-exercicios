package aulapratica;

import java.util.Scanner;

public class PrincipalProduto {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Produto p1 = new Produto();
		
		System.out.println("Nome do produto: ");
		
		p1.nome = sc.nextLine();
		System.out.println("Preço: ");
		p1.preco = sc.nextDouble();
		System.out.println("Quantidade em estoque: ");
		p1.quantidade = sc.nextInt();
		
		System.out.println("Entre com o número de produtos para adicionar ao estoque: ");
		int add;
		add = sc.nextInt();
		p1.adicionarProdutos(add);
		
		System.out.println("Dados atualizados: " + p1);
		
		System.out.println("Entre com o número de produtos para remover do estoque: ");
		int rm;
		rm = sc.nextInt();
		p1.removerProdutos(rm);
		
		System.out.println("Dados atualizados: " + p1);
		
		sc.close();
		
	}

}
