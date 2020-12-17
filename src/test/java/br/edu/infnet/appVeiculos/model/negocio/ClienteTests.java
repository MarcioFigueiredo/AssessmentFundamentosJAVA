package br.edu.infnet.appVeiculos.model.negocio;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ClienteTests {

	@Test
	void testaInstancia() {

		Cliente s = new Cliente("marcio", "12345678901", "marcio@marcio.com");
		
		assertNotNull(s);
	}
	
	@Test
	void testaToString() {
		
		Cliente s = new Cliente("marcio", "12345678901", "marcio@marcio.com");
		
		assertTrue("marcio;12345678901;marcio@marcio.com".equals(s.toString()));
	}
}