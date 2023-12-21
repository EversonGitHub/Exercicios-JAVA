package JanelaJAVA;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Janela {

	public static void main(String[] args) {
		JLabel texto = new JLabel("Testando janela em JAVA.", JLabel.CENTER);
		texto.setFont(new Font("Corrier New", Font.BOLD, 35));
		texto.setForeground(Color.black);
		
		JFrame janela = new JFrame();
		janela.setSize(1280, 760);
		janela.getContentPane().setBackground(new Color(65,55,45));
		janela.add(texto);
		janela.setVisible(true);
	}
}