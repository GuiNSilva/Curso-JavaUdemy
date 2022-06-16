package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Map {
	public static void main(String[] args) {
		//Consumer para a fun��o print
		Consumer<String> print = System.out::print;
		Consumer<Integer>conte = System.out::print;
		
		List<String>marcas = Arrays.asList("Aston Martin ","Suzuki "," Mercedes Bens ","McLaren ");
		
		marcas.stream().map(m -> m.length()).forEach(conte);
		System.out.println("\n\n");
		
		
		
		//Criando as fun�oes lambdas para atuarem na stream
		UnaryOperator<String>minusculas = m -> m.toLowerCase();
		UnaryOperator<String>maiusculas = m -> m.toUpperCase();
		UnaryOperator<String>substring = i -> i.substring(3, 6);
		UnaryOperator<String>nivel = n -> n+"� TOP !! - ";
		
		/*
		 * Criando a stream e utilizando o map.
		 * Passar a fun��o lambda como parametro para o .map
		 */
		
		//Usando a fun��o minuscula
		marcas.stream().map(minusculas).forEach(print);
		System.out.println("\n\n");

		
		
		//Usando composi��o de fun��es
		marcas.stream()
		.map(minusculas)
		.map(maiusculas)
		.map(nivel)
		//.map(substring)
		.forEach(print);
		
		
	}

}
