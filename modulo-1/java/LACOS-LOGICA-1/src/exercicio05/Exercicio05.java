package exercicio05;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o índice de poluíção: ");
		double indice = sc.nextDouble();

		if(indice <= 0.25) {
			System.out.println("O índice é aceitável!");
		} else if (indice > 0.25 && indice < 0.3) {
			System.out.println("Favor reavaliar urgentemente pois estamos entrando na zona de suspensão!");
		} else if (indice >= 0.3 && indice < 0.4) {
			System.out.println("Empresas do primeiro grupo devem suspender atividades imediatamente!");
		} else if (indice >= 0.4 && indice < 0.5) {
			System.out.println("Empresas do primeiro e segundo grupo devem suspender atividades imediatamente!");
		} else {
			System.out.println("Todas as empresas devem suspender as atividades imediatamente!");
		}

		sc.close();

	}
}
