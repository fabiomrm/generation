package serelepersdia02;

import java.util.ArrayList;
import java.util.List;

public class Contato {

	private String nome;

	// Um contato TEM MUITOS telefones
	private List<Telefone> telefones = new ArrayList<>();

	// Um contato TEM UM endereço
	private Endereco endereco;

	public Contato() {
	}

	public Contato(String nome, List<Telefone> telefones, Endereco endereco) {
		this.nome = nome;
		this.telefones = telefones;
		this.endereco = endereco;

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Telefone> getTelefones() {
		return telefones;
	}

	//Não é uma boa prática ter método SET de coleções (Lista, Sets, Maps...)
//	public void setTelefone(List<Telefone> telefones) {
//		this.telefones = telefones;
//	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public void imprimeInformacoes() {
		System.out.println("Nome: " + this.nome);
		
		//For normal
//		for(int i=0; i < this.telefones.size(); i++) {
//			System.out.println(this.telefones.get(i).getNumero());
//		}
		
		// For each - para cada
		for(Telefone telefone : this.telefones) {
			System.out.println(telefone.getNumero());
		}

		System.out.println("\nEndereço: " + this.endereco.getRua() + ", " + this.endereco.getNumero() + " - "
				+ this.endereco.getEstado());

	}

}
