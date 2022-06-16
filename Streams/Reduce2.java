package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

import lambdas.BynariOperator;

public class Reduce2 {
	public static void main(String[] args) {
		
		Alunos a1 = new Alunos("Sandra Mara", 9, "Feminino");
		Alunos a2 = new Alunos("João Gomes", 8.7, "Masculino");
		Alunos a3 = new Alunos("Amanda Vara", 7.1, "Feminino");
		Alunos a4 = new Alunos("Leno Brega", 7.6, "Masculino");
		
		List<Alunos>alunos = Arrays.asList(a1,a2,a3,a4);
		
		Predicate<Alunos>aprovados = a -> a.nota >= 7.5;//logica para nota de aprovação.
		Predicate<Alunos>masculinos = a -> a.sexo.equalsIgnoreCase("masculino");//filtrar só masculinos.
		Predicate<Alunos>femininos = f -> f.sexo.equalsIgnoreCase("feminino");//filtrar femininos.
		BinaryOperator<Double>soma = (a,b) -> a+b;//soma das notas dos aprovados.
		
		Function<Alunos, Double>notas = n -> n.nota;//recebe um aluno para poder acessar o atributo nota.
		Function<Alunos, String>statusA = a -> "Parabens "+a.nome+" voce está aprovado !!"; //rebece um aluno para concatenar o nome com a msg de aprovação.
		
		alunos.parallelStream()
		.filter(masculinos)
		.filter(aprovados)
		.map(notas)
		.reduce(soma)
//		.map(statusA)
		.ifPresent(System.out::println);
		
		
	}

}
