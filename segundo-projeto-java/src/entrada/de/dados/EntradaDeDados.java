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
	
		JOptionPane.showConfirmDialog(null, "Voc� Gostaria de Ver a M�dia das Notas ?");
		
		if (med >5) {
		 if (med >7) {
			JOptionPane.showMessageDialog(null, "Parab�ns Voc� Foi Aprovado, A sua M�dia Final � : " + med);
		}
		 else {
			 JOptionPane.showMessageDialog(null, "Voc� est� de recupera��o, A sua M�dia Final � : " + med); 
		 }
		 }
		 
		else {
			JOptionPane.showMessageDialog(null, "Voc� est� Reprovado, "
					+ "A sua M�dia Final � : " + med);
		}
	

}
}
