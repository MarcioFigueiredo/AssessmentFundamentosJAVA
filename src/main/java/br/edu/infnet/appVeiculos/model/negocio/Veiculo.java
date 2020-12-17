package br.edu.infnet.appVeiculos.model.negocio;

public abstract class Veiculo {

	private String descricao;
	private float valor;
	private boolean producaoNacional; 

	public Veiculo(String descricao, float valor, boolean producaoNacional) {
		this.descricao = descricao;
		this.valor = valor;
		this.producaoNacional = producaoNacional;
	}
	
	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(this.getDescricao());
		sb.append(";");
		sb.append(this.getValor());
		sb.append(";");
		sb.append(this.isProducaoNacional());
		
		return sb.toString();
	}
	

	private Object isProducaoNacional() {
		
	return null;
	}

	public abstract float calcularValorVenda();
	
	public String obterValorProduto() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.getDescricao());
		sb.append(";");
		sb.append(this.calcularValorVenda());
		sb.append("\r");

		return sb.toString();
	}

	public String getDescricao() {
		return descricao;
	}
	public float getValor() {
		return valor;
	}
	public boolean isProducaoPropria() {
		return producaoNacional;
	}
}