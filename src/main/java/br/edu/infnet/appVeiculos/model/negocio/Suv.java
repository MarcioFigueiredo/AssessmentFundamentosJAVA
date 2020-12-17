package br.edu.infnet.appVeiculos.model.negocio;

import br.edu.infnet.appVeiculos.model.exception.AroInvalidoException;

public class Suv extends Veiculo {

	private boolean bagageiro;
	private float aro;

	public Suv(String descricao, float valor, boolean producaoPropria) {
		super(descricao, valor, producaoPropria);
	}

	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append(";");
		sb.append(this.isBagageiro());
		sb.append(";");
		sb.append(this.getAro());
		
		return sb.toString();
	}
	
	@Override
	public float calcularValorVenda() {
		
		float valorBagageiro = this.getValor() / 2;		
		float valorAro = this.getAro() * 0.03f; 

		return this.getValor() + valorBagageiro + valorAro;
	}

	public boolean isBagageiro() {
		return bagageiro;
	}
	public void setBagageiro(boolean bagageiro) {
		this.bagageiro = bagageiro;
	}
	public float getAro() {
		return aro;
	}
	public void setAro(float aro) throws AroInvalidoException {
		
		if(aro < 1 && aro > 300) {
			throw new AroInvalidoException("Tamanho de Aro inválida.");
		}
		
		this.aro = aro;
	}

	

}
