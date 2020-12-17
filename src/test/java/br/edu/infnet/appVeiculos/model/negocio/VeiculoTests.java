package br.edu.infnet.appVeiculos.model.negocio;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class VeiculoTests {

	@Test
	void testaBebida() {
		Hatch hatch = new Hatch("suco", 5, Boolean.TRUE);
		
		assertNotNull(hatch);
	}
	
	@Test
	void testaComida() {
		Sedan sedan = new Sedan("pastel", 15, Boolean.FALSE);
		
		assertNotNull(sedan);
	}
	
	@Test
	void testaSobremesa() {
		Suv suv = new Suv("bolo", 10, Boolean.TRUE);
		
		assertNotNull(suv);
	}
}
