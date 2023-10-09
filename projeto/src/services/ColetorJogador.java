package services;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import model.Jogador;

public class ColetorJogador implements Leitor<Jogador> {

	List<Jogador> jogadores = new ArrayList<>();
	String csvArquivoGol = "src/data/campeonato-brasileiro-gols.csv";
	String csvArquivoCartao = "src/data/campeonato-brasileiro-cartoes.csv";

	String linha = "";
	String separador = ",";

	@Override
	public List<Jogador> ler() {
		try (BufferedReader br1 = new BufferedReader(new FileReader(csvArquivoGol));
				BufferedReader br2 = new BufferedReader(new FileReader(csvArquivoCartao))) {
			br1.readLine();
			br2.readLine();

			while ((linha = br1.readLine()) != null) {
				String[] dadosJogador = linha.split(separador);
				String nomeDoJogador = dadosJogador[3].replace("\"", "");
				Optional<Jogador> jogadorNaLista = consultar(nomeDoJogador);

				Jogador jogador;
				if (jogadorNaLista.isPresent()) {
					jogador = jogadorNaLista.get();
				} else {
					jogador = adicionar(nomeDoJogador);
				}

				String tipoDoGol = dadosJogador[5].replace("\"", "");

				calcularGol(jogador, tipoDoGol);

				// Um Teste
				// System.out.println();
			}

			while ((linha = br2.readLine()) != null) {
				String[] dadosJogador = linha.split(separador);
				String nomeDoJogador = dadosJogador[4].replace("\"", "");
				Optional<Jogador> jogadorNaLista = consultar(nomeDoJogador);

				Jogador jogador;
				if (jogadorNaLista.isPresent()) {
					jogador = jogadorNaLista.get();
				} else {
					jogador = adicionar(nomeDoJogador);
				}

				String tipoDoCartao = dadosJogador[3].replace("\"", "");
				calcularCartao(jogador, tipoDoCartao);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(jogadores);
		return jogadores;
	}

	private void calcularGol(Jogador jogador, String tipoDoGol) {
		if (tipoDoGol.equals("Gol Contra")) {
			jogador.somarGolsContra();
		} else if (tipoDoGol.equals("Penalty")) {
			jogador.somarGolsPenalti();
		} else {
			jogador.somarTotalDeGols();
		}
	}

	public void calcularCartao(Jogador jogador, String tipoDoCartao) {
		if (tipoDoCartao.equals("Amarelo")) {
			jogador.somarCartaoAmarelo();
		} else if (tipoDoCartao.equals("Vermelho")) {
			jogador.somarCartaoVermelho();
		}
	}

	public Optional<Jogador> consultar(String nomeDoJogador) {
		return jogadores.stream().filter(jogador -> jogador.getNome().equals(nomeDoJogador)).findFirst();
	}

	public Jogador adicionar(String nomeDoJogador) {
		Jogador novoJogador = new Jogador(nomeDoJogador); // Crie um novo jogador se necessário
		jogadores.add(novoJogador);
		return novoJogador;
	}

}
