package EqualsIgual;

import java.util.Scanner;

public class EqualsIgual {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String password = "12345";
		
		System.out.println("Digite sua senha:");
		String senha = teclado.nextLine();
		
		String x = "123";
		String y = "123";
		
		System.out.println(password.equals(senha)); 
		System.out.println(x == y); 
		teclado.close();
	}
}