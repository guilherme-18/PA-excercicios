package prjLista02;

	import java.util.Scanner;

public class exercicio07PA {
	
	public static void main(String[] args) {
		Scanner distancia = new Scanner(System.in);
		int m, km;
		
		System.out.println("diga uma distancia em metros que eu irei converter para KM: ");
		m = distancia.nextInt();
		km= m/1000;
		
		System.out.println("a kilometragem é: "+km);
		distancia.close();
	}

}
