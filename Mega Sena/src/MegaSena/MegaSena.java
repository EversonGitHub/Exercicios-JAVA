package MegaSena;

import java.util.Random;

public class MegaSena {

	public static void main(String[] args) {
		Random gerador = new Random();
		
		for(int c = 0; c < 5; c++){
			int numero = gerador.nextInt(60);
			System.out.print(numero + "... ");
		}
	}
}