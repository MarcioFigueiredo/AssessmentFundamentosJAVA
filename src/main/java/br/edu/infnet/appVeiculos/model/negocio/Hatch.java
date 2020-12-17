package br.edu.infnet.appVeiculos.model.negocio;

import br.edu.infnet.appVeiculos.model.exception.MarcaInvalidaException;
import br.edu.infnet.appVeiculos.model.negocio.Veiculo;

public class Hatch extends Veiculo {

	private float cilindrada;
	private String marca;
	
	public Hatch(String descricao, float valor, boolean producaoNacional) {
		super(descricao, valor, producaoNacional);
	}
	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append(";");
		sb.append(this.getCilindrada());
		sb.append(";");
		sb.append(this.getMarca());
		
		return sb.toString();
	}

	@Override
	public float calcularValorVenda() {

		return this.getValor() + (this.getCilindrada() * 0.1f);
	}

	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}

	public float getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(float cilindrada) throws MarcaInvalidaException{
		
		if(cilindrada <= 0) {
			throw new MarcaInvalidaException("Cilindrada inválida.");
		}

		this.cilindrada = cilindrada;
	}

	

	
}
