package TryCatchFinally;

import java.util.Scanner;

public class TryCatchFinally {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		try{
			System.out.println("Informe a sua idade: ");  
			int idade = teclado.nextInt();
			System.out.println("Sua idade é " + idade + " anos.");
		}catch(Exception error){                        
			System.out.println("Idade inválidade.");
		}finally {
			System.out.println("O processo foi finalizado."); 
		}
		
		teclado.close();
	}
}