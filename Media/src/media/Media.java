package media;

import java.util.Locale;
import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Digite a primeira nota: ");
		float nota1 = Float.parseFloat(teclado.nextLine());
		
		System.out.println("Digite a segunda nota: ");
		float nota2 = Float.parseFloat(teclado.nextLine());
		
		float media = (nota1 + nota2) / 2;
		
		System.out.println("Média: " + media);
		
		if(media >= 9) {
			System.out.println("A - Aluno aprovado.");
		}else if(media >= 8 && media < 9) {
			System.out.println("B - Aluno aprovado.");
		}else if(media >= 7 && media < 8) {
			System.out.println("C - Aluno aprovado.");
		}else if(media >= 6 && media < 7) {
			System.out.println("D - Aluno em recuperação.");
		}else{    
			System.out.println("E - Aluno reprovado.");
		}
		
		teclado.close();
	}
}