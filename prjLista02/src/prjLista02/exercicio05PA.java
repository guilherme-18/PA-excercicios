package prjLista02;

	import java.util.Scanner;

public class exercicio05PA {
	
	public static void main(String[] args) {	
	Scanner calculo = new Scanner(System.in);
	System.out.println("vamos calcular a soma do quadrado de numeros");
	int v1, v2, v3, soma;
	
	System.out.println("ponha um valor qualquer: ");
	v1= calculo.nextInt();
	System.out.println("ponha um valor outro valor qualquer: ");
	v2= calculo.nextInt();
	System.out.println("ponha um valor outro valor qualquer: ");
	v3= calculo.nextInt();
	soma= v1*v1 + v2*v2 + v3*v3;
	
	System.out.println("aqui esta a soma do quadrado dos numeros que você colocou: "+ soma);
	calculo.close();

	}

}
