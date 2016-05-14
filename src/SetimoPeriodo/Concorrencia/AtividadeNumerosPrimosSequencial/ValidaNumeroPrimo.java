package SetimoPeriodo.Concorrencia.AtividadeNumerosPrimosSequencial;

public class ValidaNumeroPrimo
{
	public static boolean EhPrimo(int entrada)
	{		
		boolean aux;
		if(entrada<5 || entrada%2==0 || entrada%3==0)
		{
			aux = (entrada==2||entrada==3);
			return aux;
		}

		int maxP = (int) (Math.sqrt(entrada)+2);
		
		for(int p=5; p<maxP; p+=6)
			if(entrada%p==0||entrada%(p+2)==0)
				return false;
		
		return true;
	}
	
	public static long CalculaTempoExecucao(int tamanho)
	{
		long horaInicial, horaFinal;
		
		int numerosPrimos[] = new int[tamanho];  
		
		horaInicial = System.currentTimeMillis();
		
		for (int i = 1; i <= tamanho; i++)
			if (ValidaNumeroPrimo.EhPrimo(i))
				numerosPrimos[i] = i;
		
		horaFinal = System.currentTimeMillis();
		return (horaFinal - horaInicial);
	}
}
