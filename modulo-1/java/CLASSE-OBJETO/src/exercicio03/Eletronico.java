package exercicio03;

public class Eletronico {

	String nomeProprietario;

	int sinal;
	int bateria;

	void pertence_a() {
		System.out.println("\nCelular do " + nomeProprietario);
	}

	void rede(int numero) {
		int sinalAtual = this.sinal + numero;
		this.sinal = sinalAtual;
	}

	int ligarPara() {
		if (this.sinal < 2) {
			System.out.println("\nCelular sem sinal!");
			return -2;
		} else {
			System.out.println("\nLiga para...");
			return 3;
		}
	}

	void adicionaCarga(int carga) {
		int bateriaAtual = this.bateria + carga;
		this.bateria = bateriaAtual;

	}

	void verificarStatusBateria() {
		if (this.bateria < 15) {
			System.out.println("\nDescarregando...");
			System.out.println("Sua baterial atual é: " + this.bateria);
		} else {
			System.out.println("Nem precisa carregar!");
		}
	}

}
