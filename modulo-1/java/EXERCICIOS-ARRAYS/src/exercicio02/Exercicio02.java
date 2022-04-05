package exercicio02;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {

		int A[] = new int[6];

		int somaPares = 0;
		int qtdImpares = 0;

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < A.length; i++) {
			System.out.println("Digite um número: ");
			A[i] = sc.nextInt();

			if (A[i] % 2 == 0) {
				somaPares += A[i];
			} else {
				qtdImpares++;
			}
		}
		
		sc.close();

		System.out.println("PARES: ");
		for (int i = 0; i < A.length; i++) {
			if (A[i] % 2 == 0) {
				System.out.print(A[i] + " ");
			}
		}
		System.out.println("Soma pares: " + somaPares);
		System.out.println();
		System.out.println("ÍMPARES: ");
		for (int i = 0; i < A.length; i++) {
			if (A[i] % 2 != 0) {
				System.out.print(A[i] + " ");
			}
		}
		System.out.println("Quantidade ímpares: " + qtdImpares);
		
	}

}
