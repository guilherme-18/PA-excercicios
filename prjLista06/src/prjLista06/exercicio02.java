package prjLista06;

import java.util.Scanner;

public class exercicio02 {
	public static void main(String[] args){
		Scanner tempo = new Scanner(System.in);
		double ano;
		
		System.out.println("entre com o ano atual: ");
		ano = tempo.nextDouble();
		
		if (ano % 4 == 0) {
			System.out.println("o ano é bissexto");
		} else {
			System.out.println("o ano não é bissexto");
		}
		tempo.close();
		
	}
}
