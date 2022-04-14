package serelepersdia02;

public class Telefone {

	private String tipo;
	private int ddd;
	private String numero;



	public Telefone(String tipo, int ddd, String numero) {
		this.tipo = tipo;
		this.ddd = ddd;
		this.numero = numero;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getDdd() {
		return ddd;
	}

	public void setDdd(int ddd) {
		this.ddd = ddd;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

}
