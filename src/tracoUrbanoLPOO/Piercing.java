package tracoUrbanoLPOO;

import java.time.Duration;
import java.util.UUID;

public class Piercing extends Procedimento{
	private double valorJoia;

	public Piercing(String id, String nome, double valorBase, Duration duracaoEstimada, double valorJoia) {
		super(UUID.randomUUID().toString(), nome, valorBase, duracaoEstimada);
		this.valorJoia = valorJoia;
	}
	
	@Override
	public double calcularValor() {		
		return this.getValorBase() + valorJoia;
	};
	
	@Override
	public int getDiasParaRetorno() {
		return 30;
	}
	
	@Override
	public String getTipo() {
		return "Piercing";
	};	
}
