package exercicio02;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int inteiros[] = new int[3];
		
		for(int i=0; i < 3; i++) {
			System.out.print("Digite o " + (i+1) + "º número: ");
			inteiros[i] = sc.nextInt();
		}
		
		sc.close();
		
		Arrays.sort(inteiros);
		System.out.println("===NÚMEROS ORDENADOS===");
		for(int n: inteiros) {
			System.out.println(n);
		}
		
		
		
	}

}
