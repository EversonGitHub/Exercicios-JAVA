package exercicio2;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe o valor de X: ");
		int x = teclado.nextInt();
		
		System.out.println("Informe o valor de Y: ");
		int y = teclado.nextInt();
		
		int resultado1 = x / y;
		System.out.println("Primeiro resultado: " + resultado1);
		
		float resultado2 = x / y;
		System.out.println("Segundo resultado: " + resultado2);
		
		float resto = x % y;
		System.out.println("O resto da divisão de x e y é " + resto);
		
		teclado.close();
	}
}