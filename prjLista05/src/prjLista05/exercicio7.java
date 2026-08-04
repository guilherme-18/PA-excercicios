package prjLista05;

import java.util.Scanner;

public class exercicio7 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int idade1, idade2, idade3, idade4, idade5;
		
		System.out.println("entre com o nome do primeiro usuário: ");
		String usuario1 = ler.next();
		System.out.println("entre com a idade do primeiro usuário: ");
		idade1 = ler.nextInt();
		
		System.out.println("entre com o nome do segundo usuário: ");
		String usuario2 = ler.next();
		System.out.println("entre com a idade do segundo usuário: ");
		idade2 = ler.nextInt();
		
		System.out.println("entre com o nome do terceiro usuário: ");
		String usuario3 = ler.next();
		System.out.println("entre com a idade do terceiro usuário: ");
		idade3 = ler.nextInt();
		
		System.out.println("entre com o nome do quarto usuário: ");
		String usuario4 = ler.next();
		System.out.println("entre com a idade do quarto usuário: ");
		idade4 = ler.nextInt();
		
		System.out.println("entre com o nome do quinto usuário: ");
		String usuario5 = ler.next();
		System.out.println("entre com a idade do quinto usuário: ");
		idade5 = ler.nextInt();
		
		if (idade1 <= idade2 && idade1 <= idade3 && idade1 <= idade4 && idade1 <= idade5) {
		    System.out.println(usuario1 + " é o mais novo e tem: " + idade1 + " anos");
		} else if (idade2 <= idade1 && idade2 <= idade3 && idade2 <= idade4 && idade2 <= idade5) {
		    System.out.println(usuario2 +" é o mais novo e tem: " + idade2 + " anos");
		} else if (idade3 <= idade1 && idade3 <= idade2 && idade3 <= idade4 && idade3 <= idade5) {
		    System.out.println(usuario3 + " é o mais novo e tem: " + idade3 + " anos");
		} else if (idade4 <= idade1 && idade4 <= idade2 && idade4 <= idade3 && idade4 <= idade5) {
		    System.out.println(usuario4 + " é o mais novo e tem: " + idade4 + " anos");
		} else if (idade5 <= idade1 && idade5 <= idade2 && idade5 <= idade4 && idade5 <= idade3) {
		    System.out.println(usuario5 + " é o mais novo e tem: " + idade5 + " anos");
		} else {
		    System.out.println(" se fez errado paizão");
		}

		if (idade1 >= idade2 && idade1 >= idade3 && idade1 >= idade4 && idade1 >= idade5) {
		    System.out.println(usuario1 + " é o mais velho e tem: " + idade1 + " anos");
		} else if (idade2 >= idade1 && idade2 >= idade3 && idade2 >= idade4 && idade2 >= idade5) {
		    System.out.println(usuario2 + " é o mais velho e tem: " + idade2 + " anos");
		} else if (idade3 >= idade1 && idade3 >= idade2 && idade3 >= idade4 && idade3 >= idade5) {
		    System.out.println(usuario3 + " é o mais velho e tem: " + idade3 + " anos");
		} else if (idade4 >= idade1 && idade4 >= idade2 && idade4 >= idade3 && idade4 >= idade5) {
		    System.out.println(usuario4 + " é o mais velho e tem: " + idade4 + " anos");
		} else if (idade5 >= idade1 && idade5 >= idade2 && idade5 >= idade4 && idade5 >= idade3) {
		    System.out.println(usuario5 + " é o mais velho e tem: " + idade5 + " anos");
		} else {
		    System.out.println(" se fez errado paizão");
		}

		
		ler.close();
		
		}

}
