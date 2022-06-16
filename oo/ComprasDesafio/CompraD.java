package oo.ComprasDesafio;

import java.util.ArrayList;
import java.util.List;

public class CompraD {
	List<ItemD>intend = new ArrayList<>();
	
	void adicionaItem(ProdutoD p , int qtde) {
		this.intend.add(new ItemD (qtde, p));
	}
	
	double obterValorTotal() {
		double total = 0;
		
		for(ItemD itens: intend) {
			total = itens.qtde * itens.produtod.preco;
		}
		
		return total;
	}
	
	
	
	
	

}
