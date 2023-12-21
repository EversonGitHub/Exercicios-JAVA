package Métodos;

import java.util.Scanner;

public class AreaAltura {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe a altura: ");
		double altura = teclado.nextDouble();
		System.out.println("Informe a área: ");
		double base = teclado.nextDouble();
		
		double areaRetangulo = retangulo(base, altura);
		
		System.out.println("Área do retângulo: " + areaRetangulo);
		teclado.close();
	}
	
	public static double retangulo(double b, double  a){
		
		return b*a;
	}
}