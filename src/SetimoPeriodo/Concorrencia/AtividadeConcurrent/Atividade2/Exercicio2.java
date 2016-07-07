package SetimoPeriodo.Concorrencia.AtividadeConcurrent.Atividade2;

import java.util.concurrent.*;

/**
 * Created by Marcos on 05/07/2016.
 */
public class Exercicio2
{

    public static int RESULTADO = -1;
    private static final int MAX_ELEMENTOS = 10000;
    private static final int MAX_THREADS = 10;

    public static void main(String[] args) throws InterruptedException
    {
        int[] inteiros = new int[MAX_ELEMENTOS];

        for (int i = 0; i < MAX_ELEMENTOS; i++)
            inteiros[i] = i;

        int encontrar = (int) (Math.random() * MAX_ELEMENTOS);
        int numeroThreads = (int) ((Math.random() * MAX_THREADS) + 1);
        int resultado = parallelSearch(encontrar, inteiros, numeroThreads);

        if(resultado == -1)
            System.out.println("Nao achei esse elemento!");
        else
            System.out.println("Resultado: " + resultado);
    }

    public static int parallelSearch(int encontrar, int[ ]inteiros, int numThreads) throws InterruptedException
    {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        for (int i = 0; i < numThreads; i++)
        {
            MinhaThreadAtividade2 threads = new MinhaThreadAtividade2(inteiros, numThreads, i, MAX_ELEMENTOS, encontrar);
            executor.execute(threads);
        }
        executor.shutdown();
        executor.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
        return RESULTADO;
    }

    public static synchronized void setarValorAchado(int index) { RESULTADO = index; }
    public static synchronized boolean verificaValorAchado()
    {
        return RESULTADO != -1;
    }
}