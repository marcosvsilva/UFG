/*
|---------------------------------------|
| Aluno: Marcos Vinicius Ribeiro Silva  |
| Matrícula: 118218                     |
|---------------------------------------|
*/

package SetimoPeriodo.Concorrencia.ProvaQuestao8C;

public class Deposito
{

	private int items = 0;
	private final int capacidade = 10;
	Produtor produtorDaVez = null;
	Consumidor consumidorDaVez = null;
	
	public synchronized int retirar(Consumidor c) throws InterruptedException
	{
		while (consumidorDaVez != null)
			wait();
		
		if (items>0)
		{
			consumidorDaVez = c;
			items--;
			System.out.println("Caixa retirada: Sobram " + items + " caixas");
			consumidorDaVez = null;
			notifyAll();
			return 1;
		}
		return 0;
	}
	
	public synchronized int colocar(Produtor p) throws InterruptedException
	{
		while (produtorDaVez != null)
			wait();
			
		if (items < capacidade)
		{
			produtorDaVez = p;
			items++;
			System.out.println("Caixa armazenada: passaram a ser " + items + " caixas");
			produtorDaVez = null;
			notifyAll();
			return 1;
		}
		return 0;
	}
	
	public static void main(String[] args)
	{
		Deposito dep = new Deposito();
		Produtor p = new Produtor(dep);	
		Consumidor c = new Consumidor(dep);
		p.run();
		c.run();
  	try
  	{
  		p.join();
  		c.join();  		
  	} catch (InterruptedException e) {}
  	System.out.println("Execução do main terminada");
	}
}