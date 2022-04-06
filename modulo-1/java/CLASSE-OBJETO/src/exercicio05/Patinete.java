package exercicio05;

public class Patinete {

	private String modelo;
	private String cor;
	private double preco;
	private double velocidadeAtual;
	private double velocidadeMaxima;

	public Patinete(String modelo, String cor, double preco, double velocidadeMaxima) {
		this.modelo = modelo;
		this.cor = cor;
		this.preco = preco;
		this.velocidadeMaxima = velocidadeMaxima;
		this.velocidadeAtual = 0;
	}

	public double acelerar(double velocidade) {
		if ((velocidadeAtual + velocidade) <= velocidadeMaxima) {
			velocidadeAtual = velocidadeAtual + velocidade;
			System.out.println("ACELEEEEEEEEEEEEERA!");
		} else {
			System.out.println("CALMA BOY! Já tá na velocidade máxima: " + velocidadeMaxima + "m/s");
		}
		
		return velocidadeAtual;
	}
	
	

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double getVelocidadeMaxima() {
		return velocidadeMaxima;
	}

	public void setVelocidadeMaxima(double velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}

	@Override
	public String toString() {
		String s = "Modelo: " + modelo;
		s += "\nCor: " + cor;
		s += "\nPreço R$ " + preco;
		s += "\nVelocidade máxima: " + velocidadeMaxima + " m/s";

		return s;
	}

}
