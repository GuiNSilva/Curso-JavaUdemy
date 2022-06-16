package lambdas;

public class CalculoTeste1 {
	public static void main(String[] args) {
		/*
		 * Instanciado a interface Calculo com a variavel calculo,
		 * mesma variavel usando as diferentes implementaçoes da 
		 * Interface Calculo soma e multiplicação
		 */
		
		
		
		//implementou classe Somar.
		Calculo calculo = new Somar();
		System.out.println(calculo.executar(45, 32));
		
		//implementou classe multiplicar
		calculo = new Multiplicar();
		System.out.println(calculo.executar(45, 3));
		
		
		/*
		 * implementação lambda function  para o metodo da interface Calculo.
		 * não necessita implementar uma classe separada para definir o metodo.
		 * Instancia o objeto interface recebendo os parametros do metodo 
		 * entre  parenteses(x,x) e aponta -> o return com
		 * a operação desejada
		 */
		
		Calculo subtrair = (a,b) -> {return a-b; };
		
		
		
		/*
		 * Possivel apontar a operação sem o par de chaves {}
		 * Não necessario return, sem as chaves o return fica
		 * implícito.
		 */
		Calculo dividir = (a,b)-> a / b ;
		
		//Utilizando lambda function.
		System.out.println(subtrair.executar(35, 15));
		System.out.println(dividir.executar(35, 3));
		
		
	}

}
