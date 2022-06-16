package lambdas;

import java.util.Locale;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioLambdas {
	
	public static void main(String[] args) {
		
		
		/*
		 * 1. A partir do produto calcular o preço real com desconto.
		 * 2. Imposto municial: >= 2500(8,5%) / <2500 (isento).
		 * 3. Frete >= 3000 (100)/ < 3000(50).
		 * 4. Arredondar e deixar 2 casas decimais.
		 * 5. Formatar R$1234,56
		 */
		
		Function<Produtos, Double>precoDesc = 
				p -> p.preço *(1 - p.desconto);
		
		UnaryOperator<Double>imposto = 
				imp -> imp >=2500? imp * 1.085: imp;
		
		UnaryOperator<Double>frete = 
				preco -> preco >= 3000? preco + 100: preco+50;
		/*
		 * Deixar 2 casas decimais: passar a variavel double com string.format passando a variavel como paramntro
		 * depois fazer o parse double transformando a variavel string em Double novamente.
		 * Locale.ENGLISH por causa das configurações de local da maquina. Se não a função não funciona.
		 */
		UnaryOperator<Double>casaDecimal = 
				casas -> Double.parseDouble(String.format(Locale.ENGLISH,"%.2f", casas));
		
		Function<Double, String>formatada = 
				precoFinal -> ("O valor final foi R$ "+ precoFinal).replace(".", ",");
		
		Produtos prod = new Produtos("Notebook", 3600.45, 0.13);
		String valorFinal = precoDesc.andThen(imposto)
				.andThen(frete)
				.andThen(casaDecimal)
				.andThen(formatada).apply(prod);
		
		System.out.println(valorFinal);
		System.out.println("\n");
		
		System.out.println(precoDesc.andThen(imposto).andThen(frete).andThen(casaDecimal).andThen(formatada).apply(prod));
		
	}

}
