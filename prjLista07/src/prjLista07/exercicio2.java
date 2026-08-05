package prjLista07;

import java.util.Scanner;

public class exercicio2 {
	
public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int mês;
		
		System.out.println("coloque o numero do mês desejado que eu direi se ele tem 31, 30 ou 28 dias: ");
		mês = ler.nextInt();
		
		switch(mês) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.println("o mês que voce colocou, acaba no dia 31");
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println("o mês que voce colocou, acaba no dia 30");
				break;
			case 2:
				System.out.println("o mês que voce colocou, acaba no dia 28");
				break;
			default:
				System.out.println("o mês escolhido é invalido");
		}
		
		ler.close();
		
	}

}
