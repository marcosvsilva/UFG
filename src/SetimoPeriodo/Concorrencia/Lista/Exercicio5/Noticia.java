package SetimoPeriodo.Concorrencia.Lista.Exercicio5;

public class Noticia extends Thread
{
	public void run()
	{		
		int tempo = 5000;
		for (int i = 0; i < 10; i++)
		{
			System.out.println("Notícia: " + i);
			try
			{
				sleep((long) tempo);
			} catch (InterruptedException e){e.printStackTrace();}
		}
	}
}