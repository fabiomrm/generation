package exercicio02;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int lancamentos[] = new int[10];
		int maiorPontuacao = 0;
		boolean primeiro = true;

		for (int i = 0; i < lancamentos.length; i++) {
			System.out.println("Jogada " + (i + 1) + ": ");
			lancamentos[i] = sc.nextInt();

			if (primeiro) {
				maiorPontuacao = lancamentos[i];
				primeiro = false;
			}

			if (lancamentos[i] > maiorPontuacao) {
				maiorPontuacao = lancamentos[i];
			}
		}

		int frequenciaMaiorPontuacao = calculaFrequenciaMaiorPontuacao(lancamentos, maiorPontuacao);
		double mediaLancamentos = calculaMediaLancamentos(lancamentos);
		
		System.out.println("A maior pontuação foi: " + maiorPontuacao + "!");
		System.out.println("O número apareceu: " + frequenciaMaiorPontuacao + "x");
		System.out.println("A média foi: " + mediaLancamentos);

		sc.close();

	}
	
	public static double calculaMediaLancamentos(int lancamentos[]) {
		double soma = 0d;
		
		for(int i=0; i < lancamentos.length; i++) {
			soma += lancamentos[i];
		}
		
		return soma;
	}

	public static int calculaFrequenciaMaiorPontuacao(int lancamentos[], int maiorPontuacao) {
		int frequenciaMaiorPontuacao = 0;

		for (int i = 0; i < lancamentos.length; i++) {
			if (lancamentos[i] == maiorPontuacao) {
				frequenciaMaiorPontuacao++;
			}
		}

		return frequenciaMaiorPontuacao;
	}

}
