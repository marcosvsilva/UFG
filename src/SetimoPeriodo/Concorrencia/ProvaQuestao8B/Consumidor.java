/*
|---------------------------------------|
| Aluno: Marcos Vinicius Ribeiro Silva  |
| Matrícula: 118218                     |
|---------------------------------------|
*/

package SetimoPeriodo.Concorrencia.ProvaQuestao8B;

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
			dep.retirar();
			try{
				sleep((long) (Math.random() * 1000));
			}catch (InterruptedException e){e.printStackTrace();}
		}
	}	
}