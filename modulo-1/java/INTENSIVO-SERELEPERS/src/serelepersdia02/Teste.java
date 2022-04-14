package serelepersdia02;

public class Teste {

	public static void main(String[] args) {

		Contato joao = new Contato();
		Endereco endereco = new Endereco("Rua da Palma", 123, "PE");
		Telefone telefoneFixo = new Telefone("Fixo", 81, "3434-4545");
		Telefone telefoneCelular = new Telefone("Celular", 11, "99999-8888");

		joao.setNome("João");
		
		joao.setEndereco(endereco);
		joao.getTelefones().add(telefoneFixo);
		joao.getTelefones().add(telefoneCelular);
		
		joao.imprimeInformacoes();
		
		
		
		
		/*
		 * 
		 * Funcionario funcionario = new Funcionario("Ana", "12345678900", 25, 2000);
		 * 
		 * Gerente gerente = new Gerente("Fábio", "1234567800", 30, 2500, 100);
		 * 
		 * Gerente outroGerente = new Gerente(); //Como GERENTE É UM FUNCIONÁRIO:
		 * outroGerente.setNome("Carla"); outroGerente.setIdade(32);
		 * outroGerente.setCpf("11270255567");
		 */

	}

}
