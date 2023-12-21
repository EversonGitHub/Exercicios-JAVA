package fahrenheit;

import java.util.Scanner;

public class CalcularInteiroReal {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe o primeiro número inteiro:");
		int numero = teclado.nextInt();
		System.out.println("Informe o segundo número inteiro: ");
		int numero2 = teclado.nextInt();
		System.out.println("Informe o número real: ");
		double numeroReal = teclado.nextDouble();
		
		int resultado = (numero * 2) * (numero2 / 2);
		double resultado2 = (numero * 3) + numeroReal;
		double resultado3 = Math.pow(numeroReal, 3);
		
		System.out.println("Resultado: " + resultado);
		System.out.println("Resultado 2: " + resultado2);
		System.out.println("Resultado 3: " + resultado3);
		teclado.close();
	}
}