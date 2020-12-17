package br.edu.infnet.appVeiculos.model.negocio;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import br.edu.infnet.appVeiculos.model.exception.AirbagInvalidoException;
import br.edu.infnet.appVeiculos.model.exception.MarcaInvalidaException;

@SpringBootTest
public class HatchTests {

	@Test
	void testaToString() throws AirbagInvalidoException, MarcaInvalidaException {
		Hatch b = new Hatch("suco", 5, Boolean.TRUE);
		b.setMarca("Nacional");		
		b.setCilindrada(1000);
		assertTrue("suco;5.0;true;200.0;Da Casa".equals(b.toString()));
	}
	
	@Test
	void testaCalculoValorBebida() throws AirbagInvalidoException, MarcaInvalidaException {
		Hatch b = new Hatch("suco", 5, Boolean.TRUE);
		b.setMarca("Nacional");
		b.setCilindrada(200);
		assertEquals(b.calcularValorVenda(), 11);
	}
	
	@Test
	void testaMedidaNegativa() throws MarcaInvalidaException {
		Hatch b = new Hatch("suco", 5, Boolean.TRUE);
		b.setMarca("Nacional");
		b.setCilindrada(-100);
	}
}
