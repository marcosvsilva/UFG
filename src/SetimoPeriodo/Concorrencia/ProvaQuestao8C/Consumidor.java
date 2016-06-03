/*
|---------------------------------------|
| Aluno: Marcos Vinicius Ribeiro Silva  |
| Matrícula: 118218                     |
|---------------------------------------|
*/

package SetimoPeriodo.Concorrencia.ProvaQuestao8C;

public class Consumidor extends Thread
{
	Deposito dep;
	
	public Consumidor(Deposito dep)
	{
		this.dep = dep; 
	}

	public void run()
	{
		for (int i = 0; i < 10; i++)
		{
			try
			{
				dep.retirar(this);
			}catch (InterruptedException e1){e1.printStackTrace();}
		}
	}	
}