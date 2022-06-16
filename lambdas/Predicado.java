package lambdas;

import java.net.MulticastSocket;
import java.util.function.Predicate;

public class Predicado {
	
	public static void main(String[] args) {
		
		/*
		 * Interface Funcional Predicate com funçoes lambda
		 */
		Predicate<Produtos> isCaro = produto ->(produto.preço >= 750);
		
		Predicate<Produtos>isCaroDesconto = produto -> (produto.preço *(1 - produto.desconto))>= 750;
		
		Produtos prod = new Produtos("notebook", 1400, 0.15);
		System.out.println(isCaro.test(prod));
		Produtos impress = new Produtos("Impressora", 570, 0.10);
		System.out.println(isCaroDesconto.test(impress));
	}

}
