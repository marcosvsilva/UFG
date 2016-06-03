/*
|---------------------------------------|
| Aluno: Marcos Vinicius Ribeiro Silva  |
| Matrícula: 118218                     |
|---------------------------------------|
*/

package SetimoPeriodo.Concorrencia.ProvaQuestao8A;

public class Deposito
{

	private int items = 0;
	private final int capacidade = 10;
	
	public int retirar()
	{
		if (items>0)
		{
			items--;
			System.out.println("Caixa retirada: Sobram " + items + " caixas");
			return 1;
		}
		return 0;		
	}
	
	public int colocar()
	{
		if (items < capacidade)
		{
			items++;
			System.out.println("Caixa armazenada: passaram a ser " + items + " caixas");
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