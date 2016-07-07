package SetimoPeriodo.Concorrencia.Lista.Exercicio9;

import jdk.nashorn.internal.codegen.Compiler;

public class TestMailbox
{
    public static void main(String[] args)
    {
        int quantidadeThreads = 5;

        Mailbox mail = new Mailbox();
        Producer produtor[] = new Producer[quantidadeThreads];
        Consumer consumidor[] = new Consumer[quantidadeThreads];

        for (int i = 0; i < quantidadeThreads; i++)
            produtor[i] = new Producer(mail, ("Mensagem" + i));

        for (int i = 0; i < quantidadeThreads; i++)
            consumidor[i] = new Consumer(mail);

        for (int i = 0; i < quantidadeThreads; i++)
        {
            produtor[i].start();
            consumidor[i].start();
        }
    }

}
