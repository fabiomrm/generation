package exercicio04;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		TicTacToe ticTacToe = new TicTacToe();

		boolean winner = false;
		char sign;
		int line = 0;
		int col = 0;

		while (!winner) {

			if (ticTacToe.player1turn()) {
				System.out.println("Jogador 1: [LINHA][COLUNA]");
				sign = 'X';
			} else {
				System.out.println("Jogador 2: [LINHA][COLUNA]");
				sign = '0';
			}

			line = value("linha", sc);
			col = value("Coluna", sc);

			ticTacToe.validatePlay(line, col, sign);

			ticTacToe.printTable();

			if (ticTacToe.checkWinner('X')) {
				winner = true;
				System.out.println("Jogador 1 ganhou");
			} else if (ticTacToe.checkWinner('0')) {
				winner = true;
				System.out.println("Jogador 2 ganhou");
			} else if (ticTacToe.getPlayCount() > 9) {
				winner = true;
				System.out.println("EMPATE");
			}

		}

		sc.close();
	}

	public static int value(String typeValue, Scanner sc) {
		int value = 0;
		boolean validValue = false;
		while (!validValue) {
			System.out.println("Entre com a " + typeValue + "  1, 2, 3: ");
			value = sc.nextInt();
			if (value >= 1 && value <= 3) {
				validValue = true;
			} else {
				System.out.println("Entrada inválida, tente novamente");
			}
		}
		value--;
		return value;
	}

}
