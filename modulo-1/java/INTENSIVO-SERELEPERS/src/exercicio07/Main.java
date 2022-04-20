package exercicio07;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Entre com a quantidade de contribuintes: ");
		int number = sc.nextInt();

		// Usando o tipo genérico (TaxPayer) para que minha lista aceite os tipos mais
		// específicos Individual e Company
		List<TaxPayer> taxPayers = new ArrayList<>();

		for (int i = 0; i < number; i++) {
			System.out.println("Contribuinte número " + (i + 1));
			System.out.println("Pessoa física ou jurídica? [f ou j] ");
			char type = sc.next().charAt(0);

			sc.nextLine();

			System.out.println("Nome: ");
			String name = sc.nextLine();

			System.out.println("Renda naual: ");
			Double anualIncome = sc.nextDouble();

			sc.nextLine();

			if (type == 'f') {
				System.out.println("Despesas com saúde: ");
				Double healthExpenses = sc.nextDouble();
				sc.nextLine();
				Individual invidual = new Individual(name, anualIncome, healthExpenses);
				taxPayers.add(invidual);
			} else if (type == 'j') {
				System.out.println("Número de funcionários: ");
				Integer numberEmployees = sc.nextInt();

				sc.nextLine();

				Company company = new Company(name, anualIncome, numberEmployees);
				taxPayers.add(company);
			}
		}

		System.out.println("IMPOSTOS: ");
		for (TaxPayer tp : taxPayers) {
			System.out.println(tp.getName() + ": R$ " + String.format("%.2f", tp.tax()));
		}
		
		double sum = 0d;
		for(TaxPayer tp : taxPayers) {
			sum += tp.tax();
		}
		
		System.out.println("Total de Imposto pago: R$" + String.format("%.2f", sum));

		sc.close();

	}

}
