package lambdas;

import java.util.function.Function;

public class InterfaceFunction {
	
	
			/*
			 * Implementação da interface Function
			 * 2 parametros que podem ser diferentes o segundo indica
			 * o tipo de retorno desejado
			 */
			public static void main(String[] args) {
				
				
				//Tipo de interface, 2 parametros diferentes, nome da Lambda.
				Function<Integer, String>ParOuImpar=
						
						// Variavel e implementaçao da função que recebe um int e retorna uma string.
						numero -> numero % 2 == 0 ? "Par" : "Impar";
						
				//Recebendo 2 parametros iguais.		
				Function<String, String>oResultadoE =
						valor -> "O resultado é " + valor; 
						
				Function<String, String>encadear = 
						valor -> " e um bom numero !!!"+ valor;
				
				// Concatenando 3 funçoes com o '.andThen' resultado armazenado em variavel 
				String result = ParOuImpar.andThen(encadear).andThen(oResultadoE).apply(456);
				
				System.out.println(result);
			}
	


}
