package prjLista07;

import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner placa = new Scanner(System.in);

        System.out.print("Digite o último número da placa do seu veículo: ");
        int finalPlaca = placa.nextInt();

        switch (finalPlaca) {
            case 1:
            case 2:
            	System.out.println("o seu veiculo não pode circular na segunda-feira");
                break;
            case 3:
            case 4:
            	System.out.println("o seu veiculo não pode circular na terça-feira");
                break;
            case 5:
            case 6:
            	System.out.println("o seu veiculo não pode circular na quarta-feira");
                break;
            case 7:
            case 8:
            	System.out.println("o seu veiculo não pode circular na quinta-feira");
                break;
            case 9:
            case 0:
            	System.out.println("o seu veiculo não pode circular na sexta-feira");
                break;
            default:
            	System.out.println("placa invalida");
                break;
        }

        System.out.println("a circulação de veiculo é livre nos sabados e domingos");
        
        placa.close();
    }
}