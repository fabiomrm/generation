package exercicio01;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		final int PESO_MAXIMO=50;
		final double VALOR_MULTA_POR_QUILO=4d;
		double E = 0d;
		double multa = 0d;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o peso de tomate que está carregando: ");
		double peso = sc.nextDouble();
		
		if(peso > PESO_MAXIMO) {
			E = peso - PESO_MAXIMO;
			multa = E * VALOR_MULTA_POR_QUILO;
			System.out.println("\nExcesso: " + E + "kgs");
		}
		System.out.println("\nExcesso: " + E + "kgs");
		System.out.printf("\nMulta: R$ %.2f", multa);
		sc.close();
	}
}
