package DiasDaSemana;

import java.util.Scanner;

public class DiasDaSemana {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o dia da semana entre domingo, segunda e terça-feira:");
		String entrada = teclado.nextLine();
		
		System.out.println("Conversor: " + conversorDia(entrada));
		
		teclado.close();
	}
	
	static int conversorDia(String entrada){
		
		int resultado = 0;
		if(entrada.equalsIgnoreCase("domingo.")){ 
			resultado = 1;
		}else if(entrada.equalsIgnoreCase("segunda feira")){
			resultado = 2;
		}else if(entrada.equalsIgnoreCase("terça feira")){
			resultado = 3;
		}
		return resultado;
	}
}