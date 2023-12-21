package exercicio4;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		teclado.useLocale(Locale.US);
		
		System.out.println("Informe o primeiro número: ");
		double numero1 = teclado.nextDouble();
		
		System.out.println("Informe o segundo número: ");
		double numero2 = teclado.nextDouble();
		
		double soma = numero1 + numero2;
		double subtracao = numero1 - numero2;
		double multiplicacao = numero1 * numero2;
		double divisao = numero1 / numero2;
		
		System.out.println("Soma: " + soma);
		System.out.println("Subtração: " + subtracao);
		System.out.println("Multiplicação: " + multiplicacao);
		System.out.println("Divisão: " + divisao);
		teclado.close();
	}
}