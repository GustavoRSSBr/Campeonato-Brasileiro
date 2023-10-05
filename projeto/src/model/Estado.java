package model;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Estado {
	private String nome;
	private Map<Date, Integer> qtdJogoAno = new HashMap<Date, Integer>();

	public Estado(String nome, Map<Date, Integer> qtdJogoAno) {
		this.nome = nome;
		this.qtdJogoAno = qtdJogoAno;
	}

	public Estado() {

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Map<Date, Integer> getQtdJogoAno() {
		return qtdJogoAno;
	}

	public void setQtdJogoAno(Map<Date, Integer> qtdJogoAno) {
		this.qtdJogoAno = qtdJogoAno;
	}

}
