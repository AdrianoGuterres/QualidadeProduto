package qualidade.produto.testeIntegraçao;

public class App {

	private CalculadoraIRPF calculadora;
	private FuncoesAuxiliares funcoes;

	public static void main( String[] args ) {		

	}

	public CalculadoraIRPF getCalculadora() {
		return calculadora;
	}

	public void setCalculadora(CalculadoraIRPF calculadora) {
		this.calculadora = calculadora;
	}

	public FuncoesAuxiliares getFuncoes() {
		return funcoes;
	}

	public void setFuncoes(FuncoesAuxiliares funcoes) {
		this.funcoes = funcoes;
	}

	public String calculaValorEJuros(double baseCalculo, int diasAtraso) throws Exception {	
		
		
		if(baseCalculo < 0 || diasAtraso <0 || baseCalculo > 999999999.99) {
			throw new Exception();			
		}
		
			
		int meses = 0;

		if(diasAtraso/30 > 0) {
			meses = (int)diasAtraso/30;			
		}
		
		double aPagar = 0;
		double acressimo = 0;		

		if(baseCalculo >= 0 && baseCalculo <= 1868.22) {	
		}else if(baseCalculo > 1868.22 && baseCalculo <= 2799.86) {
			aPagar = baseCalculo*0.075 ;					
		}else if(baseCalculo > 2799.86 && baseCalculo <= 3733.19) {
			aPagar =baseCalculo*0.15;
		}else if(baseCalculo > 3733.19 && baseCalculo <= 4664.68) {
			aPagar = baseCalculo*0.225;		
		}else{
			aPagar = baseCalculo*0.275;		
		}			
				
		if (meses >=1) {
			acressimo = calculadora.calcJuros(aPagar, meses);
		} 
				
		return funcoes.formatar(acressimo+aPagar);
	}
}
