package SetimoPeriodo.Concorrencia.Lista.Exercicio9;

public class Mailbox
{
    private String mensagem = "";
    private String mensagemNula = "";

    public synchronized void storeMessage(String msg) throws InterruptedException
    {
        while (!mensagemNula.equals(mensagem))
            wait();

        mensagem = msg;
        notifyAll();
    }

    public synchronized String retrieveMessage() throws InterruptedException
    {
        while (mensagemNula.equals(mensagem))
            wait();

        String retorno = mensagem;
        mensagem = mensagemNula;
        notifyAll();
        return retorno;
    }
}