package oo.HerancaDesafioCarro;

public class Ferrari extends Carro {
	
	public Ferrari(){
		super(350);
	}
	
	
	@Override
	public void acelerar() {
		//System.out.println("Velocidade atual "+ this.velocidade+"kmh");
		this.velocidade += 15;
		System.out.println("Acelerou. Velocidade atual "+ this.velocidade+"kmh");
		
	}
	

}
