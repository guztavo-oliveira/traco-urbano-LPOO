package tracoUrbanoLPOO;

import java.time.Duration;
import java.util.UUID;

public class Tatuagem extends Procedimento{
	private double tamanhoCm;
	private boolean colorida = false;

	public Tatuagem(String nome, double valorBase, Duration duracaoEstimada, boolean colorida) {
		super(UUID.randomUUID().toString(), nome, valorBase, duracaoEstimada);
		this.colorida = colorida;
	}
	
	public double getTamanhoCm() {
		return tamanhoCm;
	}

	public boolean isColorida() {
		return colorida;
	}

	@Override
	public double calcularValor() {
		if(colorida) {
			return this.getValorBase() * 1.30;
		}
		return this.getValorBase();
	};
	
	@Override
	public int getDiasParaRetorno() {
		return 30;
	}
	
	@Override
	public String getTipo() {
		return "Tatuagem";
	};
	
}
