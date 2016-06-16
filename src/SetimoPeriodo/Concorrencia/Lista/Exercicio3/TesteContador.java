package SetimoPeriodo.Concorrencia.Lista.Exercicio3;

public class TesteContador
{
	public static void main(String[] args)
	{
		int numero = 1000;
		int quantidadeThreads = 5;
		
		numero = numero / 5;
		
		Contador thread[] = new Contador[quantidadeThreads];		

		thread[0] = new Contador(0, numero+1);
		for (int i = 1; i < quantidadeThreads; i++)
			thread[i] = new Contador((numero*i)+1,numero);
		
		for (int i = 0; i < quantidadeThreads; i++)
			thread[i].run();					
	}
}