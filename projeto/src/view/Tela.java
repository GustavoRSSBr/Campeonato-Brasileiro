package view;

import java.io.IOException;

import model.Time;
import services.ColetorTime;
import services.Leitor;

public class Tela {

	public static void main(String[] args) {
		Leitor<Time> coletor = new ColetorTime();
		
		try {
			coletor.ler();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
