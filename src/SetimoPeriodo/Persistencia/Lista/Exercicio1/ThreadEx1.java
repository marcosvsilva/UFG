package SetimoPeriodo.Persistencia.Lista.Exercicio1;

public class ThreadEx1 extends Thread
{
	public void run()
	{
		System.out.println("Thread: " + this.getName() + " ID: " +  this.getId());
	}	
}