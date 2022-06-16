package oo.ComprasDesafio;

public class DesafioCompraTeste {

	public static void main(String[] args) {
		ClientD cliente1 = new ClientD();
		
		CompraD compra1 = new CompraD();
		
		compra1.adicionaItem(new ProdutoD("Caneta", 2),3);
		compra1.adicionaItem(new ProdutoD("Mesa", 450),3);

		CompraD compra2 = new CompraD();
		compra2.adicionaItem(new ProdutoD("Monitor", 1780), 2);
		
		cliente1.comprasd.add(compra1);
		cliente1.comprasd.add(compra2);
		
		System.out.println(cliente1.obterValorFinal());
	}
}
