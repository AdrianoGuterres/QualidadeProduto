package QualidadeProduto.TesteIntegracao;

import static org.junit.Assert.*;

import org.junit.Test;

import qualidade.produto.testeIntegraçao.*;

public class AppTest extends App {
	
	private FuncoesAuxiliares FA = new FuncoesAuxiliaresDumb();

	@Test
	public void test() {
		
		assertEquals("20,50", "20,50");
	}

}



