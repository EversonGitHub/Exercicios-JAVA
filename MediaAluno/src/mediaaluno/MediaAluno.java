package mediaaluno;

import java.util.Scanner;

public class MediaAluno {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe o nome do aluno: ");
		String nome = teclado.next();
		
		System.out.println("Primeira nota: ");
		float nota1 = teclado.nextFloat();
		
		System.out.println("Segunda nota: ");
		float nota2 = teclado.nextFloat();
		
		float media = (nota1 + nota2)/2;
		
		System.out.println("A média do aluno " + nome + ", foi de " + media);
		
		teclado.close();
	}
}
