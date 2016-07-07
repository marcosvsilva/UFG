package SetimoPeriodo.Concorrencia.AtividadesEmSala;

public class MinhaThread extends Thread
{
	public void run()
	{
		System.out.println("In?cio" + getName());
		for (int i = 1; i < 5; i++)
		{
			System.out.println("Volta: " + i + " - " + getName());
		}
		System.out.println("Fim " + getName());
	}
}
