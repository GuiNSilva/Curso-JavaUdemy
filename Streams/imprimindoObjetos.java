package Streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

import Colecoes.lista;

public class imprimindoObjetos {
	public static void main(String[] args) {
		List<String>aprovados = Arrays.asList("Tania","Morena","Jussara","Silvania");
		
		
		System.out.println("Listando com foreach");
		for(String nomes: aprovados) {
			System.out.println(nomes);
		
		}
		
		/*
		 * Usando a Interface Iterator, instacia uma interface Iterator com o tipo de dados, passando
		 * a lista a ser lida com o metodo iterator da classe, atraves de um while com
		 * o metodo .hasNext que vai ler enquanto encontrar registros.
		 */
		System.out.println("\nUsando a interface Iterator");
		Iterator<String>iterator = aprovados.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		
		/*
		 * Usando a interface Stream, instanciar a Interface com o tipo de dados da lista, recebendo a lista como parametro 
		 * e a notação .stream da Interface.
		 * Usando o metodo stream com um forEach para listar os itens
		 * 
		 */
		System.out.println("\nUsando a interface Stream");
		Stream<String>stream = aprovados.stream();
		stream.forEach(System.out::println);
		
		
		
	}
	

}
