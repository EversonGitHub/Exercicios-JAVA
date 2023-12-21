package condicionalternaria;

public class CondicionalTernaria {

	public static void main(String[] args) {
		int a = 5, b;
		int x = 9;
		
		System.out.println((x % 2 == 0)? "Par.": "Impar.");
		/*
		 if(x % 2 == 0){
		 	system.out.println("Par.")
		 }else{
		 	system.out.println("Impar.")
		 }  
		 */
		
		b = a >=5 ? 1:10;
		System.out.println(b);	
		
		double valor = 100f;
		double desconto;
		
		desconto = valor * (valor >= 150 ? 15.0/100 : 5.0/100);
		System.out.println(String.format("Desconto de R$ %.2f", desconto));
		System.out.println(String.format("Valor a pagar R$ %.2f", (valor - desconto)));
		
	}
}