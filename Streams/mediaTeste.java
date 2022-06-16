package Streams;

public class mediaTeste {
	
	public static void main(String[] args) {
		
		Media m1 = new Media();
		m1.adicionar(5.6).adicionar(7.2).adicionar(8.4);//Encadeamento de funções, permitido por retornar uma instacia da propria classe Media.
		Media m2 = new Media().adicionar(6.4).adicionar(6.8).adicionar(7.2);//Encadeamento de funções, permitido por retornar uma instacia da propria classe Media.
		
		System.out.println(m1.getValor());
		System.out.println(m2.getValor());
		
		System.out.println(Media.Combinar(m1, m2).getValor());
	}

}
