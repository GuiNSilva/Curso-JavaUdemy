package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

import arrays.Foreach;

public class Filter {
	public static void main(String[] args) {
		
		Alunos a1 = new Alunos("Jonas Papel", 5.7,"Masculino");
		Alunos a2 = new Alunos("Paulo Machado", 7.7,"Masculino");
		Alunos a3 = new Alunos("Micheli Brito", 7.3,"Feminino");
		Alunos a4 = new Alunos("Joana Prado", 5.2,"Feminino");
		Alunos a5 = new Alunos("João Cenas", 5.2,"Masculino");
		Alunos a6 = new Alunos("Claudio Manoel", 7.1,"Masculino");
		
		//Array de alunos passando os objetos criados pelo .asList
		List<Alunos>aluno = Arrays.asList(a1,a2,a3,a4,a5,a6);
		
	
		//Criando a stream aluno
		aluno.stream()
		//.filter com a logica para aplicar o filtro no caso nota maior ou igual a 7
		.filter(a -> a.nota >= 7)
		//Concatenando com o .map e formatando a mensagem de retorno
		.map(a -> "Parabéns "+ a.nome+" voce está aprovado(a)!!")
		.forEach(System.out::println);
		
		System.out.println("\n");
		
		List<Alunos>recuperar = Arrays.asList(a1,a2,a3,a4,a5,a6);
		
		
		//Predicated com a logica para o filtro
		Predicate<Alunos> recuperação = a -> a.nota <= 6;
		Predicate<Alunos>feminino = a -> a.sexo.equalsIgnoreCase("feminino");
		
		
		//Function recebe o aluno e retorna uma string formatada.
		Function<Alunos, String>msgRecuperacao = 
				r -> r.nome +" sua nota " + r.nota + " foi insulficiente vc está em recuperação !! Burro(a) !!"; 
				
		recuperar.stream()
		.filter(recuperação)//filter recebendo o predicated criado com a logica.
		.filter(feminino)
		.map(msgRecuperacao)//concatenação com o map e a mensagem formatada.
		.forEachOrdered(System.out::println);
		
		
	}

}
