package exercicio07;

public class Company extends TaxPayer {

	private Integer numberEmployees;

	public Company() {

	}

	public Company(String name, double anualIncome, Integer numberEmployees) {
		super(name, anualIncome);
		this.numberEmployees = numberEmployees;
	}

	public Integer getNumberEmployees() {
		return numberEmployees;
	}

	public void setNumberEmployees(Integer numberEmployees) {
		this.numberEmployees = numberEmployees;
	}

	@Override
	public double tax() {
		if (numberEmployees > 10) {
			return super.getAnualIncome() * 0.14;
		}

		return super.getAnualIncome() * 0.16;
	}

}
