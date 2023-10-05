package model;

public class Partida {
	private String id;
	private Integer qtdGols;
	private String placar;

	public Partida(String id, Integer qtdGols, String placar) {
		this.id = id;
		this.qtdGols = qtdGols;
		this.placar = placar;
	}

	public Partida() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getQtdGols() {
		return qtdGols;
	}

	public void setQtdGols(Integer qtdGols) {
		this.qtdGols = qtdGols;
	}

	public String getPlacar() {
		return placar;
	}

	public void setPlacar(String placar) {
		this.placar = placar;
	}

}
