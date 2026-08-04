package prjLista03;

import java.util.Scanner;

public class exercicio01 {
	public static void main(String[] args) {
		
		Scanner salario = new Scanner(System.in);
		int valor, Pc, valorNovo;
		System.out.println("coloque o valor do seu trabalho atual");
	    valor = salario.nextInt();
	    Pc = valor/100*10;
	    valorNovo = valor+Pc ;
	    System.out.println("aqui esta o seu salario novo com 10% a mais: "+ valorNovo);
	    salario.close();
		
	}

}
