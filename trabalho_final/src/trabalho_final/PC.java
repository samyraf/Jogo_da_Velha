package trabalho_final;

public class PC {
	
	private static char letra;
	private static Mapa mapa;
	
	public PC(Mapa mapa) {
		this.mapa = mapa;
		this.letra = 'O';
	}
	
	public boolean jogar() {
		int linha;
		int coluna;
		boolean entradaCorreta = false;
		
		System.out.println("____PC____");
		
		do {
			linha = mapa.sortear(0, 3);
			coluna = mapa.sortear(0, 3);
			
			entradaCorreta = mapa.estaVazio(linha,coluna);
			
		} while (entradaCorreta == false);
		
		return mapa.jogar(linha, coluna, letra);
	}
}
