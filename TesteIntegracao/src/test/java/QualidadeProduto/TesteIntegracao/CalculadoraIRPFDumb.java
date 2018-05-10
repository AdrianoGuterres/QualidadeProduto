package QualidadeProduto.TesteIntegracao;

import qualidade.produto.testeIntegraçao.CalculadoraIRPF;

public class CalculadoraIRPFDumb extends CalculadoraIRPF {

	@Override
	public double calcJuros(double valorDevido, int nro_meses) {
		return 0;		
	}

}