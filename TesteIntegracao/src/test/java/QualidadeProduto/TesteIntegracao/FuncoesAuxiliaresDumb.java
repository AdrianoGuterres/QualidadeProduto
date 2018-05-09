package QualidadeProduto.TesteIntegracao;

import qualidade.produto.testeIntegraçao.FuncoesAuxiliares;

public class FuncoesAuxiliaresDumb extends FuncoesAuxiliares {

	public FuncoesAuxiliaresDumb() {
		super();
	}

	@Override
	public String formatar(double valor) {
		return valor+"";		
	}

}