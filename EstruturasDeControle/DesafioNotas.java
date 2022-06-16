package EstruturasDeControle;

import java.util.Scanner;

public class DesafioNotas {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double nota = 0;
		double acumulador = 0;
		int qtdNotas = 0;
		
		while(nota != -1) {
			System.out.print("Informe a nota ou digite -1 para sair ");
			nota = entrada.nextDouble();
			if(nota>= 0 && nota <=10) {
				acumulador += nota;
				qtdNotas ++;
			}else if(nota > 10) {
				System.out.print("Digite uma nota valida\n ");
			}
			
		}
		double media = acumulador/qtdNotas;
		
		System.out.printf("Foram digitadas %d notas no sistema\n",qtdNotas);
		System.out.printf("A soma total das notas foi %.1f pontos\n",acumulador);
		System.out.printf("A media do aluno foi %.2f ",media);
		entrada.close();
		
	}

}
