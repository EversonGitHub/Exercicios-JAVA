package estruturaswitch;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaSwitch {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		String diaSemana;
		
		System.out.println("Qual seu dia da semana preferido?\nDigite 1 para segunda-feira.\nDigite 2 para terça-feira.\nDigite 3 para quarta-feira.\nDigite 4 para quinta-feira.\nDigite 5 para sexta-feira.\nDigite 6 para sábado.\nDigite 7 para domingo.");
		short dia = teclado.nextShort();		
				
		switch(dia) {
			case 1:
				diaSemana =	"Segunda-feira.";
			break;
			
			case 2:
				diaSemana = "Terça-feira.";
			break;
			
			case 3:
				diaSemana = "Quarta-feira.";
			break;
			
			case 4:
				diaSemana = "Quinta-feira.";
			break;
		
			case 5:
				diaSemana = "Sexta-feira.";
			break;
			
			case 6:
				diaSemana = "Sábado.";
			break;
			
			case 7:
				diaSemana = "Domingo.";
			break;	
			
			default:
				diaSemana = "Opção inválida. Digite novamente.";
			break;
			
		}
			System.out.println(diaSemana);
			teclado.close();	}
}