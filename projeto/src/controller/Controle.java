package controller;

import java.util.ArrayList;
import java.util.List;

import model.Estado;
import model.Jogador;
import model.Partida;
import model.Time;
import services.ColetorEstado;
import services.ColetorJogador;
import services.ColetorPartidas;
import services.ColetorTime;

public class Controle {
	
	List<Estado> estados = new ArrayList<>();
	List<Jogador> jogadores = new ArrayList<>();
	List<Partida> partidas = new ArrayList<>();
	List<Time> times = new ArrayList<>();

	ColetorEstado coletorEstado = new ColetorEstado();
	ColetorJogador coletorJogador = new ColetorJogador();
	ColetorPartidas coletorPartidas = new ColetorPartidas();
	ColetorTime coletorTime = new ColetorTime();

	//public Controle() {
	//	this.estados = this.coletorEstado.ler();
	//}

}
