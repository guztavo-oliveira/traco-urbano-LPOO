package tracoUrbanoLPOO;

import java.time.Duration;
import java.util.UUID;

public class Retoque extends Procedimento{
	private String descricao;

	public Retoque(String id, String nome, double valorBase, Duration duracaoEstimada, String descricao) {
		super(UUID.randomUUID().toString(), nome, valorBase, duracaoEstimada);
		this.descricao = descricao;
	}
		
	public String getDescricao() {
		return descricao;
	}

	@Override
	public double calcularValor() {		
		return this.getValorBase();
	};
	
	@Override
	public int getDiasParaRetorno() {
		return 30;
	}
	
	@Override
	public String getTipo() {
		return "Retoque";
	};	
	
}
