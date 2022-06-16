package classes;

public class Produto {
	String nome;
	double preco;
	static double descPadrao = 0.25;
	
	public Produto(String nome, double preco) {
		super();
		this.nome = nome;
		this.preco = preco;
		
	}
	
	double descontoPadrao() {
		double desconto = this.preco * descPadrao;
		 double novoPreco = this.preco - desconto;
		 return novoPreco ;
		
	}
	
	
	 double descontoDez(double preco) {
		 double desconto = this.preco * 0.10;
		 double novoPreco = this.preco - desconto;
		 return novoPreco ;
	 }
	 
	 double descontoEspecial(double percentual) {
		 double percent = percentual/100;
		 double desconto = this.preco * percent;
		 double novoPreco = this.preco - desconto;
		 return novoPreco ;
		 
	 }
	

}
