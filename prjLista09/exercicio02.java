package prjLista09;

import java.util.Scanner;

public class exercicio02 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int id, pessoas=0, numero=1, q1=0, q2=0, q3=0, q4=0, q5=0;
		double pc1=0, pc2=0, pc3=0, pc4=0, pc5=0;
		while (pessoas<10) {
			
			System.out.println("coloque a idade da " + numero + "⁰ pessoa");
			numero++;		
			id = ler.nextInt();
			
			if (id<=15){
				q1 = q1 + 1;  
			} else if (id<=30) {
				q2 = q2 + 1;
			} else if (id<=45) {
				q3 = q3 + 1;
			} else if (id<=60) {
				q4 = q4 + 1;
			} else {
				q5 = q5 + 1;  
			}
			
					
			pessoas = pessoas + 1;
		}
		
		pc1 = (100 * q1) / pessoas;
		pc2 = (100 * q2) / pessoas;
		pc3 = (100 * q3) / pessoas;
		pc4 = (100 * q4) / pessoas;
		pc5 = (100 * q5) / pessoas;
		
		
		System.out.println("\na quantidade de pessoa na primeira faixa etaria é: " + q1 + " porcentagem: " + pc1 + "%");
		System.out.println("a quantidade de pessoa na segunda faixa etaria é: " + q2 + " porcentagem: " + pc2 + "%");
		System.out.println("a quantidade de pessoa na terceira faixa etaria é: " + q3 + " porcentagem: " + pc3 + "%");
		System.out.println("a quantidade de pessoa na quarta faixa etaria é: " + q4 + " porcentagem: " + pc4 + "%");
		System.out.println("a quantidade de pessoa na quinta faixa etaria é: " + q5 + " porcentagem: " + pc5 + "%");
		
		ler.close();
	}

}
