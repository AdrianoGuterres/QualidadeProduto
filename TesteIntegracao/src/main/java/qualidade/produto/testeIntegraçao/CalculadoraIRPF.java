package qualidade.produto.testeIntegraçao;

public class CalculadoraIRPF {
	
	public double calcJuros(double valorDevido, int nro_meses ) {		
		return valorDevido + (valorDevido*((nro_meses * 1)/ 100));		
	}
}
