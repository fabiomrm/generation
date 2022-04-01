package exercicio02;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {

		int idadeDias;

		Scanner sc = new Scanner(System.in);
		System.out.print("Digite quantos dias você viveu até hoje: ");
		idadeDias = sc.nextInt();

		int idade[] = new int[3];
		idade = converteIdadeAnosMesesDias(idadeDias);

		System.out.println("Sua idade é de " + idade[0] + " anos, " + idade[1] + " meses, " + idade[2] + " dias.");

		sc.close();
	}

	public static int[] converteIdadeAnosMesesDias(int idadeDias) {
		int anos = idadeDias / 365;
		int meses = (idadeDias % 365) / 30;
		int dias = idadeDias - anos * 365 - meses * 30;

		int[] idade = new int[3];
		idade[0] = anos;
		idade[1] = meses;
		idade[2] = dias;

		return idade;
	}
}
