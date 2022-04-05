package exercicio04;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double N1[][] = new double[2][2];
		double N2[][] = new double[2][2];

		System.out.println("==== MATRIZ N1 ====");
		for (int i = 0; i < N1.length; i++) {
			for (int j = 0; j < N1[i].length; j++) {
				System.out.println("Digite o valor [" + (i + 1) + "][" + (j + 1) + "]: ");
				N1[i][j] = sc.nextDouble();
			}
		}

		System.out.println("==== MATRIZ N2 ====");
		for (int i = 0; i < N2.length; i++) {
			for (int j = 0; j < N2[i].length; j++) {
				System.out.println("Digite o valor [" + (i + 1) + "][" + (j + 1) + "]: ");
				N2[i][j] = sc.nextDouble();
			}
		}

		System.out.println("MENU DE OPÇÕES");
		System.out.println("1- Somar matrizes");
		System.out.println("2- Subtrair a primeira matriz da segunda");
		System.out.println("3- Adicionar uma constante às matrizes");
		System.out.println("4- imprimir matrizes");
		int opcao = sc.nextInt();

		if (opcao == 1) {
			double N3[][] = somaMatrizes(N1, N2);

			imprimeMatriz(N3, "Matriz N3");
		} else if (opcao == 2) {
			double N3[][] = subtraiMatrizes(N1, N2);
			imprimeMatriz(N3, "Matriz N3");
		} else if (opcao == 3) {
			N1 = adicionaConstante(N1, 2);
			N2 = adicionaConstante(N2, 3);

			imprimeMatriz(N1, "Matriz N1");
			imprimeMatriz(N2, "Matriz N2");
		} else if (opcao == 4) {
			imprimeMatriz(N1, "Matriz N1");
			System.out.println();
			imprimeMatriz(N2, "Matriz N2");

		} else {
			System.out.println("Opção inválida");
		}

		sc.close();

	}

	public static void imprimeMatriz(double m[][], String titulo) {

		System.out.println(titulo);
		for (int i = 0; i < m.length; i++) {
			System.out.print("[ ");
			for (int j = 0; j < m[i].length; j++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println(" ]");
		}
	}

	public static double[][] adicionaConstante(double m[][], double constante) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] += constante;
			}
		}

		return m;
	}

	public static double[][] somaMatrizes(double m1[][], double m2[][]) {

		double m3[][] = new double[2][2];

		for (int i = 0; i < m1.length; i++) {
			for (int j = 0; j < m1[i].length; j++) {
				m3[i][j] = m1[i][j] + m2[i][j];
			}
		}

		return m3;
	}

	public static double[][] subtraiMatrizes(double m1[][], double m2[][]) {

		double m3[][] = new double[2][2];

		for (int i = 0; i < m2.length; i++) {
			for (int j = 0; j < m2[i].length; j++) {
				m3[i][j] = m2[i][j] - m1[i][j];
			}
		}

		return m3;
	}

}
