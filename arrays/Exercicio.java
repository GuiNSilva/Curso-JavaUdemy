package arrays;

import java.util.Arrays;

public class Exercicio {
	
	public static void main(String[] args) {
		//ARRAY e um objeto precisa ser instanciado com o new
		double[] notasAlunos = new double[3]; 
		notasAlunos[0] = 6.7;
		notasAlunos[1] = 7.8;
		notasAlunos[2] = 7.4;
		
		
		//Arrays.toString, metodo para imprimiri todo o array.
		System.out.println(Arrays.toString(notasAlunos)); 
		
		double notas = 0;
		for(int i = 0; i < notasAlunos.length; i++) {
			 notas += notasAlunos[i];
		}

		System.out.println("Media do aluno foi " + notas/ notasAlunos.length);

	}
	
	

}
