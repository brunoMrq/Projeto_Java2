package entrada.de.dados;

import javax.swing.JOptionPane;

public class EntradaDeDados {

	public static void main(String[] args) {
	
		String nota1 = JOptionPane.showInputDialog("Informe a Nota 1:"); 
		String nota2 = JOptionPane.showInputDialog("Informe a Nota 2:"); 
		String nota3 = JOptionPane.showInputDialog("Informe a Nota 3:"); 
		String nota4 = JOptionPane.showInputDialog("Informe a Nota 4:");
		
		double n1 = Double.parseDouble(nota1);
		double n2 = Double.parseDouble(nota2);
		double n3 = Double.parseDouble(nota3);
		double n4 = Double.parseDouble(nota4);
		
		double med = (n1 + n2 + n3 + n4)/4;
	
		JOptionPane.showConfirmDialog(null, "Você Gostaria de Ver a Média das Notas ?");
		
		if (med >5) {
		 if (med >7) {
			JOptionPane.showMessageDialog(null, "Parabéns Você Foi Aprovado, A sua Média Final é : " + med);
		}
		 else {
			 JOptionPane.showMessageDialog(null, "Você está de recuperação, A sua Média Final é : " + med); 
		 }
		 }
		 
		else {
			JOptionPane.showMessageDialog(null, "Você está Reprovado, "
					+ "A sua Média Final é : " + med);
		}
	

}
}
