package exercicio02.entidades;

public class Cachorro extends Animal {

	private boolean deveCorrer;

	public Cachorro(String nome, int idade) {
		super(nome, idade);
		deveCorrer = true;

	}

	public boolean isDeveCorrer() {
		return deveCorrer;
	}

	public void setDeveCorrer(boolean deveCorrer) {
		this.deveCorrer = deveCorrer;
	}

	@Override
	public String toString() {
		return "Cachorro " + getNome();
	}

	@Override
	public void emitirSom(String som) {
		System.out.println("O " + this + "faz " + som);

	}

}
