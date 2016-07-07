package SetimoPeriodo.Concorrencia.Lista.Exercicio9;

public class Producer extends Thread
{
    private String mensagem;
    private Mailbox mail;

    public Producer(Mailbox mail, String mensagem)
    {
        this.mensagem = mensagem;
        this.mail = mail;
    }

    public void run()
    {
        for (int i = 0; i < 10; i++)
        {
            try
            {
                mail.storeMessage(mensagem);
            } catch (InterruptedException e) {e.printStackTrace();}
        }

    }
}
