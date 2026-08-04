package prjLista05;

import java.util.Scanner;

public class exercicio8 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Double nota1, nota2, media, recu;
		
		System.out.println("entre com a sua primeira nota");
		nota1 = ler.nextDouble();
		System.out.println("entre com a sua segunda nota");
		nota2 = ler.nextDouble();
		
		media = (nota1+nota2)/2;
		
		if (media>=6) {
			System.out.println("você esta aprovado sua media foi: " + media);
		} else if (media<=3) {
			System.out.println("você esta reprovado sua media foi: " + media);
		} else {
			System.out.println("você esta de recuperação sua media foi: " + media + " vai precisar fazer recuperação");
			System.out.println("coloque a sua nota da recuperação: ");
			recu = ler.nextDouble();
		
		if ((media+recu)/2 >= 6) {
				System.out.println("aprovado pela recuperação");
		} else {
				System.out.println("você esta reprovado");
			}
		}
		
		ler.close();
	}
}
