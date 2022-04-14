package exercicio06;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o nome do curso: ");
		String courseName = sc.nextLine();
		
		System.out.println("Digite o nome da professore do curso: ");
		String professorName = sc.nextLine();
		System.out.println("Qual o departamento desta professore? ");
		String professorDepartment = sc.nextLine();
		System.out.println("Qual o email da professore? ");
		String professorEmail = sc.nextLine();
		
		
		Professor professor = new Professor(professorName, professorEmail, professorDepartment);
		
		Course course = new Course(courseName, professor);
		for(int i =0; i < 3; i++) {
			
			System.out.println("Digite o nome da alune " + (i+1) + ": ");
			String name = sc.nextLine();
			
			System.out.println("Digite o email: ");
			String email = sc.nextLine();
			
			System.out.println("Digite o número da matrícula: ");
			String enrollment = sc.nextLine();
			
			Student student = new Student(name, email, enrollment);
			
			for(int j=0; j < 4; j++) {
				System.out.println("Digite a nota " + (j+1) + ": ");
				double note = sc.nextDouble();
				student.getNotes().add(note);
			}
			sc.nextLine();	
			course.getStudents().add(student);
		}
		
		for(Student student: course.getStudents()) {
			System.out.println("Estudante: " + student.getName());
			System.out.println("Média: " + student.getAverageGrade());
			System.out.println("Aprovade? " + student.isApproved());
		}
		
		sc.close();

	}

}
