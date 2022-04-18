package br.com.residencia;

public class TestandoRaizPotenciaAbsoluto {

	public static void main(String[] args) {

	double x = 3.0;
	double y = 4.0;
	double A, B, C;
	
	A= Math.sqrt(x); //RAIZ QUADRADA
	B=Math.sqrt(y);
	C=Math.sqrt(25.0);
	
	System.out.println("Raiz quadrada de "+x+"= "+A);
	System.out.println("Raiz quadrada de "+y+"= "+B);
	System.out.println("Raiz quadrada de 25.0= "+C);
	
	A=Math.pow(x, y); //POTENCIAÇÃO
	B=Math.pow(x, 2.0);
	C=Math.pow(5.0, 2.0);
	
	System.out.println(x+ " elevado a "+y+"= "+A);
	System.out.println(x+ " elevado ao quadrado= "+B);
	System.out.println("5 elevado ao quadrado= "+C);
	
	A=Math.abs(-5.0); //ABSOLUTO
	B=Math.abs(4.0);
	
	System.out.println("Valor absoluto de -5.0 = "+A);
	System.out.println("Valor absoluto de 4.0 = "+B);
	
	//Para aprender mais funcoes: java.lang.Math
	}

}
