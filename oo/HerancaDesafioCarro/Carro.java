package oo.HerancaDesafioCarro;

public class Carro {

	int velocidade = 0;
	int VELOCIDADE_MAXIMA;
	int reducao = 5;

	public Carro(int velocidademaxima){
		VELOCIDADE_MAXIMA = velocidademaxima;
		
	}
	
	public void acelerar() {
		//System.out.println("Velocidade atual "+ this.velocidade+"kmh");
		if(velocidade +5 >VELOCIDADE_MAXIMA) {
			velocidade = VELOCIDADE_MAXIMA;
		}else {
			this.velocidade += 10;
			System.out.println("Acelerou. Velocidade atual "+ this.velocidade+"kmh");
		}

	}

	 public void reduzir() {
		if(this.velocidade > 0) {
			this.velocidade -= this.reducao;
			//this.velocidade -= 5;
			System.out.println("Velocidade reduziu "+this.reducao+ "Kmh, Velocidade Atualizada"+this.velocidade+" Kmh");;
			if(this.velocidade <5) {
				this.velocidade -= this.velocidade;
				System.out.println("Velocidade Reduziu, Carro Parou! "+this.velocidade+" Kmh");
			}
		}

	}

}
