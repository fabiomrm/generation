package exercicio05;

import java.util.Scanner;

import exercicio04.Pessoa.Caracteristica;
import exercicio04.Pessoa.Sexo;

public class Exercicio05 {

	public static void main(String[] args) {

		
		
		Scanner sc = new Scanner(System.in);
		int num;
		int soma=0;
		
		do {
			System.out.println("Digite um número : ");
			num = sc.nextInt();
			soma += num;
		} while(num != 0);
		sc.close();
		
		System.out.println("Soma: " + soma);
	}

}
