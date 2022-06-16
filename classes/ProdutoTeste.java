package classes;

public class ProdutoTeste {
	public static void main(String[] args) {
		Produto teclado = new Produto(" Roland New Fantom ", 13000);
		System.out.println("Produto preço cheio -> "+ teclado.nome + teclado.preco);
		
		Produto baixo = new Produto(" Yamaha TRB-6 ", 12000);
		System.out.println("Produto preço cheio -> "+ baixo.nome + baixo.preco);
		
		Produto piano = new Produto("Steinway", 23000);
		
		System.out.println("\nPreço do teclado com desconto 10% "+ teclado.descontoDez(teclado.preco));
		System.out.println("\nPreço do baixo com desconto 10%  "+ baixo.descontoDez(teclado.preco));
		System.out.println("\nPreço do baixo com desconto especial "+ baixo.descontoEspecial(14));
		System.out.println("\nPiano Steinway com desconto Padrao "+ piano.descontoPadrao());
		
	}

}
