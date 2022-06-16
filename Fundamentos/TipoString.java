package Fundamentos;

import java.util.Scanner;

public class TipoString {
	public static void main(String[] args) {
		System.out.println("Mariana Nogueira Tito".charAt(8));
		String s ="Boa tarde";
		System.out.println(s.concat(" Mariana Tito"));
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.toLowerCase().startsWith("boa"));
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Qual a sua idade - ");
		int idade = teclado.nextInt();
		teclado.nextLine();
		
		System.out.println("Qual o Seu nome - ");
		String nome = teclado.nextLine();
		
		System.out.println("Qual o seu sobrenome -");
		String sobreNome = teclado.nextLine();
		
		System.out.printf("%s %s %d - anos",nome,sobreNome,idade);
	}

}
