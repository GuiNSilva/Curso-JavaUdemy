package EstruturasDeControle;

public class ExeEstruturas01 {
	public static void main(String[] args) {
		int num = 3;
		boolean par = false;
		
		if(num %2 == 0) {
			par = true;
			if(num >= 0 && num <=10) {
				System.out.println("Numero par e dentro do range");
			}
		if(par == false || num >10) {
			System.out.println("numero impar ou fora do range");
			
		}
		
		}

		}
}
		
