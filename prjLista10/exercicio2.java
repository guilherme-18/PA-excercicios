package prjLista10;

public class exercicio2 {

	public static void main(String[] args) {
		int i=0;
		do {
			i = i + 2; 
			
			if((i % 10) == 0){
				System.out.println(i + " é divizivel por 10");
			} else {
 				System.out.println(i + " não é divizivel por 10");
			}
		}while (i<500);
				
	}

}
