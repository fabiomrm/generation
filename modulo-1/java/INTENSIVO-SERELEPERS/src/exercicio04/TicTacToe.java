package exercicio04;

public class TicTacToe {

	private char[][] table = new char[3][3];
	private int playCount = 1;

	public TicTacToe() {

	}

	public TicTacToe(char[][] table, int playCount) {
		super();
		this.table = table;
		this.playCount = playCount;
	}

	public char[][] getTable() {
		return table;
	}

	public void setTable(char[][] table) {
		this.table = table;
	}

	public int getPlayCount() {
		return playCount;
	}

	public void setPlayCount(int playCount) {
		this.playCount = playCount;
	}

	public boolean validatePlay(int line, int col, char currentPlayChar) {
		if (table[line][col] == 'X' || table[line][col] == '0') {
			return false;
		} else {
			table[line][col] = currentPlayChar;
			playCount++;
			return true;
		}
	}

	public void printTable() {
		for (int i = 0; i < table.length; i++) {
			for (int j = 0; j < table[i].length; j++) {
				System.out.print(table[i][j] + " | ");
			}
			System.out.println();
		}
	}

	public boolean checkWinner(char sign) {
		if ((table[0][0] == sign && table[0][1] == sign && table[0][2] == sign) // linha 1
				|| (table[1][0] == sign && table[1][1] == sign && table[1][2] == sign) // linha 2
				|| (table[2][0] == sign && table[2][1] == sign && table[2][2] == sign) // linha 3
				|| (table[0][0] == sign && table[1][0] == sign && table[2][0] == sign) // coluna 1
				|| (table[0][1] == sign && table[1][1] == sign && table[2][1] == sign) // coluna 2
				|| (table[0][2] == sign && table[1][2] == sign && table[2][2] == sign) // coluna 3
				|| (table[0][0] == sign && table[1][1] == sign && table[2][2] == sign) // diag pri
				|| (table[0][2] == sign && table[1][1] == sign && table[2][0] == sign) // diad sec
		) {
			return true;
		}
		return false;
	}

	public boolean player1turn() {
		if (playCount % 2 != 0) {
			return true;
		}

		return false;
	}

}
