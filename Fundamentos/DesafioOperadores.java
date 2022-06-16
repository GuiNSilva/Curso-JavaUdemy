package Fundamentos;

import java.lang.Math;
public class DesafioOperadores {
	public static void main(String[] args) {
		
		double a = 6*(3+2);
		a = Math.pow(a, 2)/3*2;
		
		double b = ((1-5)*(2-7))/2;
		b = Math.pow(b, 2);
		
		double d = Math.pow(10, 3);
		
		
		double expression2 = b;
		double expression1 = a; 
		double c = Math.pow( expression1 - expression2, 3);
		double fim =(int)c/d;
		System.out.println(fim);
		 
	}

}
