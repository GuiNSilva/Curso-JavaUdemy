package oo.HerancaDesafioCarro;

public class Fusca extends Carro {
	
	
	public Fusca(int velo_Max){
		super(velo_Max);
		
	}
	
	
	@Override
	public void acelerar() {
		System.out.println("Velocidade atual "+ this.velocidade+"kmh");
		this.velocidade += 6;
		System.out.println("Acelerou "+ this.velocidade+"kmh");
		
	}
	

}
