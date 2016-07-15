package SetimoPeriodo.Concorrencia.Prova.ExercicioDois;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Marcos on 14/07/2016.
 */
public class Corrida {

    public static ArrayList<String> placar = new ArrayList<>();

    public static final int numeroTartarugas = 7;
    public static final int distanciaCorrida = 300;

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executor =
                Executors.newFixedThreadPool(numeroTartarugas);

        Tartaruga tartarugas[] = new Tartaruga[numeroTartarugas];

        for (int i = 0; i < numeroTartarugas; i++) {
            tartarugas[i] = new Tartaruga(i, distanciaCorrida);
            executor.execute(tartarugas[i]);
        }
        executor.shutdown();

        while (!executor.isTerminated()) {}

        for (int i = 0; i < numeroTartarugas; i++) {
            tartarugas[i].join();
        }

        System.out.println("Placar:");
        for (int i = 0; i < placar.size(); i++) {
            System.out.println("Em " + (i+1) + " lugar, " + placar.get(i));
        }
    }

    public static synchronized void ImplementaPlacar(String finalizou) {
        Corrida.placar.add(finalizou);
    }
}