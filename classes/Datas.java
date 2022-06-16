package classes;

public class Datas {
	
	int dia;
	String mes;
	int ano;
	
	Datas(){
			dia = 1;
			mes = "Janeiro";
			ano = 1970;
		}
	
	 Datas(int dia, String mes, int ano) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	String dataFormatada() {
		String dDia = Integer.toString(this.dia);
		String dMes = this.mes;
		String dAno = Integer.toString(this.ano);
		String formatada = dDia + dMes + dAno;
		
		return formatada;
				
	}
	
	String dataTextoFormatado() {
		 
		return String.format("%d/%s/%d",dia, mes, ano);
	}
	
	

}
