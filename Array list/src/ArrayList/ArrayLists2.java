package ArrayList;

import java.util.ArrayList;

public class ArrayLists2 {

	public static void main(String[] args) {
		ArrayList<String> clientes = new ArrayList<String>();
		
		clientes.add("Everson.");
		clientes.add("Bibi.");
		clientes.add("Ana Larissa.");
		clientes.remove(2);
		//clientes.clear();
		System.out.println(clientes.get(1));
		System.out.println(clientes.contains("Everson.")); 
		System.out.println(clientes.size()); 
	}
}