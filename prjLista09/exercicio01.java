package prjLista09;

public class exercicio01 {

	public static void main(String[] args) {
		double j=1.34, p=1.45;
		int a=0;
		while(j<=(p+0.01)) {
			j = j + 0.025;
			p = p + 0.020;
			a = a + 1;
		}	
		System.out.println("ao todo demorou "+ a + " anos para joão passar pedro");
		System.out.printf("%.2f   %.2f\n",j,p);
	}

}
