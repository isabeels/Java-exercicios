package br.com.residencia;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TreinandoBufferedReader {
	
	public static void main(String[] args) {
		
		try (BufferedReader br = new BufferedReader(new FileReader("C:\\Residencia Serratec - Arquivos de Programas\\Trabalho Final Java\\Java\\dadosEntrada.txt"))) {
			String line = br.readLine();
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		} 
	}
}
