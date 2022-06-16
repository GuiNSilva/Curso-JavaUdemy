package Fundamentos;

import java.util.Scanner;

public class DeafioConversao {
	public static void main(String[] args) {
	
		String func1;
		String func2;
		String func3;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Salario do funcionario 1");
		func1=teclado.next().replace(",", ".");
		
		System.out.println("Salario do funcionario 2");
		func2=teclado.next().replace(",", ".");
		
		System.out.println("Salario do funcionario 3");
		func3=teclado.next().replace(",", ".");
		
		Double sal1 = Double.parseDouble(func1);
		Double sal2 = Double.parseDouble(func2);
		Double sal3 = Double.parseDouble(func3);
		
		Double total = sal1+sal2+sal3;
		Double media = total/3;
		System.out.println("A media dos Salarios e R$"+media);
		
		//System.out.printf("Salario 1 = %sR$ Salarios 2 = %sR$ Salario 3 = %sR$",func1,func2,func3);
		//System.out.printf("Media Salarial e R$%.2d",media);
		
		teclado.close();
	}
	
	
	
	
	

}
