package lambdas;

import java.util.function.Predicate;

public class PredicadoComposicao {
	public static void main(String[] args) {
		Predicate<Integer>isPar = num -> num % 2 == 0;
		
		Predicate<Integer>tresNumeros = num -> num>= 100 && num <=999;
		
		/*
		 * Exemplo de composição de funçoes
		 */
		System.out.println(isPar.and(tresNumeros).test(100));
	}

}
