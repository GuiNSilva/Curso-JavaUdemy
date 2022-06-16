package lambdas;

import java.util.function.UnaryOperator;

public class OperadorUnario {
	public static void main(String[] args) {
		
		UnaryOperator<Integer>maisDois = n -> n+2;
		UnaryOperator<Integer>vezesDOis = n -> n*2;
		UnaryOperator<Integer>aoQuadrado = n -> n*n;
		
		
		//Encadeando varios metodos, a função apply respeita a ordem de sequencia dos metodos.
		System.out.println(maisDois.andThen(vezesDOis).andThen(aoQuadrado).apply(3));
	}

}
