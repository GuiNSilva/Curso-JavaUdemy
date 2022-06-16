package Execao;

//import Streams.Alunos;
//import Streams.imprimindoObjetos;

public class Basico {
	
	public static void main(String[] args) {
		
		//double num1 = 7/0;

		
		Alunos a1 = null;
		
		
		try {
			imprimirNomeAluno(a1);
		} catch (Exception e) {
			
			System.out.println("Aluno não encontrado no banco de dados!");
			//e.printStackTrace();
		}
		
		try {
			System.out.println(7/0);
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Terminou!!");
		
		
	}
	
	public static void imprimirNomeAluno(Alunos aluno) {
		System.out.println(aluno.nome);
	}

}
