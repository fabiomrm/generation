package exercicio05;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {

		double nota1, nota2, nota3, mediaPonderada;

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a primeira nota: ");
		nota1 = sc.nextDouble();
		System.out.println("Digite a segunda nota: ");
		nota2 = sc.nextDouble();
		System.out.println("Digite a terceira nota: ");
		nota3 = sc.nextDouble();

		mediaPonderada = (nota1 * 2 + nota2 * 3 + nota3 * 5) / (2 + 3 + 5);

		System.out.printf("A média ponderada é: %.2f", mediaPonderada);
		
		sc.close();

	}

}
