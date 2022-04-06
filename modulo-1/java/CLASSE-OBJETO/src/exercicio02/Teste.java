package exercicio02;

public class Teste {

	public static void main(String[] args) {

		Aviao a1 = new Aviao("A308", 2022, "Boeing", 1200d);
		Aviao a2 = new Aviao("B500", 2017, "Airbus", 980d);
		
		a1.voar();
		System.out.println("======");
		a2.voar();
		a2.abastecer(300);
		a2.voar();
		System.out.println("======");
		
		a1.pousar();
		a1.pousar();
		System.out.println("======");
		a2.voar();
	}

}
