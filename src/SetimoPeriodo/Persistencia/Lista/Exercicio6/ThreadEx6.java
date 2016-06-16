package SetimoPeriodo.Persistencia.Lista.Exercicio6;

public class ThreadEx6 extends Thread
{
	char imprimir;
	
	public ThreadEx6(char imprimir)
	{
		this.imprimir = imprimir;
	}

	public void run()
	{
		System.out.print(imprimir);
	}
}