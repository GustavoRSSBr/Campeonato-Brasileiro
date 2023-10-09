package services;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import model.Partida;

public class ColetorPartidas implements Leitor<Partida> {

	List<Partida> partidasValidas = new ArrayList<>();
	String csvArquivo = "src/data/campeonato-brasileiro-full.csv";

	String linha = "";
	String separador = ",";

	@Override
	public List<Partida> ler() {

		try (BufferedReader br = new BufferedReader(new FileReader(csvArquivo))) {
			br.readLine();
			while ((linha = br.readLine()) != null) {
				String[] dadosDaPartida = linha.split(separador);

				String idDaPartida = dadosDaPartida[0].replace("\"", "");
				Integer qtdDeGols = Integer.parseInt(dadosDaPartida[12].replace("\"", ""))
						+ Integer.parseInt(dadosDaPartida[13].replace("\"", ""));
				String placar = dadosDaPartida[12].replace("\"", "") + " x " + dadosDaPartida[13].replace("\"", "");

				Partida partida = new Partida(idDaPartida, qtdDeGols, placar);

				partidasValidas.add(partida);

				// Um Teste
				// System.out.println(
				// 		"Partida: " + idDaPartida + " | quantidade de Gols: " + qtdDeGols + " | Placar " + placar);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		return partidasValidas;
	}

}
