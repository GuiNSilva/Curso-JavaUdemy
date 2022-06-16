package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce3 {
	public static void main(String[] args) {
		
		Alunos a1 = new Alunos("Sandra Mara", 9, "Feminino");
		Alunos a2 = new Alunos("João Gomes", 8.7, "Masculino");
		Alunos a3 = new Alunos("Amanda Vara", 7.1, "Feminino");
		Alunos a4 = new Alunos("Leno Brega", 7.6, "Masculino");
		
		List<Alunos>alunos = Arrays.asList(a1,a2,a3,a4);
		
		Predicate<Alunos>aprovados = a -> a.nota >= 7.5;//logica para nota de aprovação.
		Predicate<Alunos>masculinos = a -> a.sexo.equalsIgnoreCase("masculino");//filtrar só masculinos.
		Function<Alunos, Double>soNotas = a -> a.nota;
		
		BiFunction<Media, Double, Media>calcularMedia = (media, nota)-> media.adicionar(nota);
		BinaryOperator<Media>combinarMedia = (m1,m2) ->Media.Combinar(m1, m2);
		
		Media media = alunos.stream()
		.filter(aprovados)
		.map(soNotas)
		.reduce(new Media(),calcularMedia,combinarMedia);
		
		System.out.println("A media dos aprovados é " +media.getValor());

		
	
	
	
	}

}
