package comando.swich;

import java.util.Scanner;

public class ComandoSwitch {

	public static void main(String[] args) {
	
		System.out.println("Digite um n�mero de 1 a 7:");

		Scanner diaTeclado	= new Scanner(System.in);
		
		int dia = diaTeclado.nextInt();
		
		switch (dia) {
		case 1:
			System.out.println("Hoje � Domingo");
			break;
		case 2:
			System.out.println("Hoje � segunda");
			break;
		case 3:
			System.out.println("Hoje � ter�a");
			break;
		case 4:
			System.out.println("Hoje � quarta");
			break;
		case 5:
			System.out.println("Hoje � quinta");
			break;
		case 6:
			System.out.println("Hoje � sexta");
			break;
		case 7:
			System.out.println("Hoje � sabado");
		default:
			break;
		}
 
	}

}
