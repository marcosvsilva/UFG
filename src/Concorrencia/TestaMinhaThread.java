package Concorrencia;

public class TestaMinhaThread
{

	public static void main(String[] args)
	{
		MinhaThread t1 = new MinhaThread();
		MinhaThread t2 = new MinhaThread();
		MinhaThread t3 = new MinhaThread();
		System.out.println("O início do programa principal");
		t1.start();
		t2.start();
		t3.start();
		System.out.println("Fim do programa principal");
	}

}
