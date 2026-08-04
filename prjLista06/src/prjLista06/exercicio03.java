package prjLista06;

import java.util.Scanner;

public class exercicio03 {
	public static void main(String[] args) {
		Scanner codigo = new Scanner(System.in);
		String senha;
	
		System.out.println("coloque a senha correta: ");
		senha = codigo.next();
		
		if (senha.equals("abcd1234")) {
			System.out.println("senha correta");
		} else {
			System.out.println("senha errada");
		}
		codigo.close();
		
	}
}
