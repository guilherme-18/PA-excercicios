package prjLista02;

	import java.util.Scanner;
public class exercicio01PA {
	
	public static void main(String[] args) {
		
		Scanner triangulo = new Scanner(System.in);
		int base, altura, área;
		
		System.out.println("entre com a base do triangulo:");
		base = triangulo.nextInt();
		System.out.println("entre com a altura do tringulo: ");
		altura = triangulo.nextInt();
		área= base*altura/2;
		
		System.out.println("a área do trinagulo é: "+ área);
		triangulo.close();
	}

}
