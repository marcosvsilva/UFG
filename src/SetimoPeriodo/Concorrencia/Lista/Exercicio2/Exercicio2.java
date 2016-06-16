package SetimoPeriodo.Concorrencia.Lista.Exercicio2;

import java.util.Random;

public class Exercicio2
{
	public static void main(String[] args)
	{
		int linha = 10;
		int coluna = 10;
		
		int matriz[][] = new int[linha][coluna];
		Random numeroRandomico = new Random();
		
		for (int i = 0; i < linha; i++)
			for (int j = 0; j < coluna; j++)
				matriz[i][j] = numeroRandomico.nextInt(100);


		System.out.println("Matriz: ");
		for (int i = 0; i < 10; i++)
		{
			for (int j = 0; j < 10; j++)
				System.out.print(Integer.toString(matriz[i][j]) + " ");
			System.out.println("");
		}
		
		ThreadEx2 calculaTotalLinhas[] = new ThreadEx2[linha];

		for (int i = 0; i < linha; i++)
			calculaTotalLinhas[i] = new ThreadEx2(matriz,linha,i);
		
		for (int i = 0; i < linha; i++)
			calculaTotalLinhas[i].start();			
	}
}