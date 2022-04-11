package exercicio03;

import java.util.Scanner;
import java.util.stream.Collectors;

import exercicio03.entities.Estoque;
import exercicio03.entities.Product;

public class Teste {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Estoque estoque = new Estoque();
		int option = 0;

		do {
			System.out.println("Digite a opção desejada[-1 PARA ENCERRAR]: ");
			String[] options = { "1- Armazenar produto no estoque", "2- Remover produto do estoque",
					"3- Atualizar produto no estoque", "4- Mostrar estoque", "5- Ver total do estoque",
					"6- Ver valor total em estoque de produto específico" };
			for (String op : options) {
				System.out.println(op);
			}
			option = sc.nextInt();

			sc.nextLine();
			switch (option) {
			case 1:
				estoque.getProducts().add(getNewProductData(sc));
				break;
			case 2:
				System.out.println("Qual o produto você deseja deletar? ");
				String name = sc.nextLine();
				estoque.getProducts().removeIf(x -> x.getName().equalsIgnoreCase(name));
				break;
			case 3:
				System.out.println("Qual o produto você deseja atualizar? ");
				name = sc.nextLine();
				estoque.getProducts().removeIf(x -> x.getName().equalsIgnoreCase(name));
				estoque.getProducts().add(getNewProductData(sc));
				break;
			case 4:
				estoque.getProducts().stream().forEach(System.out::println);
				break;
			case 5:
				System.out.println("R$ " + estoque.getValorTotalEstoque());
				break;
			case 6:
				System.out.println("De qual produto você deseja saber o total em estoque? ");
				name = sc.nextLine();
				double price= estoque.getProducts().stream().filter(x -> x.getName().equalsIgnoreCase(name))
						.map(x -> x.getAmount() * x.getPrice()).collect(Collectors.toList()).get(0);
				System.out.println("R$ " + price);
				break;
			default:
				System.out.println("Opção inválida! Digite -1 para encerrar");
			}

		} while (option != -1);
		
		System.out.println("Acabou");
	}

	private static Product getNewProductData(Scanner sc) {
		System.out.println("Digite o nome do produto: ");
		String name = sc.nextLine();

		System.out.println("Digite o preço: R$ ");
		double price = sc.nextDouble();

		System.out.println("Digite a quantidade do produto no estoque: ");
		int amount = sc.nextInt();

		return new Product(name, price, amount);
	}

}
