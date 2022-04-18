package aulapratica;

public class Caneta {

	 String modelo;
	 String cor;
	 int carga;
	 boolean tampada;
	 
	public void status() {
		
		System.out.println("Status da caneta:" + this.cor  + this.modelo  + this.tampada);
	}
	 
	public void rabiscar() {
	
		if (this.tampada == true) {
			System.out.println("Não pode rabiscar, está tampada.");
		}
			else {
				System.out.println("Pode rabiscar a vontade!");
			}
	
	}
	
	public void tampar() {
	this.tampada = true;
	}
	
	public void destampar() {
	this.tampada = false;	
	}
	
}

