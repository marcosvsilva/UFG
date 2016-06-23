package SetimoPeriodo.Concorrencia.Lista.Exercicio7;

public class Exercicio7
{
	public static int numero = -1;

	public static int parallelSearch(int x, int[] A, int numThreads) throws InterruptedException {
		ThreadEx7 threads[] = new ThreadEx7[numThreads];
		int quantidade = A.length / numThreads;
		
		threads[0] = new ThreadEx7(A, x, 0, quantidade);
		for (int i = 1; i < numThreads; i++)
			threads[i] = new ThreadEx7(A, x, ((quantidade * i)+1), quantidade);
		
		for (int i = 0; i < numThreads; i++)
			threads[i].start();

        for (int i = 0; i < numThreads; i++)
            threads[i].join();

        return Exercicio7.numero;
	}	

	public static synchronized void setNumero(int numero)
	{
		Exercicio7.numero = numero;
	}

	public static void main(String[] args) throws InterruptedException {
		int numThreads = 10;
		int tamanhoVetor = 1000;
		int A[] = new int[tamanhoVetor]; 
		
		for (int i = 0; i < A.length; i++)
			A[i] = (int) (Math.random() * tamanhoVetor);
		
		int x = (int) (Math.random() * tamanhoVetor);
		
		System.out.println(parallelSearch(x, A, numThreads));
	}
} 