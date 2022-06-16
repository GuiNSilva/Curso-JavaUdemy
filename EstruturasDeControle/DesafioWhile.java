package EstruturasDeControle;

import java.util.Scanner;

public class DesafioWhile {
	public static void main(String[] args) {
		
		Scanner frase = new Scanner(System.in);
		String fim =""; 
		
		while(!fim.equalsIgnoreCase("sair")) {
			System.out.print("Diga algo !");
			fim = frase.nextLine();
			}
			
			frase.close();
			
		}
	}


