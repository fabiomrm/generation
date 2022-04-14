package serelepersdia01;

public class Personagem {

	//ATRIBUTOS => Pq? Porque são as características de uma personagem
	private String nomePersonagem;
	private int idadePersonagem;
	private double alturaPersonagem;
	private String falaPersonagem;
	private int pontoVida;

	public Personagem(String nome, int idade, double altura, String fala, int pontoVida) {
		this.nomePersonagem = nome;
		this.idadePersonagem = idade;
		this.alturaPersonagem = altura;
		this.falaPersonagem = fala;
		this.pontoVida = pontoVida;
	}

	
	//MÉTODO => Pq? Porque são ações atribuídas ao objeto
	//Pega o nome do personagem
	public String getNomePersonagem() {
		return this.nomePersonagem;
	}
	//Pega a idade do personagem
	public int getIdadePersonagem() {
		return this.idadePersonagem;
	}
	//Altera a fala do personagem
	public void setFalaPersonagem(String falaPersonagem) {
		if (falaPersonagem == "Avada Kedavra") {
			System.out.println("Ei menino, só Voldemort usa!");
		} else {
			this.falaPersonagem = falaPersonagem;
			System.out.println("Beleza, esse feitiço pode!");
		}
	}

	public double getAlturaPersonagem() {
		return alturaPersonagem;
	}

	public void setAlturaPersonagem(double alturaPersonagem) {
		this.alturaPersonagem = alturaPersonagem;
	}

	public int getPontoVida() {
		return pontoVida;
	}

	public void setPontoVida(int pontoVida) {
		this.pontoVida = pontoVida;
	}

	public String getFalaPersonagem() {
		return falaPersonagem;
	}

	public void setNomePersonagem(String nomePersonagem) {
		this.nomePersonagem = nomePersonagem;
	}

	public void setIdadePersonagem(int idadePersonagem) {
		this.idadePersonagem = idadePersonagem;
	}

	public void fala() {
		System.out.println(this.nomePersonagem + " fala: " + this.falaPersonagem + "!!!!!!!");
	}

	@Override
	public String toString() {
		String s = "\nNome: " + this.nomePersonagem;
		s += "\nIdade: " + this.idadePersonagem;
		s += "\nFala Personagem: " + this.falaPersonagem;
				
		return s;
	}
}
