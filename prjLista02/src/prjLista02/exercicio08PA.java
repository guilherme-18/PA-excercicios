package prjLista02;
	
	import java.util.Scanner;
	
public class exercicio08PA {
	public static void main(String[] args) {
		Scanner taxa = new Scanner(System.in);
		int valorCarro, Ipva;
		
		System.out.println("coloque o valor do seu carro abaixo que eu irei calcular o ipva: ");
		valorCarro= taxa.nextInt();
		Ipva= (valorCarro/100)*4;
		
		System.out.println("aqui esta o valor do ipva do carro: "+ Ipva);
		taxa.close();
		
	}

}
