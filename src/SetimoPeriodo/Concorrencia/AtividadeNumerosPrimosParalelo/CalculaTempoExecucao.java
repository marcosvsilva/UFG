package SetimoPeriodo.Concorrencia.AtividadeNumerosPrimosParalelo;

public class CalculaTempoExecucao extends Thread
{
	int tamanho, inicial;
	
	public CalculaTempoExecucao(int inicial, int tamanho)
	{
		this.tamanho = tamanho;
		this.inicial = inicial;
	}

	public void run()
	{		
		int numerosPrimos[] = new int[tamanho];  
		int j=0;		
		for (int i = inicial; i <= (inicial + tamanho); i++)
			if (ValidaNumeroPrimo.EhPrimo(i))
			{
				numerosPrimos[j] = i;
				j++;
			}
	}		
}
