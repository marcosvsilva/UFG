/*
|---------------------------------------|
| Aluno: Marcos Vinicius Ribeiro Silva  |
| Matrícula: 118218                     |
|---------------------------------------|
*/

package SetimoPeriodo.Concorrencia.ProvaQuestao8A;

public class Produtor extends Thread
{
	Deposito dep;
	
	public Produtor(Deposito dep)
	{
		this.dep = dep;
	}
	
	public void run()
	{
		for (int i = 0; i < 10; i++)
		{
			dep.colocar();
			try{
				sleep((long) (Math.random() * 1000));
			}catch (InterruptedException e){e.printStackTrace();}
		}
	}
}