package exercicio03;

public class ProdutoEletronico {

	private String nome;
	private int ano;
	private double preco;
	private boolean estaLigado;

	public ProdutoEletronico() {
	}

	public void apertaInterruptor() {
		if (!estaLigado) {
			estaLigado = true;
		} else {
			estaLigado = false;
		}

		System.out.println("Está ligado: " + estaLigado);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public boolean isEstaLigado() {
		return estaLigado;
	}

	public void setEstaLigado(boolean estaLigado) {
		this.estaLigado = estaLigado;
	}

	@Override
	public String toString() {
		return "ProdutoEletronico [nome=" + nome + ", ano=" + ano + ", preco=" + preco + ", estaLigado=" + estaLigado
				+ "]";
	}

}
