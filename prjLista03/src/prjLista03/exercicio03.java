package prjLista03;

import java.util.Scanner;

public class exercicio03 {
	public static void main(String[] args) {
		Scanner eurosReais = new Scanner(System.in);
		
		double euro, cotação;
		System.out.println("coloque o dinheiro em euro");
		euro = eurosReais.nextDouble();
		cotação = euro/0.17;
		System.out.println("aqui esta o valor do dolar em reais: "+cotação);
		eurosReais.close();	
		
	}
}
