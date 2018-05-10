package QualidadeProduto.TesteIntegracao;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Test;

import qualidade.produto.testeIntegraçao.*;

public class AppTest  {
	
	private FuncoesAuxiliares FA;
	private CalculadoraIRPF CA;
	private App app;
	
	@After
	public void setUp() {
		 FA = new FuncoesAuxiliaresDumb();
		 CA = new CalculadoraIRPFDumb();
		 app = new App(CA, FA);
	}
	


	

	@Test
	public void test() {
		
		
		System.out.println(app.calculaValorEJuros(1200, 0));
		
		
		assertEquals("20,50", app.calculaValorEJuros(1200, 0));
	}

}



