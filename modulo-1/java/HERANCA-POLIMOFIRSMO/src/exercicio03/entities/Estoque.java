package exercicio03.entities;

import java.util.ArrayList;
import java.util.List;

public class Estoque {

	private List<Product> products = new ArrayList<>();

	public Estoque() {
	}

	public Estoque(List<Product> products) {
		this.products = products;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public double getValorTotalEstoque() {
		return products.stream().mapToDouble(x -> x.getPrice() * x.getAmount()).reduce(0, (sum, x) -> sum + x);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		int c = 0;
		for (Product product : products) {
			sb.append("\n " + (c + 1) + product.getName());
		}

		return sb.toString();
	}

}
