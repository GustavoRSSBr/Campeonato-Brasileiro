package model;

import java.time.LocalDate;

public class Estado {
	private String nomeDoEstado;
	private LocalDate dataDoJogo;

	public Estado(String nome, LocalDate dataDoJogo) {
		this.nomeDoEstado = nome;
		this.dataDoJogo= dataDoJogo;
	}

	public Estado() {

	}

	public String getNomeDoEstado() {
		return nomeDoEstado;
	}

	public void setNomeDoEstado(String nomeDoEstado) {
		this.nomeDoEstado = nomeDoEstado;
	}

	public LocalDate getDataDoJogo() {
		return dataDoJogo;
	}

	public void setDataDoJogo(LocalDate dataDoJogo) {
		this.dataDoJogo = dataDoJogo;
	}

	

}
