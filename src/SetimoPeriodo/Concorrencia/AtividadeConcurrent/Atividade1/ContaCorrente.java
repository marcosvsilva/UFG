package SetimoPeriodo.Concorrencia.AtividadeConcurrent.Atividade1;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * Created by Marcos on 03/07/2016.
 */
public class ContaCorrente
{
    private Double saldo;
    private ReentrantReadWriteLock lock;

    public ContaCorrente(Double saldo)
    {
        this.saldo = saldo;
        this.lock = new ReentrantReadWriteLock();
    }

    public void sacar(final Double valor)
    {
        Lock write = lock.writeLock();
        write.lock();

        try
        {
            if(valor <= this.saldo)
                this.saldo -= valor;
            else
                System.out.println("Saldo indisponível para retirada de "+ valor+", saldo atual: " + this.saldo);
        }finally {write.unlock();}

        System.out.println("Saque no valor de: "+ valor + ", saldo atual: " + this.saldo);
    }

    public void depositor(final Double valor)
    {
        Lock write = lock.writeLock();
        write.lock();

        try
        {
            this.saldo += valor;
        } finally {write.unlock();}

        System.out.println("Deposito no valor de: "+ valor + ", saldo atual: " + this.saldo);
    }

    public double getSaldo()
    {
        Lock read = lock.readLock();
        read.lock();
        double saldo = this.saldo;
        read.unlock();
        return saldo;
    }
}