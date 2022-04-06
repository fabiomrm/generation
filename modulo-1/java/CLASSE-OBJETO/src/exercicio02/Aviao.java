package exercicio02;

public class Aviao {

	private String modelo;
	private int ano;
	private String empresaDona;
	private double combustivel;
	private boolean estaVoando;

	public Aviao(String modelo, int ano, String empresaDona, double combustivel) {
		this.modelo = modelo;
		this.ano = ano;
		this.empresaDona = empresaDona;
		this.combustivel = combustivel;
		this.estaVoando = false;
	}

	public void voar() {
		if (this.combustivel > 1000d) {
			System.out.println(" O avião " + modelo + " está voando!");
			this.estaVoando = true;
		} else {
			System.out.println("O avião  "+ modelo  + " só pode voar com pelo menos 1000 litros");
			System.out.println("Atualmente ele está com: " + combustivel);
		}

	}

	public void pousar() {
		if (this.estaVoando) {
			this.estaVoando = false;
			System.out.println(modelo + " aterrisou");
		} else {
			System.out.println(modelo + " já está no chão");
		}
	}

	public double abastecer(double combustivel) {
		if (combustivel > 0) {
			this.combustivel += combustivel;
		}

		return this.combustivel;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getEmpresaDona() {
		return empresaDona;
	}

	public void setEmpresaDona(String empresaDona) {
		this.empresaDona = empresaDona;
	}

	public double getCombustivel() {
		return combustivel;
	}

	public void setCombustivel(double combustivel) {
		this.combustivel = combustivel;
	}

	public boolean isEstaVoando() {
		return estaVoando;
	}

	public void setEstaVoando(boolean estaVoando) {
		this.estaVoando = estaVoando;
	}

}
