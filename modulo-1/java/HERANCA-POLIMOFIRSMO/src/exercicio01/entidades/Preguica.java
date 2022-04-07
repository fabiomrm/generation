package exercicio01.entidades;

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
	public void emiteSom(String som, String complemento) {
		System.out.println("A " + this + " faz " + som + " " + complemento + "!");
	}

	@Override
	public String toString() {
		return "preguiça " + getNome();
	}

}
