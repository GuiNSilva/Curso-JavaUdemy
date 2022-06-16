package oo.Heranca;

public class Jogo {
	public static void main(String[] args) {
		Jogador heroi = new Jogador();
		Jogador monstro = new Jogador();
		
		heroi.x = 10;
		heroi.y = 10;
		
		monstro.x = 10;
		monstro.y = 11;
		
		
		System.out.println("Vida do heroi -" + heroi.vida);
		System.out.println("Vida do monstro -" + monstro.vida);
		
		monstro.atacar(heroi);
		monstro.atacar(heroi);
		monstro.atacar(heroi);

		System.out.println("Vida do heroi ->" + heroi.vida);
		System.out.println("Vida do monstro ->" + monstro.vida);
		
		heroi.superHit(monstro);
		heroi.superHit(monstro);
		
		System.out.println("Vida do heroi ->" + heroi.vida);
		System.out.println("Vida do monstro ->" + monstro.vida);
		

		
	
	}
	
	

}
