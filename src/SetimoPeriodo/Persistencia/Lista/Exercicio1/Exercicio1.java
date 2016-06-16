package SetimoPeriodo.Persistencia.Lista.Exercicio1;

import SetimoPeriodo.Persistencia.Lista.Exercicio1.ThreadEx1;

public class Exercicio1
{
	public static void main(String[] args)	
	{			
		int quantidadeThreads = 20;
		
		ThreadEx1 thread[] = new ThreadEx1[quantidadeThreads];
		
		for (int i = 0; i < quantidadeThreads; i++)
			thread[i] = new ThreadEx1();
		
		for (int i = 0; i < quantidadeThreads; i++)
			thread[i].start();		
	}
}