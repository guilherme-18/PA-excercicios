package prjLista4;

import java.util.Scanner;

public class exercicio1 {
	
    public static void main(String[] args) {
	        Scanner idoso = new Scanner(System.in);
	        int anoA, anoN, idadeF;
	        
	        System.out.println("coloque o ano atual: ");
	        anoA = idoso.nextInt();
	        System.out.println("coloque o seu ano de nascimento: ");
	        anoN = idoso.nextInt();
	        
	        idadeF = anoA - anoN;
	        System.out.println("sua idade é: " + idadeF);
	        
	        if (idadeF < 18) {
	            System.out.println("você é menor de idade");
	        } else {
	            System.out.println("voce é maior de idade");
	        }
	        
	        idoso.close();
	    }

}
