package qualidade.produto.testeIntegraçao;

import java.text.DecimalFormat;

public class FuncoesAuxiliares {
	
	public String formatar(double valor) {
		System.out.println(valor);
		DecimalFormat df = new DecimalFormat("###,###,###.##");
		String resultado = "R$ "+df.format(valor);		
		
		System.out.println(resultado + " format");
		return resultado;		
	}

}
