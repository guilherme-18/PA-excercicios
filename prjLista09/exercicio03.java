package prjLista09;

import java.util.Scanner;

public class exercicio03 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int n, i=1, a=1;
		System.out.println("Digite o número que será fatorial: ");
		n = ler.nextInt();
		
		while(a<=n) {
		i = i * a; 
		
		a++;
		}
		
		System.out.println(i);
		ler.close();
	}

}
