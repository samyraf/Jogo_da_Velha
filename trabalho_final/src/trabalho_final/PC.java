package trabalho_final;

public class PC {
	
	private char letra;
	private Mapa mapa;
	
	public PC(Mapa mapa) {
		this.mapa = mapa;
		this.letra = 'O';
	}
	
	public boolean jogar() {
		int linha;
		int coluna;
		
		System.out.println("____PC____");
	
		linha = mapa.sortear(0, 3);
		coluna = mapa.sortear(0, 3);
			
		return mapa.jogar(linha, coluna, letra);
	}
}
