package exercicio08;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o número: ");
		double num = sc.nextDouble();
		
		if(num > 100) {
			System.out.println(num);
		} else {
			System.out.println(0);
		}
		

		sc.close();
	}

}
