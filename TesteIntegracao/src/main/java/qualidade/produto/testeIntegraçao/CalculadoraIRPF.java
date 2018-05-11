package qualidade.produto.testeIntegraçao;

public class CalculadoraIRPF {

	public double calcJuros(double valorDevido, int nro_meses ) {	

		if(nro_meses ==0) {
			return 0;			
		}else {

			return valorDevido + ((valorDevido*nro_meses )/ 100);		
		}
	}
}
