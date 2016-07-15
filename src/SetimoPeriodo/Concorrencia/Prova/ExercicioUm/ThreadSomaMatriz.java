package SetimoPeriodo.Concorrencia.Prova.ExercicioUm;

/**
 * Created by Marcos on 14/07/2016.
 */
public class ThreadSomaMatriz extends Thread{

    private int[][] matriz;
    private int linha;
    private int quantidadeColuna;

    public ThreadSomaMatriz(int[][] matriz, int linha, int quantidadeColuna) {
        this.matriz = matriz;
        this.linha = linha;
        this.quantidadeColuna = quantidadeColuna;
    }

    @Override
    public void run() {
        int soma = 0;
        for (int i = 0; i < quantidadeColuna; i++) {
            soma+=matriz[linha][i];
        }

        System.out.println("Soma da " + (linha+1) + " linha e igual a " + soma);
    }
}
