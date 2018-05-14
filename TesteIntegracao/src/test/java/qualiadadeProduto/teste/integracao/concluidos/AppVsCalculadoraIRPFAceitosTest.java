package qualiadadeProduto.teste.integracao.concluidos;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.*;

import qualiadadeProduto.testeUnitario.assessorios.*;
import qualidade.produto.testeIntegraçao.*;



@RunWith(Parameterized.class)
public class AppVsCalculadoraIRPFAceitosTest  {
	
	private FuncoesAuxiliares funcoesAux;
	private CalculadoraIRPF calculadoraIRPF;
	private AppConstrutorSobregarregado app;
	
	@Before
	public void setUp() {
		 funcoesAux = new FuncoesAuxiliaresDumb();
		 calculadoraIRPF = new CalculadoraIRPF();
		 app = new AppConstrutorSobregarregado(calculadoraIRPF, funcoesAux);
	}
	
	@Parameters(name= "{index} : Valor base= {0}, Dias de Atraso= {1}, Resultado sem formatação= {2}")
	public static Collection<Object[]> data(){
		return Arrays.asList(new Object[][]{
            {0,0,0.00},                 {1,0,0.00},               {1868.22,59,0.00},         {1868.23,0,14011725.00},         {1868.23,0,14011725.00},
            {2334.05,0,17505375.00},    {2799.86,0,2099895.00},	  {2799.87,0,4199805.00},    {2799.88,0,419982.00},           {3266.53,0,4899795.00},
            {3733.19,0,5599785.00},     {3733.2,0,839.97},        {3733.21,0,83997225.00},   {4198.94,0,9447615.00},          {4664.68,0,1049553.00},
            {4664.69,0,128278975.00},   {4664.7,0,12827925.00},	  {5000,0,1375.00},          {9999999.99,0,274999999725.00},
			
			{0,30,0.00},                {1,30,0.00},    		  {1868.22,30,0.00},		 {1868.23,30,1415184225.00},      {1868.23,30,1415184225.00},
			{2334.05,30,1768042875.00}, {2799.86,30,212089395.00},{2799.87,30,424180305.00}, {2799.88,30,42418182.00},        {3266.53,30,494879295.00},
			{3733.19,30,565578285.00},  {3733.2,30,8483697.00},   {3733.21,30,8483719725.00},{4198.94,30,954209115.00},       {4664.68,30,106004853.00},
			{4664.69,30,12956176475.00},{4664.7,30,1295620425.00},{5000,30,1388.75},         {9999999.99,30,27774999972225.00},
			
			{0,60,0.00},                {1,60,0.00},              {1868.22,60,0.00},         {1868.23,60,142919595.00},       {1868.23,60,142919595.00},
			{2334.05,60,178554825.00},	{2799.86,60,21418929.00}, {2799.87,60,42838011.00},  {2799.88,60,42838164.00},        {3266.53,60,49977909.00},
			{3733.19,60,57117807.00},   {3733.2,60,8567694.00},   {3733.21,60,856771695.00}, {4198.94,60,96365673.00},        {4664.68,60,107054406.00},
			{4664.69,60,1308445545.00},	{4664.7,60,130844835.00}, {5000,60,1402.50},         {9999999.99,60,2804999997195.00},
			
			{0,29,0.00},                {1,29,0.00},              {1868.22,29,0.00},         {1868.23,29,14011725.00},        {1868.23,29,14011725.00},
			{2334.05,29,17505375.00},   {2799.86,29,2099895.00},  {2799.87,29,4199805.00},   {799.88,29,419982.00},           {3266.53,29,4899795.00},
			{3733.19,29,5599785.00},    {3733.2,29,839.97},       {3733.21,29,83997225.00},  {4198.94,29,9447615.00},         {4664.68,29,1049553.00},
			{4664.69,29,128278975.00},  {4664.7,29,12827925.00},  {5000,29,1375.00},         {9999999.99,29,274999999725.00},
			
			{0,59,0.00},                {1,59,0.00},              {1868.22,59,0.00},         {1868.23,59,1415184225.00},      {1868.23,59,1415184225.00},
			{2334.05,59,1768042875.00}, {2799.86,59,212089395.00},{2799.87,59,424180305.00}, {2799.88,59,42418182.00},        {3266.53,59,494879295.00},
			{3733.19,59,565578285.00},  {3733.2,59,8483697.00},   {3733.21,59,8483719725.00},{4198.94,59,954209115.00},       {4664.68,59,106004853.00},
			{4664.69,59,12956176475.00},{4664.7,59,1295620425.00},{5000,59,1388.75},         {9999999.99,59,27774999972225.00},
			
		});		
	}
	
	@Parameter(0)
	public double valorBase;
	@Parameter(1) 
	public int diasAtraso;
	@Parameter(2)
	public double resultado;	

	@Test
	public void nunerosValidos() throws Exception {			
		double resultadoDouble = Double.parseDouble(app.calculaValorEJuros(valorBase, diasAtraso));		
		assertEquals(resultadoDouble, resultadoDouble, 0.01 );
	}
}



