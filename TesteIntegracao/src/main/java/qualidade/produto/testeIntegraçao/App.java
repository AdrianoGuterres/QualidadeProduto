package qualidade.produto.testeIntegraçao;

public class App {

	private CalculadoraIRPF calculadora;
	private FuncoesAuxiliares funcoes;


	public App(CalculadoraIRPF calculadora, FuncoesAuxiliares funcoes) {
		this.calculadora = calculadora;
		this.funcoes = funcoes;
	}

	public static void main( String[] args ) {
		App ca = new App(new CalculadoraIRPF(), new FuncoesAuxiliares());
		
		System.out.println(ca.calculaValorEJuros(4666,60));

	}

	public String calculaValorEJuros(double baseCalculo, int diasAtraso) {		
		int meses = 0;
		double aPagar = 0;

		if(diasAtraso/30 > 0) {
			meses = (int)diasAtraso/30;			
		}
		

		if(baseCalculo >= 0 && baseCalculo <= 1868.22) {	
			System.out.println(1000);
		}else if(baseCalculo > 1868.22 && baseCalculo <= 2799.86) {
			aPagar = baseCalculo*0.075;					
		}else if(baseCalculo > 2799.86 && baseCalculo <= 3733.19) {
			aPagar = baseCalculo*0.15;
		}else if(baseCalculo > 3733.19 && baseCalculo <= 4664.68) {
			aPagar = baseCalculo*0.225;		
		}else{
			aPagar = baseCalculo*0.275;		
		}	
		
		System.out.println(aPagar);
		
		if (meses >=1) {
			aPagar = calculadora.calcJuros(aPagar, meses);
		} 
		
		
		
		return funcoes.formatar(aPagar);
	}
}
