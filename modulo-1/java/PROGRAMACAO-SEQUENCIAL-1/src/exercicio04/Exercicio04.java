package exercicio04;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {

		int A, B, C;
		double R, S, D;

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o valor de A: ");
		A = sc.nextInt();
		System.out.print("Digite o valor de B: ");
		B = sc.nextInt();
		System.out.print("Digite o valor de C: ");
		C = sc.nextInt();

		R = Math.pow(A + B, 2);
		S = Math.pow(B + C, 2);
		
		D = R + S / 2;
		
		System.out.println("Valor de D: " + D);

		sc.close();
	}

}
