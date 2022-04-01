package exercicio06;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {

		double x1, y1;
		double x2, y2;
		double difX, difY;
		double distanciaEntrePontos;

		Scanner sc = new Scanner(System.in);

		System.out.println("COORDENADAS DO PONTO 1");
		System.out.print("Digite o valor de X1: ");
		x1 = sc.nextDouble();
		System.out.print("Digite o valor de Y1: ");
		y1 = sc.nextDouble();

		System.out.println("COORDENADAS DO PONTO 2");
		System.out.print("Digite o valor de X2: ");
		x2 = sc.nextDouble();
		System.out.print("Digite o valor de Y2: ");
		y2 = sc.nextDouble();

		difX = Math.pow((x2 - x1), 2);
		difY = Math.pow((y2 - y1), 2);

		distanciaEntrePontos = Math.sqrt(difX + difY);

		System.out.printf("A distância entre os pontos é: %.2f", distanciaEntrePontos);

		sc.close();
	}

}
