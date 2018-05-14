package qualidade.produto.calculadora.irpf;

import java.text.NumberFormat;

public class FuncoesAuxiliares {
	
	private String saida = null;
	
	public String formatar(double valor) {
		
		saida = NumberFormat.getCurrencyInstance().format(valor);	
				
		return 	saida;
		
	}

}
