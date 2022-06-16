package oo.Composicao;

public class Carro {
	
	Motor motor = new Motor();
	
	void acelerar() {
		motor.fatorInjecao += 0.4;
	}
	
	void frear() {
		motor.fatorInjecao -= 0.4;	
	}
	
	void ligado() {
		motor.ligado = true;
	}
	
	void desligado() {
		motor.ligado = false;
	}
	
	
	boolean motorLigado() {
		return motor.ligado;
	}

}
