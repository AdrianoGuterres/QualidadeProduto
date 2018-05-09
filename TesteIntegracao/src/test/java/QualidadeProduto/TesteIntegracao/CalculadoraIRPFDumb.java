package QualidadeProduto.TesteIntegracao;

import qualidade.produto.testeIntegraçao.CalculadoraIRPF;

public class CalculadoraIRPFDumb extends CalculadoraIRPF {

	public CalculadoraIRPFDumb() {
		super();
	}

	@Override
	public double calcValorIRPF(double valorBase, int diasAtraso) {
		return 0;		
	}

	@Override
	public double calcJuros(double valorDevido, int nro_meses) {
		return 0;		
	}

}