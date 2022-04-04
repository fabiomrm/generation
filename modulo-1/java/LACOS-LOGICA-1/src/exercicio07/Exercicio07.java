package exercicio07;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double base, altura;

		System.out.println("Digite valor da base: ");
		base = sc.nextDouble();

		System.out.println("Digite valor da altura: ");
		altura = sc.nextDouble();

		System.out.printf("Área: %.2f", base * altura / 2);

		sc.close();
	}

}
