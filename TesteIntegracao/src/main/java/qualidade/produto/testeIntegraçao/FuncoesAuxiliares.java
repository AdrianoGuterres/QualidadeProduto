package qualidade.produto.testeIntegraçao;

import java.text.NumberFormat;

public class FuncoesAuxiliares {
	
	public String formatar(double valor) {
		
		String aux = NumberFormat.getCurrencyInstance().format(valor);	
				
		return 	aux;
		
	}

}
