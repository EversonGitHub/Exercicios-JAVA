package DiasDeVida;

import java.util.Scanner;

public class DiasDeVida {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe a sua idade: ");
		String stringIdade = teclado.nextLine();
		
		int idade = Integer.parseInt(stringIdade);
		int diasDeVida = idade * 365;
		
		System.out.println("Você tem " + diasDeVida + " nesses " + idade + " anos de idade.");
		
		teclado.close();
	}
}