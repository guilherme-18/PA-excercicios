package prjLista05;

import java.util.Scanner;

public class exercicio1 {

		public static void main(String[] args) {
			Scanner ler = new Scanner(System.in);
			int id, an, aa;
			
			System.out.println("Entre com o ano atual:");
			aa = ler.nextInt();
			
			System.out.println("Entre com o ano de nascimento:");
			an = ler.nextInt();
			
			id = aa - an;
			
			if(id<10) {
				System.out.println(id+" anos, crinça");
			} else if (id<18) {
				System.out.println(id+" anos, jovem");
			} else if (id<60) {
				System.out.println(id+" anos, adulto");
			} else if (id<100) {
				System.out.println(id+" anos, veio");
			} else {
				System.out.println(id+" anos, quase a idade da aline");
			}
				
			ler.close();
					
		}

}
