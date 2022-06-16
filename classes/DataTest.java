package classes;

public class DataTest {
	public static void main(String[] args) {
		
		Datas aniver = new Datas(19, " agosto ", 1980);
		Datas casamento = new Datas(01, " julho ", 2005);
		Datas padrão = new Datas();
		
		//System.out.println("Aniversario -> "+aniver.dia + aniver.mes + aniver.ano);
		//System.out.println("Casamento -> "+casamento.dia + casamento.mes + casamento.ano);
		
		System.out.println("Dia do Casamento - "+casamento.dataFormatada());
		System.out.printf("Dia do Aniversario  - "+aniver.dataTextoFormatado());
		System.out.println("\n"+padrão.dataTextoFormatado());
	}

}
