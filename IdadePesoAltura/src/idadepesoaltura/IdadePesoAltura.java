package idadepesoaltura;

import java.util.Locale;
import java.util.Scanner;

public class IdadePesoAltura {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		teclado.useLocale(Locale.US);
		
		System.out.println("Nome completo: ");
		String nomeCompleto = teclado.nextLine();
		
		System.out.println("E-mail: ");
		String email = teclado.nextLine();
		
		System.out.println("Telefone: ");
		String telefone = teclado.nextLine();
		
		System.out.println("Idade: ");
		short idade = Short.parseShort(teclado.nextLine());
		
		System.out.println("Peso: ");
		float peso = Float.parseFloat(teclado.nextLine());
		
		System.out.println("Altura: ");
		float altura = Float.parseFloat(teclado.nextLine());
		
		System.out.println("Nome completo: " + nomeCompleto + ". \n" +
		"E-mail: " + email + ".\n" + "Telefone: " + telefone + ". \n" + "Idade: " + idade + ".\n" +
		"Peso: " + peso + ".\n" + "Altura: " + altura + ".\n");
		
		teclado.close();
	}
}
