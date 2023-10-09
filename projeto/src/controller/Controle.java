package controller;

import java.io.IOException;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;
import java.util.stream.Collectors;

import model.Estado;
import model.Jogador;
import model.Partida;
import model.Time;
import services.ColetorEstado;
import services.ColetorJogador;
import services.ColetorPartidas;
import services.ColetorTime;

public class Controle {
	
	private List<Estado> estados = new ArrayList<>();
	private List<Jogador> jogadores = new ArrayList<>();
	private List<Partida> partidas = new ArrayList<>();
	private List<Time> times = new ArrayList<>();

	public Controle() throws IOException {
		ColetorEstado coletorEstado = new ColetorEstado();
		this.estados = coletorEstado.ler();
		ColetorJogador coletorJogador = new ColetorJogador();
		this.jogadores = coletorJogador.ler();
		ColetorPartidas coletorPartidas = new ColetorPartidas();
		this.partidas = coletorPartidas.ler();
		ColetorTime coletorTime = new ColetorTime();
		this.times = coletorTime.ler();
	}

	public String timeComVitoriasEm2008() {
        AtomicReference<String> timeRetornado = new AtomicReference<>();
        List<Time> jogosDe2008 = this.times.stream().filter(time -> time.getDataDaVitoria().getYear() == 2008).toList();

        Map<String, Long> frequencias = jogosDe2008.stream().map(Time::getNomeTime)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        Optional<Map.Entry<String, Long>> palavraMaisFrequente = frequencias.entrySet().stream()
                .max(Map.Entry.comparingByValue());

        palavraMaisFrequente.ifPresent(palavra -> timeRetornado.set(palavra.getKey()));

        return timeRetornado.get();
    }

	public String estadoComMenosJogos() {
		AtomicReference<String> estado = new AtomicReference<>();

		Map<String, Long> frequencias = this.estados.stream().map(Estado::getNomeDoEstado)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		Optional<Map.Entry<String, Long>> estadoMenosFrequente = frequencias.entrySet().stream()
				.min(Map.Entry.comparingByValue());

		estadoMenosFrequente.ifPresent(palavra -> estado.set(palavra.getKey()));

		return estado.get();
	}

	public String jogadorComMaisGols() {
		Optional<Jogador> jogador = this.jogadores.stream().max((a, b) -> Integer.compare(a.getTotalDeGols(), b.getTotalDeGols()));

		return jogador.get().getNome();
	}

	public String jogadorComMaisGolsDePenalti() {
		Optional<Jogador> jogador = this.jogadores.stream().max((a, b) -> Integer.compare(a.getQtdGolsPenalti(), b.getQtdGolsPenalti()));

		return jogador.get().getNome();
	}

	public String jogadorComMaisGolsContra() {
		Optional<Jogador> jogador = this.jogadores.stream().max(Comparator.comparingInt(Jogador::getQtdGolsContra));

		return jogador.get().getNome();
	}

}
