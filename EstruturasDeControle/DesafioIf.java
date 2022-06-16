package EstruturasDeControle;

import java.util.Scanner;

public class DesafioIf {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe o dia da semana ");
		String dia = teclado.next().toLowerCase();
		boolean valid = true;
		
		if (dia.equals("domingo")) {
			System.out.println("Dia 1 da semana ");
			
		}else if (dia.equals("segunda")) {
			System.out.println("Dia 2 da semana");
			
		}else if (dia.equals("terça") ) {
			System.out.println("Dia 3 da semana");
			
		}else if (dia.equals("quarta")) {
			System.out.println("Dia 4 da semana");
			
		}else if (dia.equals("quinta")) {
			System.out.println("Dia 5 da semana");
			
		}else if (dia.equals("sexta")) {
			System.out.println("Dia 6 da semana");
			
		}else if (dia.equals("sabado")) {
			System.out.println("Dia 7 da semana");
			
		}else{
			valid = false;
			System.out.println("Dia Inválido");
		}
		
		if(valid==true){
			if(dia.equalsIgnoreCase("sabado") || dia.equalsIgnoreCase("domingo") & valid == true );
			
			System.out.println(dia);
		}else {
			System.out.println(dia+ " feira");
		}
		teclado.close();
	}

}
