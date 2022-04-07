package exercicio03;

public class Teste {

	public static void main(String[] args) {

		
		Eletronico celular = new Eletronico();
		celular.nomeProprietario = "Maria Silva";
		celular.sinal = 0;
		celular.bateria = 0;
		
		celular.pertence_a();
		
//		celular.rede(4);
//		System.out.println(celular.sinal);
//		sysout
		
		System.out.println("O valor da bateria antes da carga é: " + celular.bateria); // 0
		
		celular.adicionaCarga(14);
		
		celular.verificarStatusBateria();
		
		celular.adicionaCarga(1);
		
		celular.verificarStatusBateria();
		
//		System.out.println(celular.bateria);
		
//		celular.mexerCel();
				
		
		
		
//		ProdutoEletronico pe1 = new ProdutoEletronico();
//		
//		pe1.setNome("Computador");
//		pe1.setAno(2018);
//		pe1.setPreco(2800.24);
//		
//		System.out.println(pe1);
//		
//		pe1.apertaInterruptor();
//		pe1.apertaInterruptor();
//		pe1.apertaInterruptor();
	}

}
