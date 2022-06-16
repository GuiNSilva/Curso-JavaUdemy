package oo.Compras;

public class carrinhoCompras {
	public static void main(String[] args) {
		Compra compra = new Compra(new Cliente("Guilherme", "054"));
		Compra compra2 = new Compra(new Cliente("Borges","066"));
		
		compra.itens.add(new Item("Borracha" ,4, 3.50));
		compra.itens.add(new Item("Lapis", 10, 2.10));
		compra.itens.add(new Item("Caderno", 7, 8.60));
		compra.listarItens();
		compra2.listarItens();
		compra2.itens.add(new Item("Caneta Preta", 12, 4.00));
		compra2.listarItens();
		compra.informarValorFinal();
		compra2.informarValorFinal();
		
		
		
	}

}
