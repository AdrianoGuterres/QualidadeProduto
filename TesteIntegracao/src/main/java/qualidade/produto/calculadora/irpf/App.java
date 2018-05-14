package qualidade.produto.calculadora.irpf;

public class App {

	private CalculadoraIRPF calculadora;
	private FuncoesAuxiliares funcoes;
	
	private double base = 0;
	private int dias = 0;

	
	public String calculaValorEJuros(double baseCalculo, int diasAtraso) throws Exception {	
		base = baseCalculo;
		dias = diasAtraso;
		
		
		if(base < 0 || dias <0 || base > 999999999.99) {
			throw new Exception();			
		}
		
			
		int meses = 0;

		if(dias/30 > 0) {
			meses = (int)dias/30;			
		}
		
		double aPagar = 0;
		double acressimo = 0;		

		if(base >= 0 && base <= 1868.22) {	
		}else if(base > 1868.22 && base <= 2799.86) {
			aPagar = (base*7.5)/100 ;					
		}else if(base > 2799.86 && base<= 3733.19) {
			aPagar =base*0.15;
		}else if(base > 3733.19 && base <= 4664.68) {
			aPagar = base*0.225;		
		}else{
			
			aPagar = base*0.275;		
		}			
				
		if (meses >0) {
			acressimo = calculadora.calcJuros(aPagar, meses);			
		} 
		
				
		return funcoes.formatar(acressimo+aPagar);
	}
	
	
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

}
