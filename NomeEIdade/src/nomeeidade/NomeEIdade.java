package nomeeidade;

import java.util.Scanner;

public class NomeEIdade {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe seu nome: ");
		String nome = teclado.next();
		
		System.out.println("Informe seu sobrenome: ");
		String sobrenome = teclado.next();
		
		System.out.println("Informe sua idade: ");
		short idade = teclado.nextShort();
		
		System.out.println("O usuário " + nome + " " + sobrenome + " tem " + idade + " anos.");
		teclado.close();
	}
}