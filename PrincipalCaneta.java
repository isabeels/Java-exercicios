package aulapratica;

public class PrincipalCaneta {

	public static void main(String[] args) {
	
		Caneta c1 = new Caneta();
		
		c1.modelo = "Bic";
		c1.cor = "Verde";
		c1.carga = 90;
		c1.destampar();
		c1.status();
		c1.rabiscar();
		
		Caneta c2 = new Caneta();
		
		c2.cor = "Azul";
		c2.modelo = "Pilot";
		c2.status();
		c2.tampar();
		c2.rabiscar();
	}

}
