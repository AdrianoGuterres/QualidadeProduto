package qualiadadeProduto.teste.integracao.concluidos;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.*;

import qualiadadeProduto.testeUnitario.assessorios.*;
import qualidade.produto.testeIntegraçao.*;

@RunWith(Parameterized.class)
public class AppVsCalculadoraIRPFFailsTest  {
	
	private FuncoesAuxiliares funcoesAux;
	private CalculadoraIRPF calculadoraIRPF;
	private AppConstrutorSobregarregado app;
	
	@Before
	public void setUp() {
		 funcoesAux = new FuncoesAuxiliaresDumb();
		 calculadoraIRPF = new CalculadoraIRPF();
		 app = new AppConstrutorSobregarregado(calculadoraIRPF, funcoesAux);
	}
	
	@Parameters(name= "{index} : Valor base= {0}, Dias de Atraso= {1}, Resultado sem formatação= {2}")
	public static Collection<Object[]> data(){
		return Arrays.asList(new Object[][]{
            {-1,0,0.00},       
            {0,-1,0.00}, 
            
            {999999999,0,0.00},       
            {999999999,60,0.00},   
		});		
	}
	
	@Parameter(0)
	public double valorBase;
	@Parameter(1) 
	public int diasAtraso;
	@Parameter(2)
	public double resultado;
	

	@Test(expected = Exception.class)
	public void nunerosValidos()  throws Exception{			
		double resultadoDouble = Double.parseDouble(app.calculaValorEJuros(valorBase, diasAtraso));		
		assertEquals(resultadoDouble, resultadoDouble, 0.01 );
	}
}



