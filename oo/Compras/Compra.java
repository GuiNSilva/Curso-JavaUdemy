package oo.Compras;

import java.util.ArrayList;

public class Compra {
	Cliente cliente = new Cliente(null, null);
	ArrayList<Item> itens = new ArrayList<>();

	public Compra(Cliente cliente) {
		super();
		this.cliente = cliente;
	}

	public Compra() {

	}
	
	double somarValorTotal() {
		double soma = 0;
		for(Item iten : itens) {
			soma += iten.preco * iten.qtde;
		}
		return soma;
	}
	
	void informarValorFinal() {
		for(Item iten: itens) {
			System.out.println("Produto:"+iten.nome+"- Quantidade:"+iten.qtde+" -Preço Unitario R$ "+iten.preco);
		}
		System.out.println("Total da compra = R$ "+ somarValorTotal()+"\n\n");
	}

	void listarItens() {

		if (itens.isEmpty()) {
			System.out.println("Cliente: " + cliente.nome);
			System.out.println("Carrinho Vazio!!\n");
		} else {
			System.out.println("Cliente : " + cliente.nome);
			System.out.println("==============");
			int qtdTotal = 0;
			for (Item iten : itens) {
				if (iten.qtde > 0) {
					int qtde = iten.qtde;
					qtdTotal += iten.qtde;
					System.out.println("Produto: " + iten.nome + "\nQuantidade: " + iten.qtde);
					System.out.println("--------");

				}
			}

			System.out.println("Total de itens no carrinho - " + qtdTotal + "\n");
		}
	}

}
