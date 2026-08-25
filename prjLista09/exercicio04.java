package prjLista09;

import java.util.Scanner;

public class exercicio04 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int base, expoente, resultado, i=1;
		
		System.out.println("coloque o numero que eu direi a sua potencia ");
		System.out.println("coloque o numero da base: ");
		base = ler.nextInt();
		resultado = base;
		System.out.println("coloque o numero da expoente: ");
		expoente = ler.nextInt();
		
		while (i<expoente) {
			resultado = resultado * base;
			i++;
		}
		System.out.println("o resultado da potencia é : " + resultado);
		ler.close();
	}

}
