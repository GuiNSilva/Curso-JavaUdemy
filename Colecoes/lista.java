package Colecoes;

import java.util.ArrayList;
import java.util.List;

public class lista {
	public static void main(String[] args) {
		
		ArrayList<usuarios>lista = new ArrayList<>();
		
		lista.add(new usuarios("Jones Manoel"));
		lista.add(new usuarios("Joana Maranh�o"));
		lista.add(new usuarios("Gregorio Maconheiro"));
		lista.add(new usuarios("Z� de Abreu decadente"));
		lista.add(new usuarios("S� as desgra�a"));
		
		for(usuarios u :lista) {
			
			System.out.println(u.nomes);     
			
		}
		
	}

}
