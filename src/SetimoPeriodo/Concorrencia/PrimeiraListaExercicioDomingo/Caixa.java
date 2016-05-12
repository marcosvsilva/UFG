package SetimoPeriodo.Concorrencia.PrimeiraListaExercicioDomingo;

public class Caixa
{
	double saldoCaixa = 0.0;
	Cliente clienteDaVez = null;

	public synchronized void atender(Cliente c, int op, double v) throws InterruptedException
	{
		while (clienteDaVez != null)
			wait();
		
		clienteDaVez = c;
		System.out.println("Saldo atual: " + saldoCaixa + " cliente: " + clienteDaVez.getNome() + " op: " + op);
		
		switch (op)
		{
			case -1:
				sacar(c, v);
				break;
			case 1:
				depositar(c, v);
				break;
		}
	}

	public synchronized void sacar(Cliente c, double valor) throws InterruptedException
	{
		while (saldoCaixa <= valor)
			wait();
		
		clienteDaVez = c;
		System.out.println("Saldo atual: " + saldoCaixa + " cliente: " + clienteDaVez.getNome() + " op: -1");		
		if (valor > 0)
		{
			saldoCaixa -= valor;
			clienteDaVez = null;
			notifyAll();
		}
	}

	public synchronized void depositar(Cliente c, double valor)
	{
		clienteDaVez = c;
		System.out.println("Saldo atual: " + saldoCaixa + " cliente: " + clienteDaVez.getNome() + " op: 1");		
		if (valor > 0)
		{
			saldoCaixa += valor;
			clienteDaVez = null;
			notifyAll();
		}
	}
}