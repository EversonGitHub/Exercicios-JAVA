package JogoFloresta;

import java.util.Scanner;

public class JogoFloresta {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Você se encontra em uma casa abandonada no meio da floresta.");
		System.out.println("Escolha agora, a sua direção: w, s, d, a:");
		String opcao;
		
		do{
			opcao = teclado.nextLine();
			
			if(opcao.equals("w")){
				System.out.println("Você entrou no labirinto.");
			}else if(opcao.equals("s")){
				System.out.println("Você entrou no território de lobos selvagens e foi devorado.");
			}else if(opcao.equals("d")){
				System.out.println("Você caiu no precipício e morreu.");
			}else if(opcao.equals("a")){
				System.out.println("Você encontrou a saída. Parabéns!");
			}else{
				System.out.println("Opção inválida.");
			}
		}while(!opcao.equals("a"));
		
		teclado.close();
	}
}