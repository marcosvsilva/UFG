package SetimoPeriodo.Concorrencia.Lista.Exercicio7;

public class ThreadEx7 extends Thread
{
	int[] vetorBusca;
	int procurar;
	int inicio;
	int quantidade;
	
	public ThreadEx7(int[] vetorBusca, int procurar, int inicio, int quantidade)
	{
		this.vetorBusca = vetorBusca;
		this.procurar = procurar;
		this.inicio = inicio;
		this.quantidade = quantidade;
	}	
	
	public void run()
	{
		for (int i = inicio; i <= (inicio + quantidade); i++)
			if (i == procurar)
				System.out.println(i);
		
		System.out.println(-1);
	}
}