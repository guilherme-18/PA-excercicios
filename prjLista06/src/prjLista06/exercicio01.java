package prjLista06;

import java.util.Scanner;

public class exercicio01 {
	public static void main(String[] args){
		Scanner item = new Scanner(System.in);
		double produto, desconto, valorFinal;
		
		System.out.println("coloque o valor total do produto");
		produto = item.nextDouble();
		
		if (produto <= 1000) {
			desconto = (produto*6) / 100;
			valorFinal = produto - desconto;
			System.out.println("o valor do seu produto com o desconto de 6% agora é: " + valorFinal);
		} else if (produto <= 2000) {
			desconto = (produto*8) / 100;
			valorFinal = produto - desconto;
			System.out.println("o valor do seu produto com o desconto de 8% agora é: " + valorFinal);
		} else if (produto <= 3000) {
			desconto = (produto*10) / 100;
			valorFinal = produto - desconto;
			System.out.println("o valor do seu produto com o desconto de 10% agora é: " + valorFinal);
		} else {
			desconto = (produto*16) / 100;
			valorFinal = produto - desconto;
			System.out.println("o valor do seu produto com o desconto de 16% agora é: " + valorFinal);
		}
		item.close();
	}
	
}
