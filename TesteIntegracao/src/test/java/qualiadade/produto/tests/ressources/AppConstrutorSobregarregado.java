package qualiadade.produto.tests.ressources;

import qualidade.produto.calculadora.irpf.CalculadoraIRPF;
import qualidade.produto.calculadora.irpf.FuncoesAuxiliares;

public class AppConstrutorSobregarregado extends qualidade.produto.calculadora.irpf.App {

	public AppConstrutorSobregarregado(CalculadoraIRPF calculadora, FuncoesAuxiliares funcoes) {			
		super();
		setCalculadora(calculadora);
		setFuncoes(funcoes);
	}

}
