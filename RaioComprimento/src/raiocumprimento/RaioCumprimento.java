package raiocumprimento;

import java.util.Locale;
import java.util.Scanner;

public class RaioCumprimento {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		teclado.useLocale(Locale.US);
		
		System.out.println("Qual o valor do raio: ");
		double raio = teclado.nextDouble();
		double area = Math.PI * Math.pow(raio, 2);
		double comprimento = 2 * Math.PI * raio;
		
		System.out.println("Raio: " + raio);
		System.out.println("Comprimento: " + comprimento);
		
		teclado.close();
	}
}