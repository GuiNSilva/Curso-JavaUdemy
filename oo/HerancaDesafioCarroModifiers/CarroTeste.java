package oo.HerancaDesafioCarroModifiers;

import oo.HerancaDesafioCarro.*;
import oo.HerancaDesafioCarro.Carro;



public class CarroTeste {
	public static void main(String[] args) {
		Carro c1 = new Carro(160);
		Ferrari f1 = new Ferrari();
		Fusca fusca = new Fusca(120);
		
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		c1.reduzir();
		c1.reduzir();
		System.out.println();
		
		f1.acelerar();
		f1.acelerar();
		f1.acelerar();
		f1.reduzir();
		f1.reduzir();
		System.out.println();
		
		fusca.acelerar();
		fusca.acelerar();
		fusca.acelerar();
		fusca.reduzir();
		fusca.reduzir();
		fusca.reduzir();
		fusca.reduzir();
	}
	

}
