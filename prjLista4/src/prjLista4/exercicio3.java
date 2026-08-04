package prjLista4;

import java.util.Scanner;

public class exercicio3 {
	
	public static void main(String[] args) {
		
		Scanner parimpar = new Scanner(System.in);
				double numero, resultado; 
				System.out.println("coloque quaquer numero e eu direi se é par ou impar:");
				numero = parimpar.nextDouble();
				
				resultado = numero % 2; 
				
				if (resultado == 0) {
					System.out.println("o seu numero é par");
				} else {
					System.out.println("o seu numero é impar");
				}
			
				parimpar.close();
		
	}

}
