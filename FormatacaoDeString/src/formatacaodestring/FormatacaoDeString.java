package formatacaodestring;

public class FormatacaoDeString {

	public static void main(String[] args) {
		String texto = "Java";
		short dia = 4;
		String mes = "Dezembro";
		float valor = 10.19f;

		String saida = String.format("Olá %s, hoje é dia %d do mês de %s, e o valor é R$ %f",texto, dia, mes, valor);
		System.out.println(saida);
		
	}
}