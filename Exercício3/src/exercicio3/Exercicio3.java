package exercicio3;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int numero1 = teclado.nextInt();
		
		System.out.println("Digite um número: ");
		int numero2 = teclado.nextInt();
		
		int soma = numero1 + numero2;
		int subtracao = numero1 - numero2;
		int multiplicacao = numero1 * numero2;
		int divisao = numero1 / numero2;
		
		System.out.println("Soma: " + soma);
		System.out.println("Subtração: " + subtracao);
		System.out.println("Multiplicação: " + multiplicacao);
		System.out.println("Divisão: " + divisao);
		
		teclado.close();
	}
}