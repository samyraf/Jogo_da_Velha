package trabalho_final;

import java.util.Scanner;

public class Jogador {
	
	private char letra;
	private Mapa mapa;
	
	public Jogador(Mapa mapa) {
		this.mapa = mapa;
		this.letra = 'X';
	}
	
	public boolean jogar(Scanner sc) {
		int linha;
		int coluna;
		boolean entradaCorreta = false;
		
		System.out.println("____JOGADOR____");
		
		do {
			System.out.print("Digite a linha e a coluna desejada, respectivamente:"); 
			linha = sc.nextInt();
			coluna = sc.nextInt();
			
			if ((linha < 0 || linha > 2 ) || (coluna < 0 || coluna > 2)) {
				System.out.println("VALOR INCORRETO! \nDIGITE NOVAMENETE.");
			} else {
				entradaCorreta = true;
			}
			
		} while (entradaCorreta == false );
		
		return mapa.jogar(linha, coluna, letra); 
	}
}
