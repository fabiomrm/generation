package exercicio07;

public class Individual extends TaxPayer {

	private Double healthExpenses;

	public Individual() {

	}

	public Individual(String name, double anualIncome, Double healthExpenses) {
		super(name, anualIncome);
		this.healthExpenses = healthExpenses;
	}

	public Double getHealthExpenses() {
		return healthExpenses;
	}

	public void setHealthExpenses(Double healthExpenses) {
		this.healthExpenses = healthExpenses;
	}

	@Override
	public double tax() {
		// double basicTax = (getAnualIncome < 20000) ? getAnualIncome() * 0.15 :
		// getAnualIncome() * 0.25;
		double basicTax;
		if (getAnualIncome() < 20000) {
			basicTax = getAnualIncome() * 0.15;
		} else {
			basicTax = getAnualIncome() * 0.25;
		}
		basicTax -= healthExpenses * 0.5;
		if (basicTax < 0d) {
			basicTax = 0;
		}

		return basicTax;
	}

}
