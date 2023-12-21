import java.util.Locale;
import java.util.Scanner;

public class SomaContador {

	public static void main(String[] args) {
		int soma = 0;
		
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe um número: ");
		int numero = teclado.nextInt();
		teclado.close();
		
		for(int contador = 1; contador <= numero; contador++) {
			soma += contador;
		}
		
		System.out.println("Soma: " + soma);
	}
}