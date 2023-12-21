package NumeroAleatorio;

import java.io.PrintStream;
import java.util.Random;
import java.util.Scanner;

public class Jogo {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		PrintStream show = System.out;
		Random gerador = new Random();
		
		int opcao, escolhaComputador = 0, escolhaUsuario;
		
		show.println("Olá! Qual o seu nome?");
		String nome = teclado.nextLine();
		show.println("Seja bem-vindo " + nome + ".");
		show.println("Preparei um jogo de números aleatórios. Você jogar?");
		show.println("\n1 - Sim. 2 - Não.");
		opcao = teclado.nextInt();
	
		if(opcao == 2){
			show.println("Que pena, fica pra próxima.");
		}else if(opcao == 1){
			show.println("Que bom. Vamos começar.");
			show.println("Eu vou escolher um número aleatório de 0 a 10, se você conseguir adivinhar, vence o jogo.");
			
			escolhaComputador = gerador.nextInt(11);
			
			show.println("Ok " + nome + ", eu já escolhi.");
			show.println("Agora tente adivinhar.");
		}
		
		do{
			escolhaUsuario = teclado.nextInt();
			if(escolhaUsuario != escolhaComputador){
				show.println("Você errou. Tente novamente.");
			}else{
				show.println("Parabéns! Você acertou o número aleatório.");
			}
			
		}while(escolhaComputador != escolhaUsuario);
		
		teclado.close();
	}
}