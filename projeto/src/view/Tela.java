package view;

import java.io.IOException;

import services.ColetorEstado;

public class Tela {

	public static void main(String[] args) {
		ColetorEstado coletor = new ColetorEstado();
		
		try {
			coletor.ler();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
