package SetimoPeriodo.Concorrencia.AtividadeConcurrent.Atividade2;

/**
 * Created by Marcos on 05/07/2016.
 */
public class MinhaThreadAtividade2 extends Thread
{
    private int[] inteiros;
    private int numThreads;
    private int inicio;
    private int numeroElementos;
    private int encontrar;

    public MinhaThreadAtividade2(int[] inteiros, int numThreads, int inicio, int numeroElementos, int encontrar)
    {
        this.inteiros = inteiros;
        this.numThreads = numThreads;
        this.inicio = inicio;
        this.numeroElementos = numeroElementos;
        this.encontrar = encontrar;
    }

    @Override
    public void run()
    {
        for (int i = this.inicio; i < this.numeroElementos; i += this.numThreads)
        {
            if(Exercicio2.verificaValorAchado()) break;

            System.out.println("Calculando " + i + " comeco: " + this.inicio);

            if (inteiros[i] == encontrar)
            {
                System.out.println("Achei no: " + i);
                Exercicio2.setarValorAchado(i);
                break;
            }
        }
    }
}
