package lambdas;

public class Produtos {
	
	final String nome;
	final double preço;
	final double desconto;
	
	public Produtos(String nome, double preço, double desconto) {
		super();
		this.nome = nome;
		this.preço = preço;
		this.desconto = desconto;
	}

	public String getNome() {
		return nome;
	}

	public double getPreço() {
		return preço;
	}

	public double getDesconto() {
		return desconto;
	}
	
	

}
