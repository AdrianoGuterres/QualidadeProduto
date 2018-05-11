package QualidadeProduto.TesteIntegracao;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import qualidade.produto.testeIntegraçao.*;


@RunWith(JUnitParamsRunner.class)
public class AppTest  {
	
	private FuncoesAuxiliares FA;
	private CalculadoraIRPF CA;
	private App app;
	
	@Before
	public void setUp() {
		 FA = new FuncoesAuxiliaresDumb();
		 CA = new CalculadoraIRPFDumb();
		 app = new App(CA, FA);
	}
	

	@Test
	@FileParameters("src/test/listasTestes/testesParametrizadosAceitos.csv")
	public void nunerosValidos(double valorBase, int diasAtraso, double resultado ) {		
		
		System.out.println(resultado +" @@@ "+ app.calculaValorEJuros(valorBase, diasAtraso ));
		
		
		assertEquals(resultado, app.calculaValorEJuros(valorBase, diasAtraso ));
	}

}



