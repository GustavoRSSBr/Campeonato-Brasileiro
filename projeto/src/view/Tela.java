package view;

import java.io.IOException;

import model.Partida;
import services.ColetorPartidas;
import services.Leitor;

public class Tela {

	public static void main(String[] args) {
		Leitor<Partida> coletor = new ColetorPartidas();
		
		try {
			coletor.ler();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
