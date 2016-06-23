package SetimoPeriodo.Concorrencia.Lista.Exercicio7;

public class Exercicio7
{	
	public static void parallelSearch(int x, int[] A, int numThreads)
	{
		ThreadEx7 threads[] = new ThreadEx7[numThreads];
		int quantidade = A.length / numThreads;		
		
		threads[0] = new ThreadEx7(A, x, 0, quantidade);
		for (int i = 1; i < numThreads; i++)
			threads[i] = new ThreadEx7(A, x, ((quantidade * i)+1), quantidade);
		
		for (int i = 0; i < numThreads; i++)
			threads[i].start();		
	}	
	
	public static void main(String[] args)
	{
		int numThreads = 10;
		int tamanhoVetor = 1000;
		int A[] = new int[tamanhoVetor]; 
		
		for (int i = 0; i < A.length; i++)
			A[i] = (int) (Math.random() * tamanhoVetor);
		
		int x = (int) (Math.random() * tamanhoVetor);
		
		parallelSearch(x, A, numThreads);		
	}
} 