package view;

import java.io.IOException;

import controller.Controle;
import model.Time;
import services.ColetorTime;
import services.Leitor;

public class Tela {

	public static void main(String[] args) throws IOException {
		//Leitor<Time> coletor = new ColetorTime();
		Controle control = new Controle();
		
		System.out.println(control.timeComVitoriasEm2008());
		
		//try {
		//	coletor.ler();
		//} catch (IOException e) {
			// TODO Auto-generated catch block
		//	e.printStackTrace();
		//}

	}

}
