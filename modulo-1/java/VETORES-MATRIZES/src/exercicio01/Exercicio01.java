package exercicio01;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		boolean primeiro = true;
		double maiorValor = 0d;
		double[] vetor = new double[5];

		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Digite a " + (i+1) + " ª nota: ");
			vetor[i] = sc.nextDouble();
			
			if(primeiro) {
				maiorValor = vetor[i];
				primeiro = false;
			}
			
			if(vetor[i] > maiorValor) {
				maiorValor = vetor[i];
			}
		}
		
		for(double d: vetor) {
			System.out.printf("%n%.2f", d);
		}
		
		System.out.println("\nO maior valor foi: " + maiorValor );
		
		sc.close();

	}

}
