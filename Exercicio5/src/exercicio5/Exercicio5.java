package exercicio5;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		teclado.useLocale(Locale.US);
		
		System.out.println("Raio: ");
		double raio = teclado.nextDouble(); 
		
		//System.out.println("4/3 = " + (4/3));
		
		double volume = 4.0/3.0 * Math.PI * Math.pow(raio, 3);
		
		System.out.println("O volume da esfera é: " + volume);
		
		teclado.close();
	}
}