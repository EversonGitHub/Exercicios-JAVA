package exercicio7;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio7 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);
        
        int soma = 0;
        
        System.out.println("Informe um número: ");
        int numero = Integer.parseInt(teclado.nextLine());
        soma += numero;
        
        while(numero != 0){
            System.out.println("Digite o próximo número: ");
            numero = Integer.parseInt(teclado.nextLine());
            soma += numero;
        }
                
        System.out.println("O número digitado é diferente de zero. Encerrando...");
    }
}