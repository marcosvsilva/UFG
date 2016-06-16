package SetimoPeriodo.Concorrencia.Lista.Exercicio3;

public class Contador implements Runnable
{
	int comeca;
	int quantidade;
		
	public Contador(int comeca, int quantidade)
	{
		this.comeca = comeca;
		this.quantidade = quantidade;		
	}
	
	@Override
	public void run()
	{				
		for (int i = comeca; i < (comeca + quantidade); i++)
		{
			System.out.print(i + " ");
			if (i % 50 == 0)
				System.out.print("\n");				
		}
	}
}