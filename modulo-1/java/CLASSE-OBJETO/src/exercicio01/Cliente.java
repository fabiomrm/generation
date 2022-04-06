package exercicio01;

public class Cliente {

	private String cpf;
	private String nome;
	private String email;
	private Endereco endereco;

	public Cliente(String cpf, String nome, String email, Endereco endereco) {
		this.cpf = cpf;
		this.nome = nome;
		this.email = email;
		this.endereco = endereco;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		String s = "\nNome: " + nome;
		s += "\nEmail: " + email;
		s += "\nCPF: " + cpf;
		s += "\nENDERECO\n";
		s += endereco;
		
		return s;
	}

}
