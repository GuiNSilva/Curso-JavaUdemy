package Colecoes;

import java.util.HashSet;
import java.util.Set;

public class conjuntoDefinido {
	public static void main(String[] args) {
		Set<String>lista = new HashSet<>();
		
		lista.add("Mariana Potoca");
		lista.add("Jonas Papel");
		lista.add("Marioca Cotoca");
		
		
		for(String names: lista) {
			System.out.println(names);
		}
	}

}
