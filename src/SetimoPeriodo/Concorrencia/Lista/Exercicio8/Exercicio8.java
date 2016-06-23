package SetimoPeriodo.Concorrencia.Lista.Exercicio8;

import java.util.ArrayList;

public class Exercicio8
{
    public static ArrayList<Integer> placar = new ArrayList<Integer>();

    public static void main(String[] args) throws InterruptedException
    {
        int numeroDeLebres = 5;

        Lebre lebres[] = new Lebre[numeroDeLebres];

        for (int i = 0; i < numeroDeLebres; i++)
            lebres[i] = new Lebre(i,20);

        for (int i = 0; i < numeroDeLebres; i++)
            lebres[i].start();

        for (int i = 0; i < numeroDeLebres; i++)
            lebres[i].join();

        System.out.println("Placar:");
        for (int i = 0; i < placar.size(); i++)
            System.out.println((i + 1) + "ª lebre número: " + placar.get(i));

    }

    public static synchronized void ImplementaPlacar(int id)
    {
        Exercicio8.placar.add(id);
    }

}