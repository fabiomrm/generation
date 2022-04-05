package exercicio01;

public class Exercicio01 {

	
	public static void main(String[] args) {
		
		int A[] = { 1, 0, 5, -2, -5, 7 };

		int soma = A[0] + A[1] + A[5];
		System.out.println("Soma: "+ soma);
		
		A[4] = 100;
		
		for(int v: A) {
			System.out.println(v);
		}
	}
	
	

}
