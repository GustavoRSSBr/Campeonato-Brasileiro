package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

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

	private int vitoriasEm2008(Time time) {
		return time.getQtdVitoriasAno()
	}


}
