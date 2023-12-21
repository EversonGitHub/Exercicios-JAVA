package Jogo;

import java.util.Random;
import java.util.Scanner;

public class JogoDeNumeroAleatorio {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Random aleatorio = new Random();
		
		boolean acertou = false;
		int tentativas = 15;
		int numeroSecreto = aleatorio.nextInt();
		long chute = 0;
		
		while(tentativas <= 15 && acertou == false){
			System.out.println("Informe o seu chute: ");
			chute = teclado.nextLong();
			
			if(numeroSecreto == chute){
				System.out.println("Parabéns! Você acertou.");
			}else if(chute != numeroSecreto){
				System.out.println("Você errou. Tente novamente!");
			}
			tentativas --;
			System.out.println("Tentativas restantes: " + tentativas);
			
	   }
		teclado.close();
	}
}