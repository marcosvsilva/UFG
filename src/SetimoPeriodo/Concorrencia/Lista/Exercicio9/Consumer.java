package SetimoPeriodo.Concorrencia.Lista.Exercicio9;

public class Consumer extends Thread
{
    private Mailbox mail;

    public Consumer(Mailbox mail)
    {
        this.mail = mail;
    }

    public void run()
    {
        for (int i = 0; i < 10; i++)
        {
            try {
                System.out.println(mail.retrieveMessage());
            } catch (InterruptedException e) {e.printStackTrace();
            }
        }
    }
}
