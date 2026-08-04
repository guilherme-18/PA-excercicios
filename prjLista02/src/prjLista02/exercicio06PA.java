package prjLista02;

	import java.util.Scanner;

public class exercicio06PA {
	
	public static void main(String[] args) {
		Scanner numeros = new Scanner(System.in);
		int n, ant, suc;
		
		System.out.println("coloque um numero aleatorio abaixo e eu irei dizer o antecessor e o sucessor desse numero: ");
		n= numeros.nextInt();
		suc = n+1;
		ant = n-1;
		
		System.out.println("o antecessor desse numero é: "+ant);
		System.out.println("o sucecssor desse numero é: "+suc);
		numeros.close();
	}

}
