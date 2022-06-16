package lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste2 {
	public static void main(String[] args) {
		/*
		 * Expressão lambda usando uma interface funcional
		 * fornecida pelo proprio java "BinaryOperator"
		 * propria para operações matematicas
		 */
		BinaryOperator<Double>calc = (a , b) -> { return a * b;};
		System.out.println(calc.apply( 23.0, 15.0));
		
		BinaryOperator<Double>divid = (a,b)->{return a/b;};
		System.out.println(divid.apply(45.0, 3.0));
	}

}
