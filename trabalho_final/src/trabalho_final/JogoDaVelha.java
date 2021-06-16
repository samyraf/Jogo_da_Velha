package trabalho_final;

import java.util.Scanner;

public class JogoDaVelha {
	private Mapa jogoMapa = new Mapa();
	private Jogador jogoJogador = new Jogador(jogoMapa);
	private PC jogoPC = new PC(jogoMapa);
	
	
	private JogoDaVelha() {
		Scanner sc = new Scanner(System.in);
		
		Jogar(sc);
		
		sc.close();
	}
	
	private void Jogar(Scanner sc) {
		
		int jogada;
		char jogadorDaVez;
		String respostaJogarNovamente;
		boolean continuaJogo;
		boolean temGanhador;
		
		do {
			jogoMapa.limpar();
			
			jogada = 0;
			jogadorDaVez = ' ';
			respostaJogarNovamente = "";
			continuaJogo = false;
			temGanhador = false;
			
			if (jogoMapa.sortear(0, 1) == 0) {
				jogadorDaVez = 'O';
			} else {
				jogadorDaVez = 'X';
			}
			
			jogoMapa.desenhar(jogada);
			
			while (jogada < 9) {
				
				if (jogadorDaVez == 'X') {
					temGanhador = jogoJogador.jogar(sc);
				} else {
					temGanhador = jogoPC.jogar();
				}
				
				jogada++;
				jogoMapa.desenhar(jogada);
				
				if (temGanhador) {
					break;
				} else {
					if (jogadorDaVez == 'X') {
						jogadorDaVez = 'O';
					} else {
						jogadorDaVez = 'X';
					}
				}
			}
			
			if (temGanhador == false) {
				System.out.println("DEU VELHA!");
			} else if (jogadorDaVez == 'X') {
				System.out.println("JOGADOR GANHOU!");
			} else {
				System.out.println("PC GANHOU!");
			}
			
			while (true) {
				System.out.println("Você deseja jogar novamente? - Digite SIM ou NÃO");
				respostaJogarNovamente = sc.next().trim().toUpperCase();
				
				if (respostaJogarNovamente == "SIM") {
					continuaJogo = true;
					break;
				} else if (respostaJogarNovamente == "NÃO") {
					continuaJogo = false;
					break;
				} else {
					System.out.println("Resposta Inválida. Digite Novamente!");
				}
			}
			
		} while (continuaJogo);
		
	}

	public static void main(String[] args) {
		new JogoDaVelha();
	}
}
