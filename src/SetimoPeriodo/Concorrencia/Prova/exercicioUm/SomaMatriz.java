package SetimoPeriodo.Concorrencia.Prova.ExercicioUm;

/**
 * Created by Marcos on 14/07/2016.
 */
public class SomaMatriz {

    public static final int linha = 40;
    public static final int coluna = 50;
    public static final int valorMaximo = 100;

    public static void main(String[] args) {
        int[][] matriz = new  int[linha][coluna];

        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                matriz[i][j] = (int) (Math.random()*valorMaximo);
            }
        }

        ThreadSomaMatriz[] threads = new ThreadSomaMatriz[linha];

        for (int i = 0; i < linha; i++) {
            threads[i] = new ThreadSomaMatriz(matriz,i,coluna);
        }

        for (int i = 0; i < linha; i++) {
            threads[i].start();
        }

    }
}
