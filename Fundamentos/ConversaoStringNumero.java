package Fundamentos;

import javax.swing.JOptionPane;

public class ConversaoStringNumero {
	public static void main(String[] args) {
		String n1 = JOptionPane.showInputDialog("Digite a nota 1");
		String n2 = JOptionPane.showInputDialog("Digite a nota 2");
		
		 	Double a = Double.parseDouble(n1);
		 	Double b = Double.parseDouble(n2);
		 	
		 	Double soma = a+b;
		 	System.out.println("A soma das notas = a "+ soma);
		 	System.out.println("A media do aluno foi "+ soma/2);
		 	Double media = soma/2;
		 	JOptionPane.showInputDialog("Media do aluno = ", media);
	}

}
