package SetimoPeriodo.Concorrencia.Lista.Exercicio4;

public class Exercicio4
{
	public static void main(String[] args)
	{
		int numero = 5;
		T1 teste[][] = new T1[1][numero];		
		
		for (int i = 0; i < numero; i++)
		{			
			teste[0][i] = new T1(i);			
		}
		
		for (int i = 0; i < numero; i++)
			teste[0][i].start();		
	}
}