package aulapratica;

public class Caneta {

	 public String modelo;
	 public String cor;
	 private float ponta;
	 protected int carga;
	 protected boolean tampada;
	 
	 
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public float getPonta() {
		return ponta;
	}
	public void setPonta(float ponta) {
		this.ponta = ponta;
	}
	public int getCarga() {
		return carga;
	}
	public void setCarga(int carga) {
		this.carga = carga;
	}
	
	public void status() {
		System.out.println("SOBRE A CANETA ");
		System.out.printf("Modelo: %s%n", this.getModelo());
		System.out.printf("Ponta: %.2f%n", this.getPonta());
		System.out.printf("Carga: %d%n", this.getCarga());
		System.out.printf("Cor: %s%n", this.getCor());
		
	}
	 
	
	
}

