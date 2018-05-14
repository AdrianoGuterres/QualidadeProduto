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
public class AppTestFail {  
	
	private FuncoesAuxiliares funcoesAux;
	private CalculadoraIRPF calculadoraIRPF;
	private AppConstrutorSobregarregado app;
	
	@Before
	public void setUp() {
		 funcoesAux      = new FuncoesAuxiliares();
		 calculadoraIRPF = new CalculadoraIRPF();
		 app = new AppConstrutorSobregarregado(calculadoraIRPF, funcoesAux);
	}
	
	@Parameters(name= "{index} : Valor base= {0}, Dias de Atraso= {1}, Resultado= {2}")
	public static Collection<Object[]> data(){
		return Arrays.asList(new Object[][]{
			{-1,0},
			{1,-1},
			{1000000000,0},
			{1000000000,-1}
		});		
	}
	
	@Parameter(0)
	public double valorBase;
	@Parameter(1) 
	public int diasAtraso;
	

	@Test(expected = Exception.class)
	public void nunerosValidos() throws Exception {		
		String actual =app.calculaValorEJuros(valorBase, diasAtraso);	
		
	}
}



