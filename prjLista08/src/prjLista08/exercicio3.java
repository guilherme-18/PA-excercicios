package prjLista08;

import java.util.Scanner;

public class exercicio3 {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int i=1, an, aa, id, maior=0, menor=0;
		
		while (i<6) {
			
			System.out.println("coloque o ano que voce nasceu: ");
			an = ler.nextInt();
			System.out.println("coloque o ano atual: ");
			aa = ler.nextInt();
			id = aa - an;
			
			System.out.println("sua idade é : "+id+"e você é");
			
			if (id<18) {
				System.out.println("menor de idade\n");
				menor++;
			} else {
				System.out.println("maior de idade\n");
				maior++;
			}
			i++;
		}
		System.out.println("\nMaiores = "+maior+"\nMenores = "+menor);
		ler.close();
	}
	
}

