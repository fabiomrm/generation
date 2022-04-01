package exercicio01;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int maiorNumero = 0;

		for (int i = 0; i < 3; i++) {
			System.out.print("Digite um número: ");
			if (i == 0) {
				maiorNumero = sc.nextInt();
			} else {
				int num = sc.nextInt();
				maiorNumero = maiorNumero >= num ? maiorNumero : num;
			}

		}

		System.out.println("O maior número digitado foi: " + maiorNumero);

		sc.close();

	}

}
