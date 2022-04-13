package exercicio02;

public class CheckingAccount {

	private int number;
	private String agencie;
	private boolean special;
	private double specialLimit;
	private double balance;

	public CheckingAccount() {

	}

	public CheckingAccount(int number, String agencie, boolean special, double specialLimit, double balance) {
		this.number = number;
		this.agencie = agencie;
		this.special = special;
		setSpecialLimit(specialLimit);
		this.balance = balance;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getAgencie() {
		return agencie;
	}

	public void setAgencie(String agencie) {
		this.agencie = agencie;
	}

	public boolean isSpecial() {
		return special;
	}

	public void setSpecial(boolean special) {
		this.special = special;
	}

	public double getSpecialLimit() {
		return specialLimit;
	}

	public void setSpecialLimit(double specialLimit) {
		if(!special) {
			this.specialLimit = 0;
			System.out.println("A conta não é especial e não pode receber esse Valor!");
		} else {			
			this.specialLimit = specialLimit;
		}
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public boolean withDraw(double amount) {
		if (balance >= amount) {
			balance -= amount;
			return true;
		} else {
			if (special) {
				double limit = specialLimit + balance;
				if (limit >= amount) {
					balance = 0;
					specialLimit = amount - balance;
					return true;
				} else {
					return false;
				}
			} else {				
				return false;
			}
		}
	}

	public void printBalance() {
		System.out.println("Seu saldo é de: R$ " + balance);
	}

	@Override
	public String toString() {
		String s = "CONTA";
		s += "\nConta: " + number;
		s += "\nAgência: " + agencie;
		s += "\nSaldo: " + balance;
		s += "\nConta Especial? " + special;
		s += "\nLimite especial: R$ " + specialLimit;
		return s;
	}
	
	

}
