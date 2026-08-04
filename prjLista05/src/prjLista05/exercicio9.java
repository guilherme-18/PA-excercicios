package prjLista05;

import java.util.Scanner;

public class exercicio9 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double salario, desconto;
		
		System.out.println("coloque o seu salario atual: ");
		salario = ler.nextDouble();
		
		if (salario <= 1434.59) {
			System.out.println("voce não tem disconto no IRPF");
		} else if (salario <= 2150.00) {
			desconto = (salario*7.5)/100;
			System.out.println("o seu desconto do IRPF é: " + desconto);
		} else if (salario <= 2866.70) {
			desconto = (salario*15)/100;
			System.out.println("o seu desconto do IRPF é: " + desconto);
		} else if (salario <= 3582.00) {
			desconto = (salario*22.5)/100;
			System.out.println("o seu desconto do IRPF é: " + desconto);
		} else {
			desconto = (salario*27.5)/100;
			System.out.println("o seu desconto do IRPF é: " + desconto);
		} 
		
		ler.close();
		}

}
