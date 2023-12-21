package exercicio6;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		teclado.useLocale(Locale.US);
		
		System.out.println("Valor da base maior: ");
		double baseMaior = teclado.nextDouble();
		
		System.out.println("Valor da base menor: ");
		double baseMenor = teclado.nextDouble();
		
		System.out.println("Valor da altura: ");
		double altura = teclado.nextDouble();
		
		double area =  ((baseMaior + baseMenor)/2) * altura;
		
		System.out.println("A área do trapézio é " + area);
		
		teclado.close();
	}
}