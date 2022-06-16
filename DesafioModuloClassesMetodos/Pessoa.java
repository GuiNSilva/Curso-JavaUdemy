package DesafioModuloClassesMetodos;

public class Pessoa {
	String nome;
	double peso;
	
	public Pessoa(String nome, double peso) {
			this.nome = nome;
			this.peso = peso;
		// TODO Auto-generated constructor stub
	}
	
	void comer(Comida c) {
		this.peso += c.peso;
	}
	
	String pesoAtt() {
	 String pesoAtualizado = ("O peso de "+ this.nome +" apos o jantar e de "+this.peso+" kilogramas \n" );
	 return pesoAtualizado;
	}

}
