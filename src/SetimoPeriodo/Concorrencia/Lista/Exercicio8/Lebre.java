package SetimoPeriodo.Concorrencia.Lista.Exercicio8;

public class Lebre extends Thread
{
    private int id;
    private int distanciaTotal;

    public Lebre(int id, int distanciaTotal)
    {
        this.id = id;
        this.distanciaTotal = distanciaTotal;
    }

    public void run()
    {
        int distanciaPercorrida = 0;
        int distanciaPulo = 0;
        int quantidadePulos = 0;

        while (distanciaPercorrida < distanciaTotal)
        {
            distanciaPulo = (int) ((Math.random() * 3) + 1);
            quantidadePulos++;
            distanciaPercorrida += distanciaPulo;
            System.out.println("Lebre " + id + " pulou " + distanciaPulo);
            yield();
        }
        Exercicio8.ImplementaPlacar(id);
    }
}
