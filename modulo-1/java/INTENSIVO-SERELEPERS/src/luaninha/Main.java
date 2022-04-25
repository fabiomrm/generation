package luaninha;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Agenda agenda = new Agenda();

		System.out.println("Ol�! Digite o nome da sua agenda: ");
		String nome = sc.nextLine();

		agenda.setNome(nome);

		System.out.println("Quantos contatos voc� quer adicionar: ");
		int qtdContatos = sc.nextInt();

		sc.nextLine();

		List<Contato> contatos = new ArrayList<>();

		for (int i = 0; i < qtdContatos; i++) {

			// Voc� vai pedir as informa��es para instanciar um objeto do tipo contato
			System.out.println("Qual o nome do contato? ");
			String nomeContato = sc.nextLine();

			System.out.println("Qual o telefone: ");
			String telefoneContato = sc.nextLine();

			System.out.println("Qual o email: ");
			String emailContato = sc.nextLine();

			Contato contato = new Contato(nomeContato, telefoneContato, emailContato);

			contatos.add(contato);

			// Maneira 01
			// agenda.getContatos().add(contato);

			// Adicionar este objeto a uma lista previamente criada

			// Quando encerrar o loop, adicionar essa lista � lista do objeto agenda
		}
		
		/*
		for(int i=0; i < contatos.size(); i++) {
			agenda.getContatos().add(contatos.get(i));
		}
		
		for(Contato c : contatos) {
			agenda.getContatos().add(c);
		}
		*/

	}
}
