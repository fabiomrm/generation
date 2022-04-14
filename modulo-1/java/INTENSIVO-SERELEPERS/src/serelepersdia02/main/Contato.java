package serelepersdia02.main;

import java.util.ArrayList;
import java.util.List;

public class Contato {

	public String nome;
	public Endereco endereco;
	private List<Telefone> telefones = new ArrayList<>();

	public Contato() {

	}

	public Contato(String nome, Endereco endereco, List<Telefone> telefones) {
		this.nome = nome;
		this.endereco = endereco;
		this.telefones = telefones;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public List<Telefone> getTelefones() {
		return telefones;
	}

}
