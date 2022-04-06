package exercicio01;

public class Teste {

	public static void main(String[] args) {
		Endereco e1 = new Endereco("Av. Rua Dois", 123, "Abreu e Lima", "PE");
		Cliente c1 = new Cliente("111.111.111-11", "Joana", "joana@gmail.com", e1);

		System.out.println(c1);

		c1.setCpf("222.333.222-11");
		e1.setCidade("Paulista");

		System.out.println(c1);

	}

}
