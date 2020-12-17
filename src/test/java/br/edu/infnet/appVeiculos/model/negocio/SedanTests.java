package br.edu.infnet.appVeiculos.model.negocio;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import br.edu.infnet.appVeiculos.model.exception.AirbagInvalidoException;
import br.edu.infnet.appVeiculos.model.exception.MarcaInvalidaException;

@SpringBootTest
public class SedanTests {

	@Test
	void testaToString() throws MarcaInvalidaException, AirbagInvalidoException {
		Sedan sedan = new Sedan("Airbag", 15, Boolean.FALSE);
		sedan.setPinturaMetalica(Boolean.TRUE);
		sedan.setAirbag(3);
		assertTrue("Airbag;15.0;false;true;3".equals(sedan.toString()));
	}
	
	@Test
	void testaCalculoValorComida() throws MarcaInvalidaException, AirbagInvalidoException {
		Sedan sedan = new Sedan("Airbag", 15, Boolean.FALSE);
		sedan.setPinturaMetalica(Boolean.TRUE);
		sedan.setAirbag(3);
		assertEquals(sedan.calcularValorVenda(), 63);
	}
	
	@Test
	void testaPorcaoInvalida() throws AirbagInvalidoException {
		try {
			Sedan sedan = new Sedan("Airbag", 15, Boolean.FALSE);
			sedan.setPinturaMetalica(Boolean.TRUE);
			sedan.setAirbag(30);
		} catch (AirbagInvalidoException e) {
			assertEquals("Quantidade de Airbag inválida.", e.getMessage());
		}		
	}	
}