package oo.Heranca;

public class Jogador {
	
	int x;
	int y;
	int vida = 100;
	
	
	
	boolean atacar(Jogador oponente) {
		int deltaX = Math.abs(x - oponente.x);
		int deltaY = Math.abs(y- oponente.y);
		
		if(deltaX == 0 && deltaY ==1) {//jogador x e y um ao lado do outro. Possivel atacar
			oponente.vida -=10;
			return true;
		}else if(deltaX==1 && deltaY ==1) {
			oponente.vida -=10;
			return true;
		}else {
			return false;
		}
	}
	
	
	boolean superHit(Jogador oponente) {
		int deltaX = Math.abs(x - oponente.x);
		int deltaY = Math.abs(y- oponente.y);
			
		if(deltaX == 0 && deltaY ==1) {//jogador x e y um ao lado do outro. Possivel atacar
			oponente.vida -=37;
			return true;
		}else if(deltaX==1 && deltaY ==1) {
			oponente.vida -=37;
			return true;
		}else {
			return false;
		}
	
	}
	
	boolean andar(Direcao direcao) {
		switch (direcao) {
		case NORTE:
			y--;
			break;
		case LESTE:
			x++;
			break;
		case OESTE:
			x--;
			break;
		case SUL:
			y++;
			break;

		}

		return true;

	 	
	}

}
