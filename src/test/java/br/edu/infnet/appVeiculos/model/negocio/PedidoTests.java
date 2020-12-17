package br.edu.infnet.appVeiculos.model.negocio;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PedidoTests {

	@Test
	void testaAssociacao() {
		Cliente cliente = new Cliente("marcio", "12345678901", "marcio@marcio.com");		
		Pedido p = new Pedido();
		p.setCliente(cliente);
		
		System.out.println("Pedido: " + p);

		assertTrue(cliente.equals(p.getCliente()));
	}
	
	@Test
	void testaFaturadoTrue() {
		Pedido p = new Pedido();
		
		assertTrue(p.isFaturado());
	}
	
	@Test
	void testaFaturadoFalse() {
		Pedido p = new Pedido();
		p.setFaturado(Boolean.FALSE);
		
		assertFalse(p.isFaturado());
	}
}