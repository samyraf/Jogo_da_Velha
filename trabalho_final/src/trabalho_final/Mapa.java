package trabalho_final;

public class Mapa {

	private char[][] mapa = new char[3][3];
	
	public int sortear(int inicio, int fim) {
	    return (int) ((Math.random() * fim) - inicio);
	}
	
	public void limpar() {
		for (int i = 0; i < 3; i++) {
			mapa[i][i] = ' ';
		}
	}
	
	public void desenhar(int jogada) {
		
		String linha = "_";
		String coluna = "|";
		
		for (int i = 0; i < 3; i++) {
			if (i < 2) {
				System.out.println(mapa[i][i] + coluna);
			} else {
				System.out.println(mapa[i][i]);
			}
			for(int j = 0; j < 2; j++) {
				System.out.println(linha);
			}
		}
	}
	
	public boolean jogar(int l, int c, char jogador) {
		return false;
	}
	
	public boolean verificarGanhador(char jogador) {
		return false;
	}
	
	public boolean naoEstaVazio(int linha, int coluna) {
		return mapa[linha][coluna] != ' ';
	}
	
	public boolean estaVazio(int linha, int coluna) {
		return mapa[linha][coluna] == ' ';
	}
}
