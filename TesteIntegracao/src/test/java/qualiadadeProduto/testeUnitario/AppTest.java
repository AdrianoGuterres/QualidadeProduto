package qualiadadeProduto.testeUnitario;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import qualidade.produto.testeIntegraçao.*;


@RunWith(JUnitParamsRunner.class)
public class AppTest  {
	
	private FuncoesAuxiliares funcoesAux;
	private CalculadoraIRPF calculadoraIRPF;
	private App app;
	
	@Before
	public void setUp() {
		 funcoesAux = new FuncoesAuxiliaresDumb();
		 calculadoraIRPF = new CalculadoraIRPFDumb();
		 app = new App(calculadoraIRPF, funcoesAux);
	}
	

	@Test
	@FileParameters("src/test/listasTestes/testesParametrizadosAceitos.csv")
	public void nunerosValidos(double valorBase, int diasAtraso, double resultado ) {			
		double resultadoDouble = Double.parseDouble(app.calculaValorEJuros(valorBase, diasAtraso));		
		assertEquals(resultado, resultadoDouble, 0.01 );
	}

}



