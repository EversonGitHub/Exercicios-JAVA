package Calculadora;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double numero1, numero2;
		String operacao;
		boolean continuar;
		
		try{
			do{
				System.out.println("Informe um valor: ");
				numero1 = teclado.nextDouble();
				System.out.println("Informe a operação: (+ - * /)");
				operacao = teclado.next();
				System.out.println("Informe o segundo valor: ");
				numero2 = teclado.nextDouble();
		
				System.out.println("Resultado: " + realizarCalculo(numero1, operacao, numero2));
		
				continuar = novaOperacao();
			}while(continuar);
		}catch(InputMismatchException ex){
			System.out.println("Os valores digitados devem ser numéricos.");
		}
		
		teclado.close();
	}
	
	public static boolean novaOperacao(){
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Deseja realizar uma nova operação? (s/n)");
		teclado.close();
		return !teclado.nextLine().toUpperCase(Locale.ROOT).equals("N");
		
	}
	
	public static double realizarCalculo(double v1, String operacao, double v2){
		double resultado = 0.0;
	
		switch(operacao) {
		case "+":
			resultado = v1 + v2;
			break;
		case "-":
			resultado = v1 - v2;
			break;
		case "*":
			resultado = v1 * v2;
			break;
		case "/":
			resultado = v1 / v2;
			break;
		default:
			System.out.println("Operação inválida.");
		}
		return resultado;
	}
}