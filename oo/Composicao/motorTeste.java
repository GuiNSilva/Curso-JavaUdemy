package oo.Composicao;

public class motorTeste {
	public static void main(String[] args) {
		Carro m1 = new Carro();
		
		 System.out.println(m1.motorLigado());
		 m1.ligado();
		 System.out.println(m1.motorLigado());
		 
		 m1.acelerar();
		 System.out.println(m1.motor.giros());
		 m1.acelerar();
		 m1.acelerar();
		 m1.acelerar();
		 m1.acelerar();
		 m1.acelerar();
		 System.out.println(m1.motor.giros());
		 m1.frear();
		 m1.frear();
		 m1.frear();
		 System.out.println(m1.motor.giros());
		 
	}

}
