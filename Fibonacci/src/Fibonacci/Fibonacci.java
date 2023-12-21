package Fibonacci;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int f1 = 0;
		int f2 = 1;
		int limite = teclado.nextInt();
		
		while(f2 < limite){
			int fibonacci = f1 + f2;
			if(fibonacci > limite){
				break;
			}
			System.out.println(fibonacci);
			f1 = f2;
			f2 = fibonacci;
		}
		teclado.close();
	}
}