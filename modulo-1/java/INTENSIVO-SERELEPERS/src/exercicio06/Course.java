package exercicio06;

import java.util.ArrayList;
import java.util.List;

public class Course {

	private String name;
	private String date;

	private Professor professor;

	private List<Student> students = new ArrayList<>();

	public Course() {
	}

	public Course(String name, Professor professor) {
		this.name = name;
		this.professor = professor;
	}

	public Course(String name, String date, Professor professor, List<Student> students) {
		this.name = name;
		this.date = date;
		this.professor = professor;
		this.students = students;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

}
