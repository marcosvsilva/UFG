package SetimoPeriodo.Concorrencia.Lista.Exercicio4;

import java.util.Random;

public class T1 extends Thread
{
	int idThread;
	
	public T1(int idThread)
	{
		this.idThread = idThread;
	}
	
	public void run()
	{
		Random tempoSleep = new Random();
		while (true)
		{
			try
			{
				System.out.println("Thread " + idThread + " executando");				
				sleep((long) tempoSleep.nextInt(1000));
			} catch (InterruptedException e){e.printStackTrace();}
		}
	}
}