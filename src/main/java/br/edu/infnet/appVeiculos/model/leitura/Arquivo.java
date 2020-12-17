package br.edu.infnet.appVeiculos.model.leitura;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import br.edu.infnet.appVeiculos.model.exception.AroInvalidoException;
import br.edu.infnet.appVeiculos.model.negocio.Hatch;
import br.edu.infnet.appVeiculos.model.negocio.Sedan;
import br.edu.infnet.appVeiculos.model.negocio.Suv;
import br.edu.infnet.appVeiculos.model.exception.AirbagInvalidoException;
import br.edu.infnet.appVeiculos.model.exception.MarcaInvalidaException;

public class Arquivo {

	public static void main(String[] args) throws MarcaInvalidaException, AirbagInvalidoException {
		String dir = "C:/DEV/workspace/worspace Eclipse/appVeiculos";
		
		String arquivo = "pedidos.txt";
		
		try {
			FileReader leitura = new FileReader(dir+arquivo);			
			BufferedReader in = new BufferedReader(leitura);
			
			FileWriter escrita = new FileWriter(dir+"out_"+arquivo);
			BufferedWriter out = new BufferedWriter(escrita);
			
			String linha = in.readLine();
			
			while(linha != null) {
				String[] campos = linha.split(";");
				
				if(campos.length != 5) {
					switch (campos[0].toUpperCase()) {
					case "B":
						Hatch hatch = new Hatch(campos[1], Float.valueOf(campos[2]), Boolean.valueOf(campos[3]));
						hatch.setCilindrada(Float.valueOf(campos[4]));
						hatch.setMarca(campos[5]);
						
						out.write(hatch.obterValorProduto());
						break;

					case "C":
						Sedan sedan = new Sedan(campos[1], Float.valueOf(campos[2]), Boolean.valueOf(campos[3]));
						sedan.setPinturaMetalica(Boolean.valueOf(campos[4]));
						sedan.setAirbag(Integer.valueOf(campos[5]));

						out.write(sedan.obterValorProduto());
						break;

					case "S":
						Suv suv = new Suv(campos[1], Float.valueOf(campos[2]), Boolean.valueOf(campos[3]));
						suv.setBagageiro(Boolean.valueOf(campos[4]));
						suv.setAro(Float.valueOf(campos[5]));

						out.write(suv.obterValorProduto());
						break;
						
					default:
						break;
					}
				}
				
				linha = in.readLine();
			}

			in.close();
			leitura.close();
			out.close();
			escrita.close();
			System.out.println(args.length == 1 ? args[0] : "Pronto!!!");
			
		} catch (IOException | AirbagInvalidoException | MarcaInvalidaException | AroInvalidoException e) {
			System.out.println(((Throwable) e).getMessage());
		}		
	}
}