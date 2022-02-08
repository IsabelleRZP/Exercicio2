package exercicio1;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		final int N = 30;
		int[] rm = new int[N];
		double[] nota1 = new double[N];
		double[] nota2 = new double[N];
		double[] media = new double[N];
		
		int i = 0;
		System.out.println("Informe seu RM ou digite o valor negativo para encerrar entrada de dados: ");
		int r = teclado.nextInt();
		while (r > 0 && i < N) {
			rm[i] = r;
			System.out.println("\t 1a Nota: ");
			nota1[i] = teclado.nextDouble();
			System.out.println("\t 2a Nota: ");
			nota2[i] = teclado.nextDouble();
			i++;
			System.out.println("Informe RM ou digite valor negativo para encerrar entrada de dados: ");
			r = teclado.nextInt();
			
			}
		
		int nAlunos = i;
		for( i = 0; i < nAlunos; i++) {
			media[i] = (nota1[i] + nota2[i]) / 2;
			System.out.println("RM: " + rm[i] + "\t Média: " + media[i]);
		}
		
		
		
	}

}
