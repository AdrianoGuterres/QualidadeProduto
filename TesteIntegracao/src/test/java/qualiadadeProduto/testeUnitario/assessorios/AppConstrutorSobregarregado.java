package qualiadadeProduto.testeUnitario.assessorios;

import qualidade.produto.testeIntegraçao.CalculadoraIRPF;
import qualidade.produto.testeIntegraçao.FuncoesAuxiliares;

public class AppConstrutorSobregarregado extends qualidade.produto.testeIntegraçao.App {

	public AppConstrutorSobregarregado(CalculadoraIRPF calculadora, FuncoesAuxiliares funcoes) {			
		super();
		setCalculadora(calculadora);
		setFuncoes(funcoes);
	}

}
