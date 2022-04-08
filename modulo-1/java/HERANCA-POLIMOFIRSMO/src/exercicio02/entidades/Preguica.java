package exercicio02.entidades;

public class Preguica extends Animal {

	private boolean deveSubirArvore;

	public Preguica(String nome, int idade) {
		super(nome, idade);
		deveSubirArvore = true;

	}

	public boolean isDeveSubirArvore() {
		return deveSubirArvore;
	}

	public void setDeveSubirArvore(boolean deveSubirArvore) {
		this.deveSubirArvore = deveSubirArvore;
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
