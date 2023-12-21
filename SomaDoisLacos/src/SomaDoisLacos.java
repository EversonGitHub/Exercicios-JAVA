public class SomaDoisLacos {

	public static void main(String[] args) {
		int soma = 0;
		int dividendo = 1;
		int divisor;

		for (divisor = 1; divisor <= 50; divisor++) {
			soma = soma + (dividendo / divisor);
			System.out.println(dividendo + "/" + divisor + "=" + soma);
			dividendo = dividendo + 2;
		}
		System.out.println("Sequência =" + soma);
	}
}