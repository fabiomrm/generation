package exercicio04;

import java.util.Scanner;

import exercicio04.Pessoa.Caracteristica;
import exercicio04.Pessoa.Sexo;

public class Exercicio04 {

	public static void main(String[] args) {

		Pessoa pessoas[] = new Pessoa[150];
		int contPessoaCalma = 0;
		int contMulherNervosa = 0;
		int contHomemAgressivo = 0;
		int contOutrosCalmo = 0;
		int contPessoaNervosaMaior40 = 0;
		int contPessoaCalmaMenor18 = 0;

		Scanner sc = new Scanner(System.in);

		int contador = 0;
		while (contador < pessoas.length) {
			System.out.println("OLÁ, BEM VINDE À NOSSA PESQUISA - PARTICIPANTE " + (contador + 1));
			System.out.println("Digite sua idade: ");
			int idade = sc.nextInt();

			System.out.println("Digite o número correspondente ao seu sexo: ");
			System.out.println("1 - Feminino");
			System.out.println("2 - Masculino");
			System.out.println("3 - Outros");
			int sexo = sc.nextInt();

			System.out.println("Digite o número correspondente ao seu comportamento característico: ");
			System.out.println("1 - Calma");
			System.out.println("2 - Nervosa");
			System.out.println("3 - Agressiva");
			int caracteristica = sc.nextInt();

			Pessoa p = new Pessoa(idade, sexo, caracteristica);
			pessoas[contador] = p;
			contador++;
		}

		for (Pessoa p : pessoas) {
			if (p.getCaracteristica() == Caracteristica.CALMA) {
				contPessoaCalma++;
			}
			if (p.getSexo() == Sexo.FEMININO && p.getCaracteristica() == Caracteristica.NERVOSA) {
				contMulherNervosa++;
			}
			if (p.getSexo() == Sexo.MASCULINO && p.getCaracteristica() == Caracteristica.AGRESSIVA) {
				contHomemAgressivo++;
			}
			if (p.getSexo() == Sexo.OUTROS && p.getCaracteristica() == Caracteristica.CALMA) {
				contOutrosCalmo++;
			}
			if (p.getIdade() > 40 && p.getCaracteristica() == Caracteristica.NERVOSA) {
				contPessoaNervosaMaior40++;
			}
			if (p.getIdade() < 18 && p.getCaracteristica() == Caracteristica.CALMA) {
				contPessoaCalmaMenor18++;
			}
		}
		
		System.out.println("Quantidade de pessoas calmas: " + contPessoaCalma); 
		System.out.println("Quantidade de mulheres nervosas: " + contMulherNervosa); 
		System.out.println("Quantidade de homens agressivos: " + contHomemAgressivo); 
		System.out.println("Quantidade de outros calmos: " + contOutrosCalmo); 
		System.out.println("Quantidade de pessoas nervosas > 40 anos: " + contPessoaNervosaMaior40); 
		System.out.println("Quantidade de pessoas calmas < 18 anos: " + contPessoaCalmaMenor18); 

		sc.close();
	}

}
