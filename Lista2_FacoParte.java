/*O sistema �Fa�o parte� vai te mostrar um hist�rico da trajet�ria de nossa
cidade. O resultado apresentado na tela ser�: �Teres�polis tem X anos.
Desses, Y foram antes de mim. Mas os �ltimos Z anos contaram comigo!�.
Cada letra mai�scula do texto ser� uma vari�vel, sendo que �x� e �z� s�o
valores fixos, e �y� ir� conter uma express�o.*/

package br.com.residencia;

public class Lista2_FacoParte {

	public static void main(String[] args) {

		int y = 0, z = 9;
		int x = 131;


		y = x - z;

		System.out.println("Teres�polis tem "+x+" anos."); 
		System.out.println("Desses, "+y+ " foram antes de mim.");
		System.out.println("Mas os �ltimos "+z+" anos contaram comigo!");
	}

}
