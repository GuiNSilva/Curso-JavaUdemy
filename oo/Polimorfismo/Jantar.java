package oo.Polimorfismo;

public class Jantar {
	public static void main(String[] args) {
		Pessoa p = new Pessoa(72);
		
		Arroz a = new Arroz(0.25);
		Feijao f = new Feijao(0.30);
		Sorvete s = new Sorvete(0.70);
		System.out.println(p.getPeso());
		
		p.comer(a);
		p.comer(s);
		System.out.println("\n"+p.getPeso());
		p.comer(f);
		System.out.println("\n"+p.getPeso());
	}

}
