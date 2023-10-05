package model;

public class Jogador {

	private String nome;
	private Integer qtdCartaoAmarelo;
	private Integer qtdCartaoVermelho;
	private Integer totalDeGols;
	private Integer qtdGolsContra;
	private Integer qtdGolsPenalti;

	public Jogador(String nome, Integer qtdCartaoAmarelo, Integer qtdCartaoVermelho, Integer totalDeGols,
			Integer qtdGolsContra, Integer qtdGolsPenalti) {
		this.nome = nome;
		this.qtdCartaoAmarelo = qtdCartaoAmarelo;
		this.qtdCartaoVermelho = qtdCartaoVermelho;
		this.totalDeGols = totalDeGols;
		this.qtdGolsContra = qtdGolsContra;
		this.qtdGolsPenalti = qtdGolsPenalti;
	}

	public Jogador() {
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getQtdCartaoAmarelo() {
		return qtdCartaoAmarelo;
	}

	public void setQtdCartaoAmarelo(Integer qtdCartaoAmarelo) {
		this.qtdCartaoAmarelo = qtdCartaoAmarelo;
	}

	public Integer getQtdCartaoVermelho() {
		return qtdCartaoVermelho;
	}

	public void setQtdCartaoVermelho(Integer qtdCartaoVermelho) {
		this.qtdCartaoVermelho = qtdCartaoVermelho;
	}

	public Integer getTotalDeGols() {
		return totalDeGols;
	}

	public void setTotalDeGols(Integer totalDeGols) {
		this.totalDeGols = totalDeGols;
	}

	public Integer getQtdGolsContra() {
		return qtdGolsContra;
	}

	public void setQtdGolsContra(Integer qtdGolsContra) {
		this.qtdGolsContra = qtdGolsContra;
	}

	public Integer getQtdGolsPenalti() {
		return qtdGolsPenalti;
	}

	public void setQtdGolsPenalti(Integer qtdGolsPenalti) {
		this.qtdGolsPenalti = qtdGolsPenalti;
	}
}
