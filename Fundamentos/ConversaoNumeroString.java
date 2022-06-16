package Fundamentos;

public class ConversaoNumeroString {
	public static void main(String[] args) {
		//Conversão int para string usando metodos do wraper
		Integer n1 = 1000;
		 System.out.println(n1.toString().concat("$ Mil Reais"));
		 
		 Double n2 = 1.000000;
		 System.out.println(n2.toString().concat("$ Milhão de Reais"));
		 
		 
	}

}
