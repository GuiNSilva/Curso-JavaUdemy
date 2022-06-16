package lambdas;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;

public class Consumidor {
   // metodo precisa ser marcado como static
  //Definir Interface, <tipo>  e  nome
	 static Consumer<Produtos> imprimir =
			//função lambda
			p -> System.out.println(p.nome+"  valor = "+ p.preço);
			
		   
					
			
			public static void main(String[] args) {
				
				
				//Criando os produtos
				Produtos p1 = new Produtos("Notebook", 2400, 0.5);
				Produtos p2 = new Produtos("Impressora", 1100, 0.5);
				Produtos p3 = new Produtos("Monitor Led", 1500, 0.10);
				Produtos p4 = new Produtos("Placa de Video", 2000, 0.7);
				
				//Criar array para armazenar o produtos criados
				List<Produtos>produto= Arrays.asList(p1,p2,p3,p4);
				
				
				//Usando metodo foreach no Array de produtos e passando a função lambda.
				produto.forEach(imprimir);
			
			}

}
