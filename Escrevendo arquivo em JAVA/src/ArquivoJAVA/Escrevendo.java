package ArquivoJAVA;

import java.io.FileWriter;
import java.io.IOException;

public class Escrevendo {

	public static void main(String[] args) throws IOException {
		String caminho = "C:\\Users\\evers\\Desktop\\!\\arquivo.txt";
		String conteudo = "Testando...\nEsse é um teste de escrita para um arquivo JAVA.\nIDE usada: Eclipse.\nData: 03/12/2023";
		
		FileWriter escritor = new FileWriter(caminho);
		escritor.write(conteudo);
		escritor.close();
	}
}