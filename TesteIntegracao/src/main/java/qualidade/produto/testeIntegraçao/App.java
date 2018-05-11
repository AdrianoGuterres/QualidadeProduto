package qualidade.produto.testeIntegraçao;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

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
		
		BigDecimal baseBig = new BigDecimal(baseCalculo+"");
		
		int meses = 0;
		BigDecimal aPagar = new BigDecimal("0");

		if(diasAtraso/30 > 0) {
			meses = (int)diasAtraso/30;			
		}
		

		if(baseCalculo >= 0 && baseCalculo <= 1868.22) {	
		}else if(baseCalculo > 1868.22 && baseCalculo <= 2799.86) {
			aPagar = baseBig.multiply( new BigDecimal("0.075")) ;					
		}else if(baseCalculo > 2799.86 && baseCalculo <= 3733.19) {
			aPagar = baseBig.multiply( new BigDecimal("0.15"));
		}else if(baseCalculo > 3733.19 && baseCalculo <= 4664.68) {
			aPagar = baseBig.multiply( new BigDecimal("0.225"));		
		}else{
			aPagar = baseBig.multiply( new BigDecimal("0.275",2,RoundingMode.UP)));		
		}	
		
		
		
				
		if (meses >=1) {
			aPagar = calculadora.calcJuros(aPagar, meses);
		} 
		
		
		
		DecimalFormat df = new DecimalFormat("#########.##");
		
		System.out.println(df.format(aPagar));
		double resultado = Double.parseDouble(df.format(aPagar));		
		
		
		return funcoes.formatar(resultado);
	}
}
