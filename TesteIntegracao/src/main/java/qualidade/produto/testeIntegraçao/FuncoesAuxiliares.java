package qualidade.produto.testeIntegraçao;

import java.text.DecimalFormat;

public class FuncoesAuxiliares {
	
	public String formatar(double valor) {
		DecimalFormat df = new DecimalFormat("000,000,000,000,000.00");
		String resultado = "RS "+df.format(valor);		
		
		return resultado;		
	}

}
