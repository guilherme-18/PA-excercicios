package prjLista09;

import java.util.Scanner;

public class exercicio05 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int i=1, j=0, num, ai=0, soma=0;
		System.out.println("informe até que numero a sequencia de fibonacci vai ir: ");
		num = ler.nextInt();
		
		while (ai<num) {
			soma = i + j;
			i = j;
			j = soma;
			
			ai++;
		}
		System.out.println("o resultado é: " + soma);
		ler.close();
	}

}
