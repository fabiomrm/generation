package exercicio08;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {

		final double PCT_DISTRIB = 0.28;
		final double PCT_IMPOSTO = 0.45;

		double custoFabrica, custoConsumidor;

		Scanner sc = new Scanner(System.in);

		System.out.print("Qual foi o custo de fábrica do carro? R$ ");
		custoFabrica = sc.nextDouble();

		custoConsumidor = custoFabrica + custoFabrica * PCT_DISTRIB + custoFabrica + PCT_IMPOSTO;
		
		System.out.printf("O custo para o consumidor é: R$ %.2f", custoConsumidor);
		
		sc.close();
	}

}
