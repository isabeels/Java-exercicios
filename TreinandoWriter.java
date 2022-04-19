package br.com.residencia;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TreinandoWriter {
	
	public static void main(String[] args) {
		
		String[] lines = new String[] {"Cliente", "Isabel", "281196"};
		try (BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Residencia Serratec - Arquivos de Programas\\Disciplina - Java\\teste.txt"))) {
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}