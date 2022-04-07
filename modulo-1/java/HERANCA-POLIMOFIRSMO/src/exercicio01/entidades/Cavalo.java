package exercicio01.entidades;

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
	public void emiteSom(String som, String complemento) {
		
		System.out.println("O " + this + " faz " + som + " " + complemento + "!");
	}

	@Override
	public String toString() {
		return "cavalo " + getNome();
	}
	

}
