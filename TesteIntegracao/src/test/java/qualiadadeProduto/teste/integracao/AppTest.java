package qualiadadeProduto.teste.integracao;

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
public class AppTest {  
	
	private FuncoesAuxiliares funcoesAux;
	private CalculadoraIRPF calculadoraIRPF;
	private AppConstrutorSobregarregado app;
	
	@Before
	public void setUp() {
		 funcoesAux      = new FuncoesAuxiliares();
		 calculadoraIRPF = new CalculadoraIRPF();
		 app = new AppConstrutorSobregarregado(calculadoraIRPF, funcoesAux);
	}
	
	@Parameters(name= "{index} : Valor base= {0}, Dias de Atraso= {1}, Resultado= {2}")
	public static Collection<Object[]> data(){
		return Arrays.asList(new Object[][]{
			{0,0,"R$ 0,00"},            {1,0,"R$ 0,00"},          {1868.22,59,"R$ 0,00"},    {1868.23,0,"R$ 140,12"},         {1868.24,0,"R$ 140,12"},
            {2334.05,0,"R$ 175,05"},    {2799.86,0,"R$ 209,99"},  {2799.87,0,"R$ 419,98"},   {2799.88,0,"R$ 419,98"},         {3266.53,0,"R$ 489,98"},
            {3733.19,0,"R$ 559,98"},    {3733.2,0,"R$ 839,97"},   {3733.21,0,"R$ 839,97"},   {4198.94,0,"R$ 944,76"},         {4664.68,0,"R$ 1.049,55"},
            {4664.69,0,"R$ 1.282,79"},  {4664.7,0,"R$ 1.282,79"}, {5000,0,"R$ 1.375,00"},    {9999999.99,0,"R$ 2.750.000,00"},
			
            {0,30,"R$ 0,00"},          {1,30,"R$ 0,00"},    	  {1868.22,30,"R$ 0,00"},	 {1868.23,30,"R$ 141,52"},        {1868.24,30,"R$ 141,52"},
			{2334.05,30,"R$ 176,80"},  {2799.86,30,"R$ 212,09"},  {2799.87,30,"R$ 424,18"},  {2799.88,30,"R$ 424,18"},        {3266.53,30,"R$ 494,88"},
			{3733.19,30,"R$ 565,58"},  {3733.2,30,"R$ 848,37"},   {3733.21,30,"R$ 848,37"},  {4198.94,30,"R$ 954,21"},        {4664.68,30,"R$ 1.060,05"},
			{4664.69,30,"R$ 1.295,62"},{4664.7,30,"R$ 1.295,62"}, {5000,30,"R$ 1.388,75"},   {9999999.99,30,"R$ 2.777.500,00"},			
			
			
			{0,60,"R$ 0,00"},           {1,60,"R$ 0,00"},          {1868.22,60,"R$ 0,00"},   {1868.23,60,"R$ 142,92"},          {1868.24,60,"R$ 142,92"},
			{2334.05,60,"R$ 178,55"},	{2799.86,60,"R$ 214,19"},  {2799.87,60,"R$ 428,38"}, {2799.88,60,"R$ 428,38"},          {3266.53,60,"R$ 499,78"},
			{3733.19,60,"R$ 571,18"},   {3733.2,60,"R$ 856,77"},   {3733.21,60,"R$ 856,77"}, {4198.94,60,"R$ 963,66"},          {4664.68,60,"R$ 1.070,54"},
			{4664.69,60,"R$ 1.308,45"},	{4664.7,60,"R$ 1.308,45"}, {5000,60,"R$ 1.402,50"},  {9999999.99,60,"R$ 2.805.000,00"},
			
			
			{0,29,"R$ 0,00"},           {1,29,"R$ 0,00"},           {1868.22,29,"R$ 0,00"},   {1868.23,29,"R$ 140,12"},           {1868.24,29,"R$ 140,12"},
			{2334.05,29,"R$ 175,05"},   {2799.86,29,"R$ 209,99"},   {2799.87,29,"R$ 419,98"}, {2799.88,29,"R$ 419,98"},           {3266.53,29,"R$ 489,98"},
			{3733.19,29,"R$ 559,98"},   {3733.2,29,"R$ 839,97"},    {3733.21,29,"R$ 839,97"}, {4198.94,29,"R$ 944,76"},           {4664.68,29,"R$ 1.049,55"},
			{4664.69,29,"R$ 1.282,79"}, {4664.7,29,"R$ 1.282,79"},  {5000,29,"R$ 1.375,00"},   {9999999.99,29,"R$ 2.750.000,00"},
			
			{0,59,"R$ 0,00"},          {1,59,"R$ 0,00"},            {1868.22,59,"R$ 0,00"},     {1868.23,59,"R$ 141,52"},       {1868.24,59,"R$ 141,52"},
			{2334.05,59,"R$ 176,80"} , {2799.86,59,"R$ 212,09"},    {2799.87,59,"R$ 424,18"},  {2799.88,59,"R$ 424,18"},       {3266.53,59,"R$ 494,88"},
			{3733.19,59,"R$ 565,58"},  {3733.2,59,"R$ 848,37"},     {3733.21,59,"R$ 848,37"},   {4198.94,59,"R$ 954,21"},       {4664.68,59,"R$ 1.060,05"},
			{4664.69,59,"R$ 1.295,62"},{4664.7,59,"R$ 1.295,62"},   {5000,59,"R$ 1.388,75"},    {9999999.99,59,"R$ 2.777.500,00"},  
		});		
	}
	
	@Parameter(0)
	public double valorBase;
	@Parameter(1) 
	public int diasAtraso;
	@Parameter(2)
	public String expected;
	

	@Test
	public void nunerosValidos() throws Exception {		
		String actual =app.calculaValorEJuros(valorBase, diasAtraso);	
		assertEquals(expected,actual);
	}
}



