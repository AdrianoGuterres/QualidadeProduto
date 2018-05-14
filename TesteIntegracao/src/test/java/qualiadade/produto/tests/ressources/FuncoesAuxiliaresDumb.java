package qualiadade.produto.tests.ressources;

import qualidade.produto.calculadora.irpf.FuncoesAuxiliares;

public class FuncoesAuxiliaresDumb extends FuncoesAuxiliares {

	@Override
	public String formatar(double valor) {
		return valor+"";		
	}

}