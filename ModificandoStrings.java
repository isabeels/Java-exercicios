package br.com.residencia;

public class ModificandoStrings {

	public static void main(String[] args) {
		
		String original = "abcde FGHIJ ABC abc DEFG ";
		String s01 = original.toLowerCase();
		String s02 = original.toUpperCase();
		String s03 = original.trim();
		String s04 = original.substring(2);
		String s05 = original.substring(2, 9);
		String s06 = original.replace('a', 'x');
		String s07 = original.replace("abc", "xy");
		int i = original.indexOf("bc");
		int j = original.lastIndexOf("bc");
		
		System.out.println("Original: -" + original + "-"); 
		System.out.println("toLowerCase: -" + s01 + "-"); //tudo em minusculo
		System.out.println("toUpperCase: -" + s02 + "-"); //tudo em maiusculo
		System.out.println("trim: -" + s03 + "-"); //remove os espaços
		System.out.println("substring(2): -" + s04 + "-"); // começará da posição 2 neste caso.
		System.out.println("substring(2, 9): -" + s05 + "-"); // começará na posição 2 e parará na 9.
		System.out.println("replace('a', 'x'): -" + s06 + "-"); //substitui a letra a por x.
		System.out.println("replace('abc', 'xy'): -" + s07 + "-"); //substitui abc por xy.
		System.out.println("Index of 'bc': " + i); // numero da posição onde se encontra o PRIMEIRO bc.
		System.out.println("Last index of 'bc': " + j); // numero da posição onde se encontra o ULTIMO bc.
		
		/*função split --------- separa uma string com multiplas palavras em string vetor com cada palavra*/
	
		String s = "Isabel SantAna Rocha";
		
		String[] vect = s.split(" ");
		
		String word1 = vect[0];
		String word2 = vect[1];
		String word3 = vect[2];
		
		//ou poderia somente ter colocado pra imprimir vect[0], vect[1]... sem atribuir antes para word1, word2....
		
		System.out.println(word1);
		System.out.println(word3);
		System.out.println(word2);
		
	
	}

}
