package QualidadeProduto.TesteIntegracao;

import static org.junit.Assert.*;

import org.junit.Test;

import qualidade.produto.testeIntegraçao.*;

public class AppTest extends App {
	
	private FuncoesAuxiliares FA = new FuncoesAuxiliares();

	@Test
	public void test() {
		
		System.out.println(FA.formatar(1200.555));
		
		assertEquals("20,50", "20,50");
	}

}



