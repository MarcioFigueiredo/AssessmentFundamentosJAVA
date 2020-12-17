package br.edu.infnet.appVeiculos.model.negocio;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import br.edu.infnet.appVeiculos.model.exception.AroInvalidoException;


@SpringBootTest
public class SuvTests {

	@Test
	void testaToString() throws AroInvalidoException {
		Suv suv = new Suv("Aro", 10, Boolean.TRUE);
		suv.setBagageiro(Boolean.FALSE);
		suv.setAro(100);
		assertTrue("aro;10.0;true;false;100.0".equals(suv.toString()));
	}
	
	@Test
	void testaCalculoValorSobremesa() throws AroInvalidoException {
		Suv suv = new Suv("Aro", 10, Boolean.TRUE);
		suv.setBagageiro(Boolean.FALSE);
		suv.setAro(100);
		assertEquals(suv.calcularValorVenda(), 21);
	}
	
	@Test
	void testaAdicionalCaldaInvalida() {
		try {
			Suv suv = new Suv("Aro", 10, Boolean.TRUE);
			suv.setBagageiro(Boolean.FALSE);
			suv.setAro(500);
		} catch (AroInvalidoException e) {
			assertEquals("Aro inválido.", e.getMessage());
		}
	}
}