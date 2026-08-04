package prjLista05;

import java.util.Scanner;

public class exercicio3 {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double p, a, paq;
		System.out.println("entre com o seu peso em KG: ");
		p = ler.nextDouble();
		System.out.println("entre com a sua altura em M: ");
		a = ler.nextDouble(); 
		
		paq = p/(a*a);
		
		if (paq<= 18.5) {
			System.out.println("seu IMC é " + paq + " e voce esta com exesso de magreza");
		} else if (paq<=25)  {
			System.out.println("seu IMC é " + paq + " e voce esta com peso normal");
		} else if (paq<=30) {
			System.out.println("seu IMC é " + paq + " e voce esta com exesso de peso");
		} else if (paq<=35) {
			System.out.println("seu IMC é " + paq + " e voce esta com obesidade grau 1");
		} else if (paq<=40) {
			System.out.println("seu IMC é " + paq + " e voce esta com obesidade grau 2");
		} else {
			System.out.println("seu IMC é " + paq + " e voce esta com obesidade grau 3");
		}
		ler.close();
		
	}

}
