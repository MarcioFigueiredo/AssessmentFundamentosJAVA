package br.edu.infnet.appVeiculos.model.leitura;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import br.edu.infnet.appVeiculos.model.exception.AirbagInvalidoException;
import br.edu.infnet.appVeiculos.model.exception.MarcaInvalidaException;

@SpringBootTest
public class ArquivoTests {

	@Test
	void testaArquivoLeituraEscrita() throws MarcaInvalidaException, AirbagInvalidoException {
		Arquivo.main(new String[] {"Migração realizada com sucesso!"});
	}
}
