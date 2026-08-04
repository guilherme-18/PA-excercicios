package prjLista05;

import java.util.Scanner;

public class exercicio6 {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int A, B, C; 
		
		System.out.println("Coloque um valor para o A: ");
		A = ler.nextInt();
		System.out.println("Coloque um valor para o B: ");
		B = ler.nextInt();
		System.out.println("Coloque um valor para o C: ");
		C = ler.nextInt();
		
		 if (A <= B && B <= C) {
	            System.out.println("o numero menor A: " + A);
	            System.out.println("o numero do meio B: " + B);
	            System.out.println("o numero maior C: " + C);
	        } else if (A <= C && C <= B) {
	            System.out.println("o numero menor A: " + A);
	            System.out.println("o numero do meio C: " + C);
	            System.out.println("o numero maior B: " + B);
	        } else if (B <= A && A <= C) {
	            System.out.println("o numero menor B: " + B);
	            System.out.println("o numero do meio A: " + A);
	            System.out.println("o numero maior C: " + C);
	        } else if (B <= C && C <= A) {
	            System.out.println("o numero menor B: " + B);
	            System.out.println("o numero do meio C: " + C);
	            System.out.println("o numero maior A: " + A);
	        } else if (C <= B && B <= A) {
	            System.out.println("o numero menor C: " + C);
	            System.out.println("o numero do meio B: " + B);
	            System.out.println("o numero maior A: " + A);
	        } else {
	            System.out.println("o numero menor C: " + C);
	            System.out.println("o numero do meio A: " + A);
	            System.out.println("o numero maior B: " + B);
	        }
		 
		ler.close();
		
	}

}
