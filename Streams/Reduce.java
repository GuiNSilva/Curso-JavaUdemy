package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce {
	public static void main(String[] args) {
		List<Integer>numeros = Arrays.asList(1,2,3,4,6,7,8,9);
		
		//Lambda com a logica a ser aplicada no reduce
		BinaryOperator<Integer> multiplique = (acumulador,num) ->acumulador * num;// multiplicando os numeros do array.
		
		
		//criando a stream e aplicando o reduce com a função multiplique como parametro
		Integer result = numeros.parallelStream().reduce( multiplique).get();
		System.out.println(result);
		
		Integer result2 = numeros.parallelStream().reduce(2,multiplique);
		System.out.println(result2);
	}

}
