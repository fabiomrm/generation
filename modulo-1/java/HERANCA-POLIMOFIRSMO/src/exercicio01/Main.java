package exercicio01;

import exercicio01.entidades.Cachorro;
import exercicio01.entidades.Cavalo;
import exercicio01.entidades.Preguica;

public class Main {

	public static void main(String[] args) {

		Cachorro cachorro = new Cachorro("Bob", 10, 100);
		Cavalo cavalo = new Cavalo("André", 23);
		Preguica preguica = new Preguica("Kayla", 12);

		cachorro.emiteSom("AU-AU", "e tá curtindo");

		System.out.println("===========");

		cavalo.emiteSom("hiiin ninini hiiir", ", mas nem se importa");

		System.out.println("===========");

		preguica.emiteSom("rrrrrr", "com vigor");

		System.out.println("===========");

		System.out.println("TESTE DA CORRIDA DO CACHORRO");

		while (cachorro.isDeveCorrer()) {
			cachorro.gastaEnergia(10);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println(cachorro + " corrreeee");
		}

		System.out.println(cachorro + " cansou e foi dormir.");
	}

}
