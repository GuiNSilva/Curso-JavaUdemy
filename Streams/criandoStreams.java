package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class criandoStreams {
	/*
	 * Quando usar stream no Java?
     * Considerando uma lista de Clientes List<Cliente> clientes
     * podemos usar Streams para executar várias tarefas que antes precisavam de muito código e que
     * poderiam ser escritas de maneiras distintas. 
     * Com Streams essas tarefas ficam mais simples, estruturadas e padronizadas.
	 */
	
	public static void main(String[] args) {
		
		Consumer<String>print = System.out::print;
		
		
		//Criando uma Stream no lugar de um array, usando o metodo Stream.of
		Stream<String>linguagens = Stream.of("Java "," Python"," JavaScript\n");
		linguagens.forEach(print);
		
		
		//Criado um Array simples e listando atraves do metodo Stream.of com a variavel do array e
		//usando um forEach passando o metodo print criado no Consumer
		String []maisLinguagens = {"C# ","PHP ","Ruby on Rails ","Delph \n"};
		Stream.of(maisLinguagens).forEach(print);
		
		
		/*
		 * List de strings usando o metodo .parallelStream e em seguida
		 * um foreach passando o consumer "print", o parallel altera a ordem de
		 * impressão.
		 */
		List<String>sex = Arrays.asList("Loira ","Negras ","Morenas ","Asiaticas \n");
		sex.parallelStream().forEach(print);
	}

}
