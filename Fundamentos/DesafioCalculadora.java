package Fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
	public static void main(String[] args) {
		Scanner op = new Scanner(System.in);
		System.out.println("Informe o primeiro numero: ");
		double num1 = op.nextDouble();
		
		System.out.println("Informe o segundo numero: ");
		double num2 = op.nextDouble();
		
		System.out.println("Informe a operação");
		String operacao = op.next();
		
		double resultado = "+".equals(operacao)? num1+num2:0;
		resultado = "-".equals(operacao) ?num1 - num2: resultado;
		resultado = "*".equals(operacao)? num1 * num2: resultado;
		resultado = "/".equals(operacao)? num1 / num2: resultado;
		resultado = "%".equals(operacao)? num1 % num2: resultado;
		
		System.out.printf("%.2f %s %.2f = %.2f", num1,operacao,num2,resultado);
		
		op.close();
		
	}

}
