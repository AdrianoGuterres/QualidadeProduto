package qualiadadeProduto.testeUnitario.assessorios;

import qualidade.produto.testeIntegraçao.CalculadoraIRPF;

public class CalculadoraIRPFDumb extends CalculadoraIRPF {

	@Override
	public double calcJuros(double valorDevido, int nro_meses) {
		return valorDevido;		
	}

}