package serelepersdia02;

//Gerente É UM funcionário 
public class Gerente extends Funcionario {

	private double comissao;

	public Gerente() {
	}

	public Gerente(String nome) {
		super(nome);
	}

	public Gerente(String nome, String cpf, int idade, double salario, double comissao) {
		super(nome, cpf, idade, salario);
		this.comissao = comissao;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}

}
