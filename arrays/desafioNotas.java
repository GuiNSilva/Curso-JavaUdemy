package arrays;

import java.util.Scanner;

public class desafioNotas {
	public static void main(String[] args) {
		int quantasNotas;
		Scanner notas = new Scanner(System.in);
		
		System.out.print("Quantas notas serao inseridas ");
		quantasNotas = notas.nextInt();
		double[]nota = new double[quantasNotas];
		
		for(int i = 0 ; i< nota.length; i++) {
		System.out.print("Digite a nota " + (i +1) + "-> ");
		double notaAluno = notas.nextDouble();
		nota[i] = notaAluno; 
		}
		
		
		double soma = 0;
		for(double media:nota) {
			 soma += media;
		}
		 double mediaAluno = soma/nota.length;
		System.out.print("\nA media do semestre do aluno foi "+ mediaAluno);

		notas.close();

	}
	

}
