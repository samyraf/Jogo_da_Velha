package trabalho_final;

public class Mapa {

	private char[][] mapa = new char[3][3];
	
	public int sortear(int inicio, int fim) {
	    return (int) ((Math.random() * fim) - inicio);
	}
	
	public void limpar() {
		for (int i = 0; i < mapa.length; i++) {
			mapa[i][i] = ' ';
		}
	}
	
	public void desenhar(int jogada) {
		
		System.out.println("---------- .. Jogada: " + jogada);
        for(int i = 0; i < 3; i++) {
            System.out.print("|");
            
            for(int j = 0; j < 3; j++) {
                System.out.print(mapa[i][j] + "|");
            }
            System.out.println(" ");
        }
        System.out.println("----------");
	}
	
	public boolean jogar(int l, int c, char jogador) {
		
		if (mapa[l][c] == ' ') {
			mapa[l][c] = jogador;
		}
		
		return verificarGanhador(jogador);
	}
	
	public boolean verificarGanhador(char jogador) {
		
		if ((mapa[0][0] == jogador) && (mapa[0][1] == jogador) && (mapa[0][2] == jogador)) {
			return true; // linha 0
		} else if ((mapa[1][0] == jogador) && (mapa[1][1] == jogador) && (mapa[1][2] == jogador)) {
			return true; // linha 1
		} else if ((mapa[2][0] == jogador) && (mapa[2][1] == jogador) && (mapa[2][2] == jogador)) {
			return true; // linha 2
		} else if ((mapa[0][0] == jogador) && (mapa[1][0] == jogador) && (mapa[2][0] == jogador)) {
			return true; // coluna 0
		} else if ((mapa[0][1] == jogador) && (mapa[1][1] == jogador) && (mapa[2][1] == jogador)) {
			return true; // coluna 1
		} else if ((mapa[0][2] == jogador) && (mapa[1][2] == jogador) && (mapa[2][2] == jogador)) {
			return true; // coluna 2
		} else if ((mapa[0][0] == jogador) && (mapa[1][1] == jogador) && (mapa[2][2] == jogador)) {
			return true; // diagonal direita
		} else if ((mapa[0][2] == jogador) && (mapa[1][1] == jogador) && (mapa[2][0] == jogador)) {
			return true; // diagonal esquerda
		}
		
		return false;
	}
}
