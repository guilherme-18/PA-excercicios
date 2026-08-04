package prjLista05;

import java.util.Scanner;

public class exercicio4 {
	
	public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	
	double A, B, C, X1, X2, delta;
	
	System.out.println("entre como valor do A");
	A = ler.nextDouble();
	System.out.println("entre como valor do b");
	B = ler.nextDouble();
	System.out.println("entre como valor do c");
	C = ler.nextDouble();
	
	delta = ((B*B) -4 * A * C);
	
	X1 = (-B + Math.sqrt(delta))/(2*A);
	X2 = (-B - Math.sqrt(delta))/(2*A);
	
	System.out.println("x1 : " + X1);
	System.out.println("x2: " + X2);
	
	if (Math.sqrt(delta)> 0) {
		System.out.println("o delta é positivo");
	} else if (Math.sqrt(delta)==0) {
		System.out.println("o delta é zero");
	} else {
		System.out.println("o delta é negativo");
	}
	
	ler.close();
	}

}
