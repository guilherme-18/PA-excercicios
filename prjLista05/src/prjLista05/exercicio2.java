package prjLista05;

import java.util.Scanner;

public class exercicio2 {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int km, ct, kmph;
		
		System.out.println("coloque a distancia que o seu carro percorreu em kilometros: ");
		km = ler.nextInt();
		System.out.println("coloque a capacidade do tanque de gasolina: ");
		ct = ler.nextInt();
		
		kmph = km/ct;  
		
		if (kmph<=10) {
			System.out.println("seu carro não é economico e gasta " + kmph + " litros por kilometros");
		} else {
			System.out.println("seu carro é economico e gasta " + kmph + " litros por kilometros");
		}
		ler.close();
		
	}

}
