package operadoreslogicos;

public class OperadoresLogicos {

	public static void main(String[] args) {
		boolean resultado;
		
		resultado = !((4 + 3) != 17);
		System.out.println("Primeiro = " + resultado);
		
		resultado = (4 > 3) && (4 != 2);
		System.out.println("Segunda = " + resultado);
		
		resultado = (2 * 3 > Math.pow(2, 3)) || (2 * 3 == 6);
		//(2 * 3 > 2³) OR (2 * 3 = 6)
		System.out.println("Terceira = " + resultado);
		
	}
}