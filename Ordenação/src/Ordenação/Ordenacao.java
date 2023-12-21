package Ordenação;

import java.util.Arrays;

public class Ordenacao {

	public static void main(String[] args) {
		int[] numeros = new int[] {30,19,10,5,6,7,8,9,11};
		
		Arrays.sort(numeros); 
		
		System.out.println(Arrays.toString(numeros)); 
	}
}