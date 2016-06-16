package SetimoPeriodo.Persistencia.Lista.Exercicio2;

public class ThreadEx2 extends Thread
{
	int matriz[][];
	int linha;	
	int coluna;	
	
	
	public ThreadEx2(int matriz[][],int linha, int coluna)
	{
		this.matriz = matriz;
		this.linha = linha;
		this.coluna = coluna;
	}
	
	public void run()
	{
		int soma = 0;

		for (int i = 0; i < linha; i++)
			soma = soma + matriz[i][coluna];
		
		System.out.println("Coluna: " + Integer.toString(coluna) + " , resultada na soma de " + Integer.toString(soma));		
	}	
}