package view;

import java.io.IOException;

import model.Jogador;
import services.ColetorJogador;
import services.Leitor;

public class Tela {

	public static void main(String[] args) {
		
		Leitor<Jogador> teste = new ColetorJogador();
		
		try {
			teste.ler();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
