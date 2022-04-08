package exercicio02.entidades;

public class Cavalo extends Animal {

	private boolean deveCorrer;

	public Cavalo(String nome, int idade) {
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
