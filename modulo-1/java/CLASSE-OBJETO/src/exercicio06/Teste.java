package exercicio06;

public class Teste {

	public static void main(String[] args) {

		
		ContaBancaria cb1 = new ContaBancaria("Fábio", 123, 4);
		
		System.out.println(cb1);
		System.out.println("===========");
		cb1.sacar(100);
		System.out.println(cb1);
		
		cb1.depositar(150);
		System.out.println(cb1);
		
		cb1.sacar(80);
		System.out.println(cb1);
		
		cb1.sacar(90);
		System.out.println(cb1);
	}

}
