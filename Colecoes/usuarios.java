package Colecoes;

import java.util.Objects;

public class usuarios {

	String nomes;
	
	 usuarios(String nome) {
		this.nomes = nome;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nomes);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		usuarios other = (usuarios) obj;
		return Objects.equals(nomes, other.nomes);
	}
	 
	 

}
