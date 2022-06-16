package Colecoes;

import java.util.HashSet;

public class conjuntoBaguncado {
	public static void main(String[] args) {
		 HashSet conjunto = new HashSet();
		 
		 conjunto.add("Eliane Maria");
		 conjunto.add("21/04/1984");
		 conjunto.add(256.00);
		 
		 System.out.println(conjunto.toString());
		 System.out.println(conjunto.size());
		 System.out.println(conjunto.contains("Eliane Maria"));
		 System.out.println(conjunto.remove("Eliane Maria"));
		 conjunto.add("Eliane de Jesus");
		 System.out.println(conjunto.toString());
	}

}
