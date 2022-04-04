package exercicio04;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número inteiro: ");
		int num = sc.nextInt();
		
		if(num > 0) {
			System.out.println("Positivo");
		} else if(num < 0) {
			System.out.println("Negativo");
		} else {
			System.out.println("Neutro");
		}
		
		if(num % 2 == 0) {
			System.out.println("Par");
		} else {
			System.out.println("Ímpar");
		}
		

		sc.close();

	}
}
