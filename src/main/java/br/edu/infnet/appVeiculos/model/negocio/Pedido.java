package br.edu.infnet.appVeiculos.model.negocio;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Pedido {

	private LocalDateTime data;
	private boolean faturado;
	private Cliente cliente;
	
	public Pedido() {
		this.data = LocalDateTime.now();
		this.faturado = Boolean.TRUE;
	}
	
	@Override
	public String toString() {
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		return String.format("%s;%s;%s", 
					this.getData().format(formatter),
					this.faturado,
					this.cliente.toString()
				);
	}
	
	public LocalDateTime getData() {
		return data;
	}
	public boolean isFaturado() {
		return faturado;
	}
	public void setFaturado(boolean faturado) {
		this.faturado = faturado;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
}