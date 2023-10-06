package model;

import java.time.LocalDate;

public class Time {
	private String nomeTime;
	private LocalDate dataDaVitoria;

	public Time(String nomeTime, LocalDate dataDaVitoria) {
		this.nomeTime = nomeTime;
		this.dataDaVitoria = dataDaVitoria;
	}

	public Time() {
	}

	public String getNomeTime() {
		return nomeTime;
	}

	public void setNomeTime(String nomeTime) {
		this.nomeTime = nomeTime;
	}

	public LocalDate getDataDaVitoria() {
		return dataDaVitoria;
	}

	public void setDataDaVitoria(LocalDate dataDaVitoria) {
		this.dataDaVitoria = dataDaVitoria;
	}

	
}
