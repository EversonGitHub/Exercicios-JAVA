package fahrenheit;

import java.util.Locale;
import java.util.Scanner;

public class Fahrenheit {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em Celsius: ");
		float celsius = Float.parseFloat(teclado.nextLine());
		
		teclado.close();
		
		float fahrenheit = (9 * celsius + 160) / 5;
		System.out.println("A temperatura em Fahrenheit é " + fahrenheit);
		
		if(fahrenheit > 45 && fahrenheit < 90) {	
			System.out.println("Temperatura ideal para o experimento.");
		}else {
			System.out.println("Temperatura inapropriada para experimento.");
		}
	}
}