package exercicio03;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Student student = new Student();

		System.out.println("Entre com o nome do aluno: ");
		String name = sc.nextLine();
		student.setName(name);

		System.out.println("Entre com a matrícula do aluno: ");
		String code = sc.nextLine();
		student.setCourse(code);

		System.out.println("Entre com o nome do curso: ");
		String course = sc.nextLine();
		student.setCourse(course);

		for (int i = 0; i < 3; i++) {
			System.out.println("Entre com o nome da discplina: ");
			String nameDiscpline = sc.nextLine();

			Discipline discipline = new Discipline(nameDiscpline);

			student.getDisciplines().add(discipline);
		}

		for (int i = 0; i < student.getDisciplines().size(); i++) {
			System.out.println("DISCIPLINA: " + student.getDisciplines().get(i).getName());
			for (int j = 0; j < 3; j++) {
				System.out.println("Digite a nota " + (1 + j) + ": ");
				Double note = sc.nextDouble();
				

			}
		}

		int c = 0;
		for (Discipline discipline : student.getDisciplines()) {
			System.out.println((c + 1) + "- " + discipline.getName());
			c++;
		}
		System.out.println("Você deseja saber sua situação em qual disciplina? ");
		int discplineIndex = sc.nextInt();
		System.out.println(student.isApproved(discplineIndex));

	}

}
