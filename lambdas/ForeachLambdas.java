package lambdas;

import java.util.Arrays;
import java.util.List;

public class ForeachLambdas {
	public static void main(String[] args) {
		
		List<String> alunos = Arrays.asList("Joana","Sara","Viviane","Gulosa");
		/*
		 * Listando os alunos usando foreach
		 * com uma expressão Lambda
		 */
		
		alunos.forEach((nomes) -> {System.out.println(nomes+" !!");});
		
		
		//Foreach Usando Method Reference
		System.out.println("\nUsando Method Reference");
		alunos.forEach(System.out::println);
		
		
		System.out.println("\n");
		//Usando um foreach funcional com uma função criada
		System.out.println("Usando uma função previa formatando o foreach");
		alunos.forEach(nomes -> impressao(nomes));
		
		//Função previamente definida com method reference.
		System.out.println("\nPassando foreach como paramentro para o method reference e a função criada");
		alunos.forEach(ForeachLambdas:: impressao);
		
	}
	
	 static void impressao(String nome) {
		System.out.println("Já peguei " + nome);
	}

}
 