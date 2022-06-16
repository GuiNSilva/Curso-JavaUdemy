package oo.Heranca;

public class heroi extends Jogador {
	
	

	boolean atacar(Jogador oponente) {
		int deltaX = Math.abs(x - oponente.x);
		int deltaY = Math.abs(y- oponente.y);
		
		if(deltaX == 0 && deltaY ==1) {//jogador x e y um ao lado do outro. Possivel atacar
			oponente.vida -=16;
			return true;
		}else if(deltaX==1 && deltaY ==1) {
			oponente.vida -=16;
			return true;
		}else {
			return false;
		}
	}
		
	
}
