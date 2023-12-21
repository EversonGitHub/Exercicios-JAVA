package ForEach;

import java.util.ArrayList;

public class UsandoForEach {

	public static void main(String[] args) {
		ArrayList<String> nomes = new ArrayList<>();
		
		nomes.add("Everson.");
		nomes.add("Vitória.");
		nomes.add("Celoni.");
		nomes.add("Bibi.");
		
		for(String n: nomes){
			System.out.println(n);
		}
	}
}