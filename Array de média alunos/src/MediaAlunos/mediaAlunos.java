package MediaAlunos;

import java.util.Scanner;

public class mediaAlunos {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		final int totalAlunos = 5;
		final int totalBimestres = 4;
		final double notaMinima = 7.0;
		
		String[] nomeAlunos = new String[totalAlunos];
		double[][] notaAlunos = new double[totalAlunos][totalBimestres]; 
		double[] mediaAlunos = new double[totalAlunos];
		
		for(int c = 0; c < totalAlunos; c++){
			System.out.println("Informe o nome do " + (c+1) + "° aluno:");
			nomeAlunos[c] = teclado.nextLine(); 
		}
		System.out.println("=====================================");
		
		for(int c = 0; c < totalAlunos; c++){
			for(int i = 0; i < totalBimestres; i++){
				System.out.println("Informe a nota do aluno " + nomeAlunos[c] + " para o " + (i+1) + "° bimestre.");
				notaAlunos[c][i] = teclado.nextDouble();
				System.out.println("=================================");
			}
		}
		
		for(int c = 0; c < totalAlunos; c++){
			for(int i = 0; i < totalBimestres; i++){
				mediaAlunos[c] += notaAlunos[c][i];
			}
			mediaAlunos[c] /= totalBimestres;
		}
		System.out.println("===== RESULTADO FINAL ======");
		
		for(int c = 0; c < totalAlunos; c++){
			if(mediaAlunos[c] >= notaMinima){
				System.out.println("Nome: " + nomeAlunos[c]);
				System.out.println("Nota: " + mediaAlunos[c]);
				System.out.println("Status: Aluno aprovado.");
				System.out.println("=================================");
			}else{
				System.out.println("Nome: " + nomeAlunos[c]);
				System.out.println("Média: " + mediaAlunos[c]);
				System.out.println("Status: Aluno reprovado.");
			}
		}
		teclado.close();
	}
}