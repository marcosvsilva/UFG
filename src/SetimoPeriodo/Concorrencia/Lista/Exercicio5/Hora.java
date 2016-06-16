package SetimoPeriodo.Concorrencia.Lista.Exercicio5;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Hora extends Thread
{
	public void run()
	{
		int tempo = 10000;
			
		for (int i = 0; i < 5; i++)
		{			
			System.out.println("Hora: " + getDateTime());
			try
			{				
				sleep((long) tempo);
			} catch (InterruptedException e){e.printStackTrace();}
		}
	}
	
	private String getDateTime()
	{
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date date = new Date();
		return dateFormat.format(date);
	}	
}