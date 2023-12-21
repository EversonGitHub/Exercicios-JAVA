package exercício1;

import java.util.Scanner;

public class Exercício1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe seu nome: ");
		String nomeCompleto = teclado.nextLine();
		
		System.out.println("Seu nome completo é " + nomeCompleto + ".");
		teclado.close();
	}
}