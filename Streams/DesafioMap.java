package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

import lambdas.BynariOperator;
/*
 * 1. Numero para string binaria ... 6 => "110"
 * 2. Inverter a string..."110" =>"011".
 * 3. Converter de volta para inteiro.
 */

public class DesafioMap {
	public static void main(String[] args) {
		List<Integer>numeros = Arrays.asList(23,34,46,71);
		Consumer<String>print = System.out::println;
		Consumer<Integer>printint = System.out::print;
		
		//BiFunction<Integer, String, String> binario =
		Function<Integer, String>binario = b -> b.toBinaryString(b);
		UnaryOperator<String>inverter = texto -> new StringBuilder(texto).reverse().toString();
		
		//necessita passar 2 parametros no parse por que o function recebe 2 parametros.
		//neste caso uma string e um integer.
		Function<String, Integer>inteiro = i -> Integer.parseInt(i, 2);
		
		numeros.stream()
		.map(binario)
		.map(inverter)
		.map(inteiro)
		.forEach(System.out::println);
		
		
		
	}

}
