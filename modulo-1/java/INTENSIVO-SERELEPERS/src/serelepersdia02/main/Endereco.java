package serelepersdia02.main;

public class Endereco {

	private String nomeRua;
	private int numero;
	private String estado;

	public Endereco(String nomeRua, int numero, String estado) {
		this.nomeRua = nomeRua;
		this.numero = numero;
		this.estado = estado;
	}

	public String getNomeRua() {
		return nomeRua;
	}

	public void setNomeRua(String nomeRua) {
		this.nomeRua = nomeRua;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

}
