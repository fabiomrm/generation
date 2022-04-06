package exercicio07;

public class Paciente {

	private String name;
	private int idade;
	private String sexo;
	private String[] sintomas;

	public Paciente(String name, int idade, String sexo, String[] sintomas) {
		this.name = name;
		this.idade = idade;
		this.sexo = sexo;
		this.sintomas = sintomas;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String[] getSintoma() {
		return sintomas;
	}

}
