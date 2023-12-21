import javax.swing.JOptionPane;

public class TesteJanela {

	public static void main(String[] args) {

		JOptionPane testeJanela = new JOptionPane();
		String nome = testeJanela.showInputDialog(null, "Informe o seu nome: ");
		testeJanela.showMessageDialog(null, "Seja bem-vindo, " + nome + ".");
	}
}