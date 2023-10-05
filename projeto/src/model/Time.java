package model;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Time {
	private String nomeTime;
	private Map<Date, Integer> qtdVitoriasAno = new HashMap<Date, Integer>();

	public Time(String nomeTime, Map<Date, Integer> qtdVitoriasAno) {
		this.nomeTime = nomeTime;
		this.qtdVitoriasAno = qtdVitoriasAno;
	}

	public Time() {
	}

	public String getNomeTime() {
		return nomeTime;
	}

	public void setNomeTime(String nomeTime) {
		this.nomeTime = nomeTime;
	}

	public Map<Date, Integer> getQtdVitoriasAno() {
		return qtdVitoriasAno;
	}

	public void setQtdVitoriasAno(Map<Date, Integer> qtdVitoriasAno) {
		this.qtdVitoriasAno = qtdVitoriasAno;
	}

}
