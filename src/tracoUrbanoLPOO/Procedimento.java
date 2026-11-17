package tracoUrbanoLPOO;

import java.time.Duration;

public abstract class Procedimento {
	private String id;
	private String nome;
	private double valorBase;
	private Duration duracaoEstimada;
	
	public Procedimento(String id, String nome, double valorBase, Duration duracaoEstimada) {
		this.id = id;
		this.nome = nome;
		this.valorBase = valorBase;
		this.duracaoEstimada = duracaoEstimada;
	}
			
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValorBase() {
		return valorBase;
	}

	public void setValorBase(double valorBase) {
		this.valorBase = valorBase;
	}

	public Duration getDuracaoEstimada() {
		return duracaoEstimada;
	}

	public void setDuracaoEstimada(Duration duracaoEstimada) {
		this.duracaoEstimada = duracaoEstimada;
	}

	public abstract double calcularValor();
	
	public abstract int getDiasParaRetorno();
	
	public abstract String getTipo();
	
}
