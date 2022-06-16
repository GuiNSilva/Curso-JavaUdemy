package lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class BynariOperator {
	public static void main(String[] args) {
		
		
		//Interface funcional usada para calcular media de 2 notas.
		BinaryOperator<Double> media = (n1, n2) -> (n1 + n2)/2;
		
		System.out.println(media.apply(5.6, 7.6));
		
		
		/*
		 * Interface BiFunction pode recerber parametros diferentes 
		 * e retornar com tipos diferentes tbem
		 */
		BiFunction<Double, Double, String>resultado = (n1, n2)->
		((n1+n2)/2) >= 7.5 ? "Aprovado" : "Reprovado";
		
		System.out.println(resultado.apply(6.5, 4.3));
		
		
		/*
		 * Interface Function trabalhando com 2 tipos diferentes
		 * e encadeando 2 funçoes diferentes.
		 */
		Function<Double, String> conceito = m -> m >= 7 ?"Aprovado":"Reprovado";
		
		System.out.println(media.andThen(conceito).apply(9.7, 4.1));
		
	}

}
