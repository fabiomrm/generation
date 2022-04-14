package exercicio05;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o nome da agenda: ");
		String scheduleName = sc.nextLine();
		System.out.println("Quantos contatos você quer armazenar: ");
		int contactsAmount = sc.nextInt();

		sc.nextLine();
		Schedule schedule = new Schedule();
		for (int i = 0; i < contactsAmount; i++) {
			System.out.println("Digite o nome do contato " + (i + 1) + ": ");
			String name = sc.nextLine();
			System.out.println("Digite o número do telefone " + (i + 1) + ": ");
			String phone = sc.nextLine();
			System.out.println("Digite o email: " + (i + 1) + ": ");
			String email = sc.nextLine();

			schedule.getContacts().add(new Contact(name, phone, email));
		}

		schedule.printContacts();

		System.out.println("Você quer saber os dados de qual usuário? ");
		for (int i = 0; i < schedule.getContacts().size(); i++) {
			System.out.println((i + 1) + "- " + schedule.getContacts().get(i).getName());
		}
		int option = sc.nextInt();
		sc.nextLine();

		Contact contact = schedule.printContactInfo(option);
		System.out.println(contact.getName());
		System.out.println(contact.getPhone());
		System.out.println(contact.getEmail());

		sc.close();

	}

}
