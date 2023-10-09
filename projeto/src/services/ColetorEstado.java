package services;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import model.Estado;

public class ColetorEstado implements Leitor<Estado> {

	List<Estado> estadosValidos = new ArrayList<>();
	String csvArquivo = "src/data/campeonato-brasileiro-full.csv";

	String linha = "";
	String separador = ",";
	DateTimeFormatter formato = DateTimeFormatter.ofPattern("d/M/yyyy");

	@Override
	public List<Estado> ler() {

		try (BufferedReader br = new BufferedReader(new FileReader(csvArquivo))) {
			br.readLine();
			while ((linha = br.readLine()) != null) {
				String[] dadosEstado = linha.split(separador);

				String dataPartidaTexto = dadosEstado[2].replace("\"", "");

				LocalDate dataDaPartida = LocalDate.parse(dataPartidaTexto, formato);

				Estado estadoJogo = new Estado(dadosEstado[15].replace("\"", ""), dataDaPartida);

				estadosValidos.add(estadoJogo);

				// Um Teste
				// System.out.println("Estado: " + dadosEstado[15].replace("\"", "") + " Data: " + dataDaPartida);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		return estadosValidos;
	}

}
