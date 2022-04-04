package exercicio06;

import java.util.Scanner;

import exercicio04.Pessoa.Caracteristica;
import exercicio04.Pessoa.Sexo;

public class Exercicio06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num;
		int somaMultiplos3 = 0;
		int qtdMultiplos3 = 0;

		do {
			System.out.println("Digite um número : ");
			num = sc.nextInt();

			if (num % 3 == 0 && num != 0) {

				somaMultiplos3 += num;
				qtdMultiplos3++;

			}

		} while (num != 0);
		sc.close();

		if (qtdMultiplos3 > 0) {
			double media = somaMultiplos3 / qtdMultiplos3;
			System.out.printf("Média : %.2f", media);
		} else {
			System.out.println("Nenhum múltiplo de 3 foi digitado");
		}

	}

}
