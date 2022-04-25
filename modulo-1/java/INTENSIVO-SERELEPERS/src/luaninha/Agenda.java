package luaninha;

import java.util.ArrayList;
import java.util.List;

public class Agenda {

	private String nome;
	private List<Contato> contatos = new ArrayList<>();

	public Agenda() {

	}

	public Agenda(String nome, List<Contato> contatos) {
		this.nome = nome;
		this.contatos = contatos;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Contato> getContatos() {
		return contatos;
	}

	@Override
	public String toString() {
		return "Agenda [nome=" + nome + ", contatos=" + contatos + "]";
	}

}
