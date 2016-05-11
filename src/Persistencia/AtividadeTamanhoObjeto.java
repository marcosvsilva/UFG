package Persistencia;

import java.util.List;

import Persistencia.TamanhoEmBytes;
import Persistencia.TesteArrayDouble;
import Persistencia.TesteArrayInt;

import java.io.IOException;
import java.util.ArrayList;

public class AtividadeTamanhoObjeto
{

	public static void main(String[] args)
	{
		int tamanho = 100;
		List<String> ArrayList = new ArrayList<String>();
		int[] ArrayInteiro = new int[tamanho];
		double[] ArrayDouble = new double[tamanho];
		
		for (int i = 0; i < tamanho; i++)
		{
			ArrayList.add("Teste de tamanho de arquivo");
			ArrayInteiro[i] = i;
			ArrayDouble[i] = (double) (i - 0.1);
		}
	
		TesteArrayList TesteLista = new TesteArrayList(ArrayList);
		TesteArrayInt TesteInteiro = new TesteArrayInt(ArrayInteiro);
		TesteArrayDouble TesteDouble = new TesteArrayDouble(ArrayDouble);
		
		try
		{
			System.out.println("Tamanho de um objeto com " + tamanho + " Strings: " + TamanhoEmBytes.main(TesteLista));
			System.out.println("Tamanho de um objeto com " + tamanho + " Inteiros: " + TamanhoEmBytes.main(TesteInteiro));
			System.out.println("Tamanho de um objeto com " + tamanho + " Decimais: " + TamanhoEmBytes.main(TesteDouble));
		} catch (IOException e){e.printStackTrace();}
	}

}
