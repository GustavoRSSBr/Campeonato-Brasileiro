package view;

import java.io.IOException;

import controller.Controle;

public class Tela {

	public static void main(String[] args) {
		
		try {
			Controle controle = new Controle();

			System.out.println("--  Bem vindos às estatisticas do Brasileirão de pontos corridos  --");

			System.out.println();

			System.out.println("O time que mais venceu partidas em 2008 foi: " + controle.timeComVitoriasEm2008());
			System.out.println("O Estado que sediou menos partidas foi: " + controle.estadoComMenosJogos());
			System.out.println("O jogador com mais gols é: " + controle.jogadorComMaisGols());
			System.out.println("O jogador com mais gols de penâlti é: " + controle.jogadorComMaisGolsDePenalti());
			System.out.println("O jogador com mais gols contra é: " + controle.jogadorComMaisGolsContra());
			System.out.println("O jogador que mais recebeu cartões amarelos foi: " + controle.jogadorComMaisCartoesAmarelos());
			System.out.println("O jogador que mais recebeu cartões vermelhos foi: " + controle.jogadorComMaisCartoesVermelhos());
			System.out.println("A partida com o maior placar teve o placar: " + controle.partidaComMaisGols());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
