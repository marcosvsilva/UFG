package SetimoPeriodo.Persistencia.AtividadeNumerosPrimosSequencial;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;

import SetimoPeriodo.Persistencia.AtividadeNumerosPrimosSequencial.ValidaNumeroPrimo;

public class ClassMain
{

	public static void main(String[] args)
	{
		System.out.println("Tempo de execução dos 100.000 primeiros primos: " + ValidaNumeroPrimo.CalculaTempoExecucao(100000) + " milisegundos");
		System.out.println("Tempo de execução dos 200.000 primeiros primos: " + ValidaNumeroPrimo.CalculaTempoExecucao(200000) + " milisegundos");
		System.out.println("Tempo de execução dos 400.000 primeiros primos: " + ValidaNumeroPrimo.CalculaTempoExecucao(400000) + " milisegundos");
		System.out.println("Tempo de execução dos 400.000 primeiros primos: " + ValidaNumeroPrimo.CalculaTempoExecucao(700000) + " milisegundos");		
		System.out.println("Tempo de execução dos 1.000.000 primeiros primos: " + ValidaNumeroPrimo.CalculaTempoExecucao(1000000) + " milisegundos");
		System.out.println("Tempo de execução dos 10.000.000 primeiros primos: " + ValidaNumeroPrimo.CalculaTempoExecucao(10000000) + " milisegundos");
		System.out.println("Tempo de execução dos 100.000.000 primeiros primos: " + ValidaNumeroPrimo.CalculaTempoExecucao(100000000) + " milisegundos");				
	}

}
