package DesafioModuloClassesMetodos;

public class Jantar {
	public static void main(String[] args) {
		Pessoa C = new Pessoa("Carlos", 72.0);
		Pessoa D = new Pessoa("Dani", 63.0);
		
		Comida c1 = new Comida("Prato feijoada", 0.350);
		Comida c2 = new Comida("Prato churrasco", 0.500);
		
		
		System.out.printf("O peso de " + C.nome + " antes do jantar era "+C.peso+" kilogramas\n");
		C.comer(c2);
		System.out.printf(C.pesoAtt());
		System.out.println("\n");
		
		System.out.printf("O peso de " + D.nome + " antes do jantar era "+D.peso+" kilogramas\n");
		D.comer(c2);
		D.comer(c1);
		System.out.printf(D.pesoAtt());
	}

}
