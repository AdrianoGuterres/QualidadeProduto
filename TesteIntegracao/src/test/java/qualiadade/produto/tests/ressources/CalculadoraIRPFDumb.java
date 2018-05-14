package qualiadade.produto.tests.ressources;

import qualidade.produto.calculadora.irpf.CalculadoraIRPF;

public class CalculadoraIRPFDumb extends CalculadoraIRPF {

	@Override
	public double calcJuros(double valorDevido, int nro_meses) {
		return valorDevido;		
	}

}