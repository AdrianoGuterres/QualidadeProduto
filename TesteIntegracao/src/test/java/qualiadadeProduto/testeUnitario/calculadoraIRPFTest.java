package qualiadadeProduto.testeUnitario;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import qualidade.produto.testeIntegraçao.CalculadoraIRPF;


@RunWith(JUnitParamsRunner.class)
public class calculadoraIRPFTest {
	private CalculadoraIRPF calc; 
	
	@Before
	public void setUp() {
		calc = new CalculadoraIRPF();		
	}

	@Test
	@FileParameters("src/test/listasTestesUnitarios/baseTestesCalculadoraAcrescimo.csv")
	public void nunerosValidos(double valorDevido, int diasAtraso, int mesesAtraso, double expected ) {	
		double actual = calc.calcJuros(valorDevido, mesesAtraso);		
		
		System.out.println(valorDevido+"@@@"+ mesesAtraso+"@@@"+expected+"@@@"+actual);
		
		assertEquals(expected, actual,001);	
		
	}

}
