package produto;

import java.util.Locale;
import java.util.Scanner;

public class Produto {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("ID: ");
		short id = Short.parseShort(teclado.nextLine());
		
		System.out.println("Nome: ");
		String nomeProduto = teclado.nextLine();
		
		System.out.println("Descrição: ");
		String descricao = teclado.nextLine();
		
		System.out.println("Quantidade: ");
		int quantidade = Integer.parseInt(teclado.nextLine());
		
		System.out.println("Preço unitário: ");
		float preco = Float.parseFloat(teclado.nextLine());
		
		System.out.println("Taxa de imposto: ");
		float taxa = Float.parseFloat(teclado.nextLine());
		
		float valorProduto = quantidade * preco;
		float valorImposto = (valorProduto * taxa) / 100;
		float valorTotal = valorImposto + valorProduto;	
		
		System.out.println("Código do produto: " + id + ", " + nomeProduto);
		System.out.println("Descrição do produto: " + descricao);
		System.out.println("Quantidade: " + quantidade);
		System.out.println("Preço unitário R$: " + preco);
		System.out.println("Preço total R$: " + valorProduto);
		System.out.println("Valor do imposto R$: " + valorImposto);
		System.out.println("Valor total da compra R$: " + valorTotal);
		
		teclado.close();
	}
}