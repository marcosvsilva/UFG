package SetimoPeriodo.Concorrencia.Prova.ExercicioDois;

/**
 * Created by Marcos on 14/07/2016.
 */
public class Tartaruga extends Thread{

    private int id;
    private int distanciaCorrida;

    public Tartaruga(int id, int distanciaCorrida) {
        this.id = id;
        this.distanciaCorrida = distanciaCorrida;
    }

    @Override
    public void run() {
        int quantidadePassos = 0;
        int i = 0;

        for (i = 0; i <= distanciaCorrida; i=i+((int) (Math.random()*5))) {
            quantidadePassos++;

            if (quantidadePassos%10==0){
                System.out.println("Tartaruga " + id + " ja andou " + i +
                        " centimetros");
            }

            try {
                Thread.sleep((int)(Math.random() * 2000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        Corrida.ImplementaPlacar("tartaruga " + id +
                ", percorrendo um total de " + i + " centimetro, com " +
                quantidadePassos +  " passos.");
    }
}