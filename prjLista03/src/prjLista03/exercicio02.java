package prjLista03;

import java.util.Scanner;

public class exercicio02 {
	public static void main(String[] args) {
		
		Scanner comprimentoLargura = new Scanner(System.in);
		double comprimento, largura, latas;
		System.out.println("ponha o comprimento da parede");
		comprimento = comprimentoLargura.nextInt();
		System.out.println("ponha a largura da parede");
		largura = comprimentoLargura.nextInt();
		latas = largura*comprimento/3.8;
		
		System.out.println("a quantidade de latas ultilizadas: "+latas);
		comprimentoLargura.close();
		
	}
}
