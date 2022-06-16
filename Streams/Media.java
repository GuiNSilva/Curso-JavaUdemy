package Streams;

public class Media {
	private double total;
	private int qtde ;
	
	//Função que vai acumular o valor das notas
	//retornando a propria instancia da classe, permite o encadeamento dos metodos na classe principal.
	public Media adicionar(double valor) {
		total += valor;
		qtde ++; 
		return this;
	}
	
	
	//função que calcula a media
	public double getValor() {
		return total /qtde;
		
	}
	
	public  static Media Combinar(Media m1, Media m2) {
		Media resultante = new Media();
		resultante.total = 	m1.total +m2.total;
		resultante.qtde = m1.qtde + m2.qtde;
		return resultante;
		
	}

}
