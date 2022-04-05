package exercicio03;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {

		int N1[][] = new int[3][3];
		int contMaiorDez = 0;
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < N1.length; i++) {
			for (int j = 0; j < N1[i].length; j++) {
				System.out.println("Informe o valor da célula [" + (i + 1) + "][" + (j + 1) + "]: ");
				N1[i][j] = sc.nextInt();
				if(N1[i][j] > 10) {
					contMaiorDez++;
				}
			}
		}
		
		System.out.println("Quantidade de números maior que 10: " + contMaiorDez);
		sc.close();

	}

}
