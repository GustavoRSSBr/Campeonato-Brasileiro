package services;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import model.Time;

public class ColetorTime implements Leitor<Time> {

	List<Time> timesValidos = new ArrayList<>();
	String csvArquivo = "src/data/campeonato-brasileiro-full.csv";

	String linha = "";
	String separador = ",";
	DateTimeFormatter formato = DateTimeFormatter.ofPattern("d/M/yyyy");

	@Override
	public List<Time> ler() throws IOException {

		try (BufferedReader br = new BufferedReader(new FileReader(csvArquivo))) {
			br.readLine();
			while ((linha = br.readLine()) != null) {
				String[] dadosDoTime = linha.split(separador);

				String nomeDoGanhador = dadosDoTime[10].replace("\"", "");
				String dataTexto = dadosDoTime[2].replace("\"", "");
				
				if(nomeDoGanhador.equals("-")) {
					continue;
				}

				LocalDate dataDaPartida = LocalDate.parse(dataTexto, formato);

				Time timeGanhador = new Time(nomeDoGanhador , dataDaPartida);

				timesValidos.add(timeGanhador);

				// Um Teste
				System.out.println("Time: " + nomeDoGanhador + " | Data: " + dataDaPartida);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		return timesValidos;
	}

}
