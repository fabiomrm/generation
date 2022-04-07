package exercicio01.entidades;

public class Cachorro extends Animal {

	private boolean deveCorrer;
	private int quantidadeEnergia;

	public Cachorro(String nome, int idade, int quantidadeEnergia) {
		super(nome, idade);
		deveCorrer = true;
		this.quantidadeEnergia = quantidadeEnergia;
	}

	public boolean isDeveCorrer() {
		return deveCorrer;
	}

	public void setDeveCorrer(boolean deveCorrer) {
		this.deveCorrer = deveCorrer;
	}

	public int getQuantidadeEnergia() {
		return quantidadeEnergia;
	}

	public void setQuantidadeEnergia(int quantidadeEnergia) {
		this.quantidadeEnergia = quantidadeEnergia;
	}

	public void gastaEnergia(int energiaGasta) {
		quantidadeEnergia -= energiaGasta;
		temEnergia();
	}

	private boolean temEnergia() {
		deveCorrer = quantidadeEnergia >= 0;
		return deveCorrer;
	}

	@Override
	public void emiteSom(String som, String complemento) {

		System.out.println("O " + this + " faz " + som + " " + complemento + "!");
	}

	@Override
	public String toString() {
		return "Cachorro " + getNome();
	}
	
	

}
