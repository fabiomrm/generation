package serelepersdia03;

public class Aluno {

	private String nome;
	private double[] notas = new double[3];

	public Aluno() {

	}
	
	public Aluno(String nome) {
		this.nome = nome;
	}

	public Aluno(String nome, double[] notas) {
		this.nome = nome;
		this.notas = notas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double[] getNotas() {
		return notas;
	}

	public void setNotas(double[] notas) {
		this.notas = notas;
	}
	
	public double somaNotas() {
		double soma = 0;
		for(int i=0; i < 3; i++) {
			soma = soma + notas[i];
		}
		
		return soma;
	}

}
