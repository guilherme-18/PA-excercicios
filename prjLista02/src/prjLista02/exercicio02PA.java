package prjLista02;

	import java.util.Scanner;
public class exercicio02PA {
	public static void main(String[] args) {
		
		Scanner idade = new Scanner(System.in);
		int anoAtual, anoNasc, idadeAtual; 
		
		System.out.println("entre com o ano atual:");
		anoAtual = idade.nextInt();
		System.out.println("entre com o ano de seu nascimento:");
		anoNasc = idade.nextInt();
		idadeAtual = anoAtual-anoNasc;
		
		System.out.println("sua idade é: "+ idadeAtual);		
		idade.close();
		}
	
}
