package aulapratica;

public class Produto {
	
	String nome;
	double preco;
	int quantidade;
	
	
	public double calcularEstoque() {
		return preco * quantidade;
	}
	
	public void adicionarProdutos(int quantidade) {
		this.quantidade += quantidade;
	}
	
	public void removerProdutos(int quantidade) {
		this.quantidade -= quantidade;
	}
	
	public String toString() {
		return nome + ", R$ "+ preco+ ", "+ quantidade+ " unidades. Total em reais no estoque: R$ "+ calcularEstoque();
	}

}
