package oo.ComprasDesafio;

import java.util.ArrayList;
import java.util.List;

public class ClientD {
	String nome;
	List<CompraD>comprasd = new ArrayList<>();
	
	public ClientD() {
		super();
	}


	public ClientD(String nome, List<CompraD> comprasd) {
		super();
		this.nome = nome;
		this.comprasd = comprasd;
	}
	
	double obterValorFinal() {
		double soma = 0;
		
		for(CompraD compra: comprasd) {
			soma += compra.obterValorTotal();
		}
			return soma;
	}
	
	

}
