package prjLista4;

import java.util.Scanner;

public class exercício2 {
	   
	    public static void main(String[] args) {
	        Scanner dinheiro = new Scanner(System.in);
	        int salarioA, salarioM, salarioL, salarioplus;
	        
	        System.out.println("coloque o seu salario atual: ");
	        salarioA = dinheiro.nextInt();
	        
	        System.out.println("coloque o salario minimo do brasil atualmebte: ");
	        salarioM = dinheiro.nextInt();
	        
	        salarioL = salarioA - salarioM;
	        salarioplus = salarioL * -1;
	        
	        if (salarioL < 0) {
	            System.out.println("voce recebe " + salarioplus + " reais a menos do que a lei manda");
	        } else {
	            System.out.println("voce recebe " + salarioL + " reais a mais que o salario minimo no brasil1");
	        }
	        
	        dinheiro.close();
	    }

}
