package exercicio03;

import java.util.ArrayList;
import java.util.List;

public class Student {

	private String name;
	private String code;
	private String course;
	private List<Discipline> disciplines = new ArrayList<>();
	private double[][] notes = new double[3][4];

	public Student() {

	}

	public Student(String name, String code, String course, List<Discipline> disciplines, double[][] notes) {
		super();
		this.name = name;
		this.code = code;
		this.course = course;
		this.disciplines = disciplines;
		this.notes = notes;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public List<Discipline> getDisciplines() {
		return disciplines;
	}

	public double[][] getNotes() {
		return notes;
	}

	public void setNotes(double[][] notes) {
		this.notes = notes;
	}

	public double calculateAvg(int disciplineIndex) {
		double sum = 0d;
		for (int i = 0; i < notes[disciplineIndex - 1].length; i++) {
			sum += notes[disciplineIndex][i];
		}

		return sum / notes[disciplineIndex - 1].length;
	}
	
	public boolean isApproved(int disciplineIndex) {
		
		double avg = calculateAvg(disciplineIndex);
		return avg >= 7;
	}

}
