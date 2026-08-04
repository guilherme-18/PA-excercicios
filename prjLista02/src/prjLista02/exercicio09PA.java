package prjLista02;

	import java.util.Scanner;

public class exercicio09PA {
	public static void main(String[] args) {
		Scanner produto = new Scanner(System.in);
		int precoInicial, precoFinal, pd, desc;
		
		System.out.println("ponha o valor inicial do produto (sem desconto): ");
		precoInicial= produto.nextInt();
		System.out.println("ponha a porcentagem do desconto: ");
		pd= produto.nextInt();
		desc= (precoInicial/100)*pd; 
		precoFinal= precoInicial-desc;
		
		System.out.println("aqui esta o valor do produto com o desconto: "+ precoFinal);
		produto.close();
	}

}
