package exercicio03;

public class Discipline {

	private String name;

	public Discipline() {

	}

	public Discipline(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Discipline [name=" + name + "]";
	}

}
