package exercicio04;

public class Pessoa {

	public enum Sexo {
		FEMININO(1), MASCULINO(2), OUTROS(3);

		private int valor;

		Sexo(int valor) {
			this.valor = valor;
		}
	}

	public enum Caracteristica {
		CALMA(1), NERVOSA(2), AGRESSIVA(3);

		private int valor;

		Caracteristica(int valor) {
			this.valor = valor;
		}
	}

	private int idade;
	private Sexo sexo;
	private Caracteristica caracteristica;

	public Pessoa() {
	}

	public Pessoa(int idade, Sexo sexo, Caracteristica caracteristica) {
		this.idade = idade;
		this.sexo = sexo;
		this.caracteristica = caracteristica;
	}

	public Pessoa(int idade, int valorSexo, int valorCaracteristica) {
		this.idade = idade;
		setSexo(valorSexo);
		setCaracteristica(valorCaracteristica);
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	public void setSexo(int valor) {
		if (valor == 1) {
			sexo = Sexo.FEMININO;
		} else if (valor == 2) {
			sexo = Sexo.MASCULINO;
		} else {
			sexo = Sexo.OUTROS;
		}
	}

	public Caracteristica getCaracteristica() {
		return caracteristica;
	}

	public void setCaracteristica(Caracteristica caracteristica) {
		this.caracteristica = caracteristica;
	}

	public void setCaracteristica(int valor) {
		if (valor == 1) {
			caracteristica = Caracteristica.CALMA;
		} else if (valor == 2) {
			caracteristica = Caracteristica.NERVOSA;
		} else {
			caracteristica = Caracteristica.AGRESSIVA;
		}
	}

	@Override
	public String toString() {
		return "Pessoa [idade=" + idade + ", sexo=" + sexo + ", caracteristica=" + caracteristica + "]";
	}

}
