package exercicio05;

import java.util.ArrayList;
import java.util.List;

public class Schedule {

	private String name;
	private List<Contact> contacts = new ArrayList<>();

	public Schedule() {

	}

	public Schedule(String name, List<Contact> contacts) {
		this.name = name;
		this.contacts = contacts;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Contact> getContacts() {
		return contacts;
	}
	
	public Contact printContactInfo(int index) {
		return contacts.get(index - 1);
		
	}
	
	public void printContacts() {
		System.out.println("LISTA DE CONTATOS");
		System.out.println("================================");
		
		for (Contact contact : contacts) {
			System.out.println("Nome: " + contact.getName());
			System.out.println("Telefone: " + contact.getPhone());
			System.out.println("Email: " + contact.getEmail());
			System.out.println("================================");
		}
	}

}
