package exercicio03;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {

		int N1[][] = new int[4][6];
		int N2[][] = new int[4][6];
		int M1[][] = new int[4][6];
		int M2[][] = new int[4][6];

		Scanner sc = new Scanner(System.in);
		System.out.println("====DADOS DA MATRIZ N1====");
		for (int i = 0; i < N1.length; i++) {
			for (int j = 0; j < N1[i].length; j++) {
				System.out.println("Informe o valor da célula [" + (i+1) + "][" + (j+1) + "]: ");
				N1[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("====DADOS DA MATRIZ N2====");
		for (int i = 0; i < N2.length; i++) {
			for (int j = 0; j < N2[i].length; j++) {
				System.out.println("Informe o valor da célula [" + (i+1) + "][" + (j+1) + "]: ");
				N2[i][j] = sc.nextInt();
			}
		}

		sc.close();
		
		for(int i=0; i < N1.length; i++) {
			for(int j=0; j < N1[i].length; j++) {
				M1[i][j] = N1[i][j] + N2[i][j];
			}
		}
		System.out.println("====MATRIZ M1, SENDO A SOMA ENTRE N1 e N2");
		for(int i=0; i < M1.length; i++) {
			System.out.print("[");
			for(int j=0; j < M1[i].length; j++) {
				System.out.print(M1[i][j] + " ");
			}
			System.out.print("]");
			System.out.println();
		}
		
		
		for(int i=0; i < N1.length; i++) {
			for(int j=0; j < N1[i].length; j++) {
				M2[i][j] = N1[i][j] - N2[i][j];
			}
		}
		System.out.println("====MATRIZ M2, SENDO A DIFERENÇA ENTRE N1 e N2");
		for(int i=0; i < M2.length; i++) {
			System.out.print("[");
			for(int j=0; j < M2[i].length; j++) {
				System.out.print(M2[i][j] + " ");
			}
			System.out.print("]");
			System.out.println();
		}
		
		


	}

}
