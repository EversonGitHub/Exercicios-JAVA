package Casting;

public class UsandoCasting {

	public static void main(String[] args) {
		int idade = 29;
		double idade2 = 20;
		idade = (int) idade2; 
		
		char letra = 'a';
		String letra2 = String.valueOf(letra);
		letra = letra2.charAt(0); 
		
		String nome = String.valueOf(idade);
		idade = Integer.parseInt(nome); 
	}
}