package exercicio02;

public class Main {

	public static void main(String[] args) {

		CheckingAccount account = new CheckingAccount();
		account.setAgencie("Agência 13");
		account.setNumber(1234);
		account.setBalance(1000);
		account.setSpecial(true);
		account.setSpecialLimit(100);

		System.out.println(account);
		System.out.println("===========");

		account.printBalance();
		account.withDraw(1000);
		account.printBalance();
	}

}
