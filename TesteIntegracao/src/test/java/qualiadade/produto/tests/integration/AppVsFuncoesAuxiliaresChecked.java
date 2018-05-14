package qualiadade.produto.tests.integration;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.*;

import qualiadade.produto.tests.ressources.*;
import qualidade.produto.calculadora.irpf.*;

@RunWith(Parameterized.class)
public class AppVsFuncoesAuxiliaresChecked {  
	
	private FuncoesAuxiliares funcoesAux;
	private CalculadoraIRPF calculadoraIRPF;
	private AppConstrutorSobregarregado app;
	
	@Before
	public void setUp() {
		 funcoesAux      = new FuncoesAuxiliares();
		 calculadoraIRPF = new CalculadoraIRPFDumb();
		 app = new AppConstrutorSobregarregado(calculadoraIRPF, funcoesAux);
	}
	
	@Parameters(name= "{index} : Valor base= {0}, Dias de Atraso= {1}, Resultado= {2}")
	public static Collection<Object[]> data(){
		return Arrays.asList(new Object[][]{
			{0,0,"R$ 0,00"},   			  
			
			{1868.23,0,"R$ 140,12"},  
			
			{2799.87,0,"R$ 419,98"},
			
			{3733.2,0,"R$ 839,97"},
			
			{4664.69,0,"R$ 1.282,79"},
			
			{999999999.99,0,"R$ 275.000.000,00"}
			
		});		
	}
	
	@Parameter(0)
	public double valorBase;
	@Parameter(1) 
	public int diasAtraso;
	@Parameter(2)
	public String expected;
	

	@Test
	public void nunerosValidos() throws Exception {		
		String actual =app.calculaValorEJuros(valorBase, diasAtraso);	
		assertEquals(expected,actual);
	}
}



