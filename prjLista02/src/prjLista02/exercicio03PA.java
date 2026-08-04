package prjLista02;
	import java.util.Scanner;
public class exercicio03PA {
	
	public static void main(String[] args) {
		Scanner inversão = new Scanner(System.in);
		int a, b, c;
		
		System.out.println("ponha um valor para A qualquer: ");
		a= inversão.nextInt();
		System.out.println("ponha um valor para B qualquer: ");
		b= inversão.nextInt();
		c= a;
		a= b;
		b= c;
		
		System.out.println("aqui esta o valor inverso A que colocou: "+ a);
		System.out.println("aqui esta o valor inverso B que colocou: "+ b);
		inversão.close();
	}
	
}