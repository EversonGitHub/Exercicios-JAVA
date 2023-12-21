import java.util.Scanner;

public class ArrayDeAlunos2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numeroAlunos = 10;
		double notaAlunos[] = new double [numeroAlunos];
		
		for(int c = 0; c < numeroAlunos; c++){
			System.out.println("Informe a nota do " + (c+1) + "° aluno:");
			notaAlunos[c] = teclado.nextDouble();
		}
		
		for(int c = 0; c < numeroAlunos; c++){
			System.out.println("Nota do " + (c+1) + "° aluno:");
			System.out.println(notaAlunos[c]);
		}
		
		teclado.close();
	}
}