package exercicio01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("Digite sua idade: ");
			int idade = sc.nextInt();
			System.out.println("Sua idade �: " + idade);
			sc.nextLine();

			System.out.println("Digite o n�mero pelo qual voc� quer dividir sua idade: ");
			int divisor = sc.nextInt();

			System.out.println("A divis�o �: " + (idade / divisor));

		} catch (InputMismatchException meuErroEhEsseAqui) {
			System.out.println("Valor do tipo inv�lido");

		} catch (ArithmeticException meuOutroErro) {
			System.out.println("N�o � poss�vel dividir por 0");
		}

		finally {
			System.out.println();
			sc.close();
		}

	}

}
