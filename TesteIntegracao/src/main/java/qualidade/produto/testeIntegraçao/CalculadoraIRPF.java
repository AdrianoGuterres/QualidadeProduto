package qualidade.produto.testeIntegraçao;

public class CalculadoraIRPF {
	
	private double valor = 0;
	
	private int meses = 0;

	public double calcJuros(double valorDevido, int nro_meses ) {	
		
		valor = valorDevido;		
		meses = nro_meses;

		if(meses ==0) {
			return 0;			
		}else {

			return((valor*meses )/ 100);		
		}
	}
}
