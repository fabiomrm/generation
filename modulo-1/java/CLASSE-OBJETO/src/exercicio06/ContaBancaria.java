package exercicio06;

public class ContaBancaria {

	private String titular;
	private int numero;
	private int agencia;
	private double saldo;

	public ContaBancaria(String titular, int numero, int agencia) {
		this.titular = titular;
		this.numero = numero;
		this.agencia = agencia;
		this.saldo = 0d;
	}

	public double sacar(double valor) {
		if (valor <= saldo) {
			saldo -= valor;
		}

		return saldo;
	}

	public double depositar(double valor) {
		if (valor >= 0) {
			this.saldo += valor;
		}

		return saldo;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		String s = "CONTA DE BANCO DE " + titular.toUpperCase();
		s += "\nNúmero da conta: " + numero;
		s += "\nNúmero da agência: " + agencia;
		s += "\nSaldo da conta: R$ " + saldo;

		return s;
	}

}
