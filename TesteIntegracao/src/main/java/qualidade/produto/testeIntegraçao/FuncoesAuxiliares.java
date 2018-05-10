package qualidade.produto.testeIntegraçao;

public class FuncoesAuxiliares {
	
	public String formatar(double valor) {
		
		//1.000,00
		
		String valorEmStringComVirgula =  (valor+"").replace(".", ",");
		
		String[] array = valorEmStringComVirgula.split(",");
		
		String inteiro = array[0];
		String decimais = array[1];
		
		int controle = inteiro.length();
		
		while((controle - 3) >0) {
						
		}
		
		if(decimais.length()>2) {
			decimais = decimais.substring(0,2);					
		}else if(decimais.length()<2) {
			decimais = decimais +"0";		
		}
		
		return null;		
	}

}
