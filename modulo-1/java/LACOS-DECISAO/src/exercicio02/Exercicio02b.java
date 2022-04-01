package exercicio02;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio02b {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] numeros = new int[3];

		System.out.println("Digite um número inteiro: ");
		numeros[0] = sc.nextInt();

		System.out.println("Digite um número inteiro: ");
		numeros[1] = sc.nextInt();

		System.out.println("Digite um número inteiro: ");
		numeros[2] = sc.nextInt();

		sc.close();

		boolean controle;

		do {

			controle = false;

			for (int i = 0; i < numeros.length - 1; i++) {
				if (numeros[i] > numeros[i + 1]) {
					int temp = numeros[i];
					numeros[i] = numeros[i + 1];
					numeros[i + 1] = temp;

					controle = true;
				}
			}

		} while (controle);

		System.out.println(Arrays.toString(numeros));

	}

}
