package view;

import java.io.IOException;

import controller.Controle;
import model.Jogador;
import services.ColetorJogador;
import services.Leitor;

public class Tela {

	public static void main(String[] args) {
		
		try {
			Controle controle = new Controle();

			System.out.println(controle.partidaComMaisGols());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
