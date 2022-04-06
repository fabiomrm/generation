package exercicio04;

public class Funcionario {

	private String nome;
	private int idade;
	private double salarioBase;
	private int horasExtrasTrabalhadas;
	private double valorHoraExtra;

	public Funcionario(String nome, int idade, double salarioBase) {
		this.nome = nome;
		this.idade = idade;
		this.salarioBase = salarioBase;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getsalarioBase() {
		return salarioBase;
	}

	public void setsalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public int getHorasExtrasTrabalhadas() {
		return horasExtrasTrabalhadas;
	}

	public void setHorasExtrasTrabalhadas(int horasExtrasTrabalhadas) {
		if (horasExtrasTrabalhadas >= 0) {
			this.horasExtrasTrabalhadas = horasExtrasTrabalhadas;
		}
	}

	public double getValorHoraExtra() {
		return valorHoraExtra;
	}

	public void setValorHoraExtra(double valorHoraExtra) {
		this.valorHoraExtra = valorHoraExtra;
	}

	public double calculaSalarioTotal() {
		return salarioBase + valorHoraExtra * horasExtrasTrabalhadas;
	}

	@Override
	public String toString() {
		String s = "Nome: " + nome;
		s += "\nIdade: " + idade;
		s += "\nSalário Base R$: " + salarioBase;
		s += "\nvalor HH R$: " + valorHoraExtra;
		s += "\nHH trabalhadas: " + horasExtrasTrabalhadas;
		s += "\nSalário total: R$ " + calculaSalarioTotal();
		
		return s;
		
	}
	
	

}
