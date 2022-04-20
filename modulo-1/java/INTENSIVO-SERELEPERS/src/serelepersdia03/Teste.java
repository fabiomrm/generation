package serelepersdia03;

public class Teste {

	public static void main(String[] args) {

		Aluno aluno = new Aluno("João");
		
		//Passo 1: Criar um vetor VAZIO que espera 3 notas (double);
		double[] notas = new double[3];
		
		//Passo 2: Adicionar as 03 notas ao vetor vazio;
		notas[0] = 8;
		notas[1] = 2;
		notas[2] = 10;
		
		//Passo 3: Adicionar o vetor de notas ao atributo notas do meu objeto aluno.
		aluno.setNotas(notas);
		
		

		
		
		
		System.out.println(aluno.somaNotas());
		
		
		
		
		
		
		
		/*
		 * 
		 * 
		double[] notas = new double[3];
		notas[0] = 8.5;
		notas[1] = 10;
		notas[2] = 5;
		double soma = 0;
		
		for(int i=0; i < 3; i++) {
			System.out.println("para i = " + i + " => " + soma + " + " + notas[i] + " = " + (soma+notas[i]));
			soma = soma + notas[i];
		}
		System.out.println("Média: " + soma / 3);
		
		System.out.println("ACABOU");
		 */

	}
}
