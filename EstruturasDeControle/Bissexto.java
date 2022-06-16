package EstruturasDeControle;

import java.util.Scanner;

public class Bissexto {
	public static void main(String[] args) {
		Scanner ano = new Scanner(System.in);
		System.out.println("Digite o ano");
		int Ano = ano.nextInt();
		
		boolean bissexto = Ano % 4 == 0 && (((Ano % 100) != 0) || Ano % 400 == 0);
		
		if(bissexto ) {
			System.out.println("Bissexto");
		}else {
			System.out.println("Não Bissexto");
		}

		
	}

}
