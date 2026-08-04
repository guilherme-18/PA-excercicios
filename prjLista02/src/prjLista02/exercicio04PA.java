package prjLista02;

import java.util.Scanner;

public class exercicio04PA {

	public static void main(String[] args) {
		Scanner DMA = new Scanner(System.in);
		int dias, messes, anos;
		
		System.out.println("ponha um numero de dias: ");
		dias= DMA.nextInt();
		messes= dias/30;
		anos= messes/12;
		
		System.out.println("aqui esta o valor de dias em messes: "+ messes);
		System.out.println("aqui esta o valor de messes em anos: "+ anos);
		DMA.close();
	}

}
