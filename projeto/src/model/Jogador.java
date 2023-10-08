package model;

public class Jogador {

	private String nome;
	private Integer qtdCartaoAmarelo = 0;
	private Integer qtdCartaoVermelho = 0;
	private Integer totalDeGols = 0;
	private Integer qtdGolsContra = 0;
	private Integer qtdGolsPenalti = 0;

	public Jogador(String nome, Integer qtdCartaoAmarelo, Integer qtdCartaoVermelho, Integer totalDeGols,
			Integer qtdGolsContra, Integer qtdGolsPenalti) {
		this.nome = nome;
		this.qtdCartaoAmarelo = qtdCartaoAmarelo;
		this.qtdCartaoVermelho = qtdCartaoVermelho;
		this.totalDeGols = totalDeGols;
		this.qtdGolsContra = qtdGolsContra;
		this.qtdGolsPenalti = qtdGolsPenalti;
	}

	public Jogador(String nome) {
		this.nome = nome;
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

	public void somarCartaoAmarelo() {
		this.qtdCartaoAmarelo++;
	}

	public Integer getQtdCartaoVermelho() {
		return qtdCartaoVermelho;
	}

	public void somarCartaoVermelho() {
		this.qtdCartaoVermelho++;
	}

	public Integer getTotalDeGols() {
		return totalDeGols;
	}

	public void somarTotalDeGols() {
		this.totalDeGols++;
	}

	public Integer getQtdGolsContra() {
		return qtdGolsContra;
	}

	public void somarGolsContra() {
		somarTotalDeGols();
		this.qtdGolsContra++;
	}

	public Integer getQtdGolsPenalti() {
		return qtdGolsPenalti;
	}

	public void somarGolsPenalti() {
		somarTotalDeGols();
		this.qtdGolsPenalti++;
	}

	@Override
	public String toString() {
		return "Jogador [nome=" + nome + ", qtdCartaoAmarelo=" + qtdCartaoAmarelo + ", qtdCartaoVermelho="
				+ qtdCartaoVermelho + ", totalDeGols=" + totalDeGols + ", qtdGolsContra=" + qtdGolsContra
				+ ", qtdGolsPenalti=" + qtdGolsPenalti + "]";
	}
}
