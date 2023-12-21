package soma_subtracao;

import java.util.Scanner;

public class Soma_Subtracao {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe o primeiro número: ");
		int numero1 = teclado.nextInt();
		
		System.out.println("Informe o segundo número: ");
		int numero2 = teclado.nextInt();
		
		int soma = numero1 + numero2;
		
		int subtracao = numero1 - numero2;
		
		System.out.println("A soma entre os valores " + numero1 + " e " + numero2 + " foi: " + soma);
		System.out.println("A subtração entre os valores " + numero1 + " e " + numero2 + " foi: " + subtracao);
		teclado.close();
	}
}