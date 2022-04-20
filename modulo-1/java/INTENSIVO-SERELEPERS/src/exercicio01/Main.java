package exercicio01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("Digite sua idade: ");
			int idade = sc.nextInt();
			System.out.println("Sua idade é: " + idade);
			sc.nextLine();

			System.out.println("Digite o número pelo qual você quer dividir sua idade: ");
			int divisor = sc.nextInt();

			System.out.println("A divisão é: " + (idade / divisor));

		} catch (InputMismatchException meuErroEhEsseAqui) {
			System.out.println("Valor do tipo inválido");

		} catch (ArithmeticException meuOutroErro) {
			System.out.println("Não é possível dividir por 0");
		}

		finally {
			System.out.println();
			sc.close();
		}

	}

}
