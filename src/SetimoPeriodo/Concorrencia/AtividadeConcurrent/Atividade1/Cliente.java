package SetimoPeriodo.Concorrencia.AtividadeConcurrent.Atividade1;

/**
 * Created by Marcos on 03/07/2016.
 */
public class Cliente implements Runnable
{

        private ContaCorrente conta;

        public Cliente(ContaCorrente conta)
        {
            this.conta = conta;
        }

        @Override
        public void run()
        {
            conta.sacar(Math.random() * 1000);

            conta.depositor(Math.random() * 1000);

            conta.depositor(Math.random() * 1000);
            conta.sacar(Math.random() * 1000);

            conta.depositor(Math.random() * 1000);
            conta.sacar(Math.random() * 1000);

            conta.depositor(Math.random() * 1000);
            conta.sacar(Math.random() * 1000);

            conta.depositor(Math.random() * 1000);
            conta.sacar(Math.random() * 1000);

            conta.depositor(Math.random() * 1000);
            conta.sacar(Math.random() * 1000);

            conta.depositor(Math.random() * 1000);
            conta.sacar(Math.random() * 1000);

            conta.depositor(Math.random() * 1000);
            conta.sacar(Math.random() * 1000);

            conta.depositor(Math.random() * 1000);
            conta.sacar(Math.random() * 1000);

            conta.depositor(Math.random() * 1000);
            conta.sacar(Math.random() * 1000);

            conta.sacar(Math.random() * 1000);
        }
}