package prjLista05;

import java.util.Scanner;

public class exercicio5 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double A, B, C;
		System.out.println("coloque o valor do do lado A do triangulo");
		A = ler.nextDouble();
		System.out.println("coloque o valor do do lado B do triangulo");
		B = ler.nextDouble();
		System.out.println("coloque o valor do do lado C do triangulo");
		C = ler.nextDouble();
		
		if (A == B && B == C) {
		System.out.println("o triangulo é equilatero, tem todos os lados iguais");
		
		} else if (A < B && A < C || B < C && B < A || C < A && C < B) {
			System.out.println("é um triangulo escaleno e possui os 3 lados diferentes");
			
		} else if (A + B < C || C + B < A || A + C < B){
			System.out.println("não é um triangulo");
			
		} else {
			System.out.println("o triangulo é isosceles, tem dois lados iguais e um diferente");
		}
		
		ler.close();
	}
}
