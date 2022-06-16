package arrays;

import java.util.Scanner;

public class desafioNotasMatriz {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int qtdAlunos;
		int qtdNotas;
		
		System.out.print("Quantos alunos serao incluidos  ");
		qtdAlunos = ler.nextInt();
		
		System.out.print("Quantas notas serão informadas ");
		qtdNotas = ler.nextInt();
		
		int [][] alunos = new int[qtdAlunos][qtdNotas]; 
		
		int soma = 0;
		for(int a = 0; a< alunos.length; a++) {
			for(int n = 0; n< alunos[a].length; n++) {
				System.out.printf("informe a nota %d do aluno %d", n,a);
				alunos[a][n]= ler.nextInt();
				soma += alunos[a][n];
				
			}
			
		}
		
		int media = soma /(qtdAlunos* qtdNotas);
		System.out.println("A media da turma foi ->"+ media);
		
		
		
		
		ler.close();
	}

}
