package Fundamentos;

import java.util.Date;
import java.util.Scanner;

import javax.xml.crypto.Data;

public class Temperatura {
	//(�F - 32)x 5/9 = �C 
	public static void main(String[] args) {
		final double fator1 = 32;
		final double fator2 = 5/9.0;
		double farenheit; 
		double celsius;
		Date d = new Date();

		Scanner ler = new Scanner(System.in);
		System.out.println("Informe a temperatura em Farenheits - ");
		farenheit = ler.nextDouble();
		
		celsius= (farenheit -fator1)* fator2;
		System.out.println(d);
		System.out.println(farenheit+ "� graus farenheits equivalem a "+celsius+"� graus celsius.");
		
	}

}
