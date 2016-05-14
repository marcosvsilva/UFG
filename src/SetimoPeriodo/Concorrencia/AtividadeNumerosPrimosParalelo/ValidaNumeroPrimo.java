package SetimoPeriodo.Concorrencia.AtividadeNumerosPrimosParalelo;

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
	
	public static long CalculaTempo(int entrada)
	{
		long horaInicial, horaFinal;
		int corte, ultimo;
		int posicaoInicial1, posicaoInicial2, posicaoInicial3, posicaoInicial4, posicaoInicial5;
		
		corte = entrada / 5;
		ultimo = entrada - (corte * 4);
		
		posicaoInicial1 = 1;
		posicaoInicial2 = posicaoInicial1 + corte;
		posicaoInicial3 = posicaoInicial2 + corte;
		posicaoInicial4 = posicaoInicial3 + corte;
		posicaoInicial5 = posicaoInicial4 + corte;		
		  	  	
  	CalculaTempoExecucao t1 = new CalculaTempoExecucao(posicaoInicial1,corte-1);
  	CalculaTempoExecucao t2 = new CalculaTempoExecucao(posicaoInicial2,corte-1);
  	CalculaTempoExecucao t3 = new CalculaTempoExecucao(posicaoInicial3,corte-1);
  	CalculaTempoExecucao t4 = new CalculaTempoExecucao(posicaoInicial4,corte-1);
  	CalculaTempoExecucao t5 = new CalculaTempoExecucao(posicaoInicial5,ultimo-1);  	
  	
  	horaInicial = System.currentTimeMillis();  	  	
  	t1.start();
  	t2.start();
  	t3.start();
  	t4.start();
  	t5.start();  	
  	
  	try
  	{
  		t1.join();
  		t2.join();
  		t3.join();
  		t4.join();
  		t5.join();  		
  	} catch (InterruptedException e) {}		
  	horaFinal = System.currentTimeMillis();
  	
  	return (horaFinal - horaInicial);
  }
}