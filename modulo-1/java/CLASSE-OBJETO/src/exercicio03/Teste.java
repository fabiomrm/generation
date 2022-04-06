package exercicio03;

public class Teste {

	public static void main(String[] args) {

		ProdutoEletronico pe1 = new ProdutoEletronico();
		
		pe1.setNome("Computador");
		pe1.setAno(2018);
		pe1.setPreco(2800.24);
		
		System.out.println(pe1);
		
		pe1.apertaInterruptor();
		pe1.apertaInterruptor();
		pe1.apertaInterruptor();
	}

}
