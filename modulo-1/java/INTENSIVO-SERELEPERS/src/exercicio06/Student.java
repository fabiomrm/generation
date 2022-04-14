package exercicio06;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person {

	private String enrollment;
	private List<Double> notes = new ArrayList<>(4);

	public Student(String name, String email, String enrollment) {
		super(name, email);
		this.enrollment = enrollment;
	}

	public Student(String enrollment, List<Double> notes) {
		super();
		this.enrollment = enrollment;
		this.notes = notes;
	}

	public String getEnrollment() {
		return enrollment;
	}

	public void setEnrollment(String enrollment) {
		this.enrollment = enrollment;
	}

	public List<Double> getNotes() {
		return notes;
	}
	
	public double getAverageGrade() {
		double sum = 0;
		for(Double note : notes) {
			sum += note;
		}
		
		return sum / notes.size();
	}
	
	public boolean isApproved() {
		return getAverageGrade() >= 7;
	}

}
