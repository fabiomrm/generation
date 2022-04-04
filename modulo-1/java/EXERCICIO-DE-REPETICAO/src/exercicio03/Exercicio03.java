package exercicio03;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int idade;
		int contMenor21 = 0;
		int contMaior50 = 0;

		System.out.print("Digite uma idade: ");
		idade = sc.nextInt();

		while (idade != -99) {
			if (idade < 21) {
				contMenor21++;
			}
			if (idade > 50) {
				contMaior50++;
			}

			System.out.print("Digite uma nova idade: ");
			idade = sc.nextInt();
		}

		System.out.println("Pessoas com menos de 21 anos: " + contMenor21);
		System.out.println("Pessoas com mais de 50 anos: " + contMaior50);
		sc.close();

	}
}
