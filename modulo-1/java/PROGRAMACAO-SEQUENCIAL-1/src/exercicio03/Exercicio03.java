package exercicio03;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {

		int duracaoSegundos;
		int horas, minutos, segundos;
		int resto;

		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o tempo de duração do processo em segundos: ");
		duracaoSegundos = sc.nextInt();

		horas = duracaoSegundos / 3600;
		resto = duracaoSegundos % 3600;
		minutos = resto / 60;
		segundos = resto % 60;
	
		sc.close();
		
		System.out.println(horas + ":" + minutos + ":" + segundos);
	}

}
