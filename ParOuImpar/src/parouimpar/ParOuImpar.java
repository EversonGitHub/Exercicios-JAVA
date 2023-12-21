package parouimpar;

import java.util.Locale;
import java.util.Scanner;

public class ParOuImpar {

	public static void main(String[] args) {
		
		short numero;
		
		Scanner teclado = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Digite um número: ");
		numero = teclado.nextShort();
		
		teclado.close();
		
		if(numero % 2 == 0) {
			System.out.println("O número " + numero + " é par.");
		}else{
			System.out.println("O número " + numero + " é impar.");
		}
	}
}