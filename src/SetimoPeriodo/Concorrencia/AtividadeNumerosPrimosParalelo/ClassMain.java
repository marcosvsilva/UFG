package SetimoPeriodo.Concorrencia.AtividadeNumerosPrimosParalelo;

public class ClassMain
{

	public static void main(String[] args)
	{
		System.out.println("Tempo de execu��o dos 100.000 primeiros primos: " + ValidaNumeroPrimo.CalculaTempo(100000) + " milisegundos");
		System.out.println("Tempo de execu��o dos 200.000 primeiros primos: " + ValidaNumeroPrimo.CalculaTempo(200000) + " milisegundos");
		System.out.println("Tempo de execu��o dos 400.000 primeiros primos: " + ValidaNumeroPrimo.CalculaTempo(400000) + " milisegundos");
		System.out.println("Tempo de execu��o dos 700.000 primeiros primos: " + ValidaNumeroPrimo.CalculaTempo(700000) + " milisegundos");		
		System.out.println("Tempo de execu��o dos 1.000.000 primeiros primos: " + ValidaNumeroPrimo.CalculaTempo(1000000) + " milisegundos");				
	}

}