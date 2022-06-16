package arrays;

public class Foreach {
	public static void main(String[] args) {
		//Array já inicializado com valores (pouco usual)
		double [] notas = {6.7, 7.8, 6.6, 5.6 };
		
		double soma= 0;
		for(double nota: notas) {
			soma += nota;
			System.out.println("Notas do aluno "+ nota);
		}
		
		System.out.println("Media igual a "+ soma /notas.length );
	}

}
