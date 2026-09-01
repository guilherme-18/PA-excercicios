package prjLista10;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int aa, an, idade;
		String continuar;
		do {
			System.out.println("coloque o ano atual: ");
			aa = ler.nextInt();
			System.out.println("coloque o ano de nascimento: ");
			an = ler.nextInt();
			idade = aa - an;
			if(idade<18) {
				System.out.println("voce é menor de idade " + "\nsua idade é: " + idade);
			} else {
				System.out.println("voce é maior de idade " + "\nsua idade é: " + idade);
			}
			System.out.println("coloque s para continuar ou n para encerar o programa");
			continuar = ler.next();
			}while (continuar.equalsIgnoreCase("S"));
		System.out.println("encerrando o programa");
		ler.close();
	}

}
