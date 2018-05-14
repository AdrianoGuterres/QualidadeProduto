package qualiadade.produto.tests.suite;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import qualiadade.produto.tests.integration.AppTestChecked;
import qualiadade.produto.tests.integration.AppVsCalculadoraIRPFTestChecked;
import qualiadade.produto.tests.integration.AppVsCalculadoraIRPFTestFails;
import qualiadade.produto.tests.integration.AppVsFuncoesAuxiliaresChecked;

@RunWith(Suite.class)
@SuiteClasses({
	AppVsCalculadoraIRPFTestChecked.class,
	AppVsCalculadoraIRPFTestFails.class,
	AppVsFuncoesAuxiliaresChecked.class,
	AppTestChecked.class
})
public class AllTests {
	@Before
	public void init() {
		System.out.println("Finalizando...");		
	}
	
	@Test
	public void main() {
		
	}
	
	@After
	public void exit() {
		System.out.println("Finalizando...");
	}

}
