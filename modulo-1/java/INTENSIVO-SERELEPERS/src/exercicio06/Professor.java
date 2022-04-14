package exercicio06;

public class Professor extends Person {

	private String department;

	public Professor() {
		super();
	}

	public Professor(String name, String email, String department) {
		super(name, email);
		this.department = department;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

}
