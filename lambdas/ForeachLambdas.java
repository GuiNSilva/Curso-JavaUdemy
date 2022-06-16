package lambdas;

import java.util.Arrays;
import java.util.List;

public class ForeachLambdas {
	public static void main(String[] args) {
		
		List<String> alunos = Arrays.asList("Joana","Sara","Viviane","Gulosa");
		/*
		 * Listando os alunos usando foreach
		 * com uma express�o Lambda
		 */
		
		alunos.forEach((nomes) -> {System.out.println(nomes+" !!");});
		
		
		//Foreach Usando Method Reference
		System.out.println("\nUsando Method Reference");
		alunos.forEach(System.out::println);
		
		
		System.out.println("\n");
		//Usando um foreach funcional com uma fun��o criada
		System.out.println("Usando uma fun��o previa formatando o foreach");
		alunos.forEach(nomes -> impressao(nomes));
		
		//Fun��o previamente definida com method reference.
		System.out.println("\nPassando foreach como paramentro para o method reference e a fun��o criada");
		alunos.forEach(ForeachLambdas:: impressao);
		
	}
	
	 static void impressao(String nome) {
		System.out.println("J� peguei " + nome);
	}

}
 