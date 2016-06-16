package SetimoPeriodo.Concorrencia.Lista.Exercicio6;

public class Exercicio6
{
	public static void main(String[] args)
	{
		ThreadEx6 t1 = new ThreadEx6('A');
		ThreadEx6 t2 = new ThreadEx6('B');
		ThreadEx6 t3 = new ThreadEx6('C');
		
		while (true)
		{
			t1.run();
			t2.run();
			t3.run();
			System.out.print("\n");
		}
	}
}