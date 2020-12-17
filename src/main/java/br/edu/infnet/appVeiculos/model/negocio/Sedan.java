package br.edu.infnet.appVeiculos.model.negocio;

import br.edu.infnet.appVeiculos.model.exception.AirbagInvalidoException;

public class Sedan extends Veiculo {

	private int airbag;
	private boolean pinturaMetalica;
	
	public Sedan(String descricao, float valor, boolean producaoNacional) {
		super(descricao, valor, producaoNacional);
	}

	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append(";");
		sb.append(this.isPinturaMetalica());
		sb.append(";");
		sb.append(this.getAirbag());
		
		return sb.toString();
	}

	@Override
	public float calcularValorVenda() {
			
		float valorPinturaMetalica = this.getValor() * 0.05f;		
		float valorAirbag = this.getValor() * this.getAirbag(); 

		return this.getValor() + valorPinturaMetalica + valorAirbag;

	}

	public boolean isPinturaMetalica() {
		return pinturaMetalica;
	}
	public void setPinturaMetalica(boolean pinturaMetalica) {
		this.pinturaMetalica = pinturaMetalica;
	}
	public int getAirbag() {
		return airbag;
	}
	public void setAirbag(int airbag) throws AirbagInvalidoException {
		
		if(airbag < 1 && airbag > 10) {
			throw new AirbagInvalidoException("Quantidade de Airbag inválida.");
		}
		
		this.airbag = airbag;
	}

	
}