package exercicio03.entities;

public class Product {

	private static long id;
	private String name;
	private double price;
	private int amount;

	public Product() {

	}

	public Product(String name, double price, int amount) {
		this.name = name;
		this.price = price;
		this.amount = amount;
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("\nNome: " + name);
		sb.append("\nPreço: R$ " + price);
		sb.append("\nQuantidade: " + amount);
		
		return sb.toString();
	}

}
