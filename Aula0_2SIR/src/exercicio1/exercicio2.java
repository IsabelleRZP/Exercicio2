package exercicio1;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		
//		Criar um programa em java que tenha as seguintes funcionalidades (métodos != objetos):
//			preencher um vetor de 5 posições com números inteiros
//			imprimir o maior valor armazenado no vetor
//			imprimir o menor valor armazenado no vetor
		
		Scanner teclado = new Scanner(System.in);
		
		final int N = 5; // variável local
		int[] v = new int[N];// vetor
//		chamar método, () variável que vai levar
		preencher(v); // argumento do metodo --> variável que será enviada (v)
		int maior = maiorValor(v); // maior é um método
		int menor = menorValor(v);
		System.out.println("maior valor = " + maior);
		System.out.println("menor valor = " + menor);
		
	}
		
		public static int maiorValor(int[] v) { //int --> retorna valor então não pode ser void, retorna para maior
			int aux = v[0]; // por ser número inteiro, valor que esteja dentro do vetor
			for(int i = 1; i < v.length; i++) {
				if(v[i] > aux) {
					aux = v[i];
				
				}
			}
			
			
			return aux;
		}
			public static int menorValor(int[] v) { //int --> retorna valor então não pode ser void, retorna para maior
				int aux = v[0]; // por ser número inteiro, valor que esteja dentro do vetor
				for(int i = 1; i < v.length; i++) {
					if(v[i] < aux) {
						aux = v[i];
					
					}
				}
				
				return aux;
			}
			
				public static void preencher(int[] v) { // v é um parâmetro do método --> que vai receber

					Scanner teclado = new Scanner(System.in);
					for(int i = 0; i < v.length; i++) {
						System.out.print("Valor: ");
						v[i] = teclado.nextInt();
						
				}
					
		
		
	}

	
}

