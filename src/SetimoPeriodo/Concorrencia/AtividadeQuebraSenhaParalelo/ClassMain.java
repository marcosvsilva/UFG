package SetimoPeriodo.Concorrencia.AtividadeQuebraSenhaParalelo;

import java.util.ArrayList;

import SetimoPeriodo.Concorrencia.AtividadeQuebraSenhaParalelo.DivideThread;

public class ClassMain
{	
	public static void main(String[] args)	
	{	
		ArrayList<String> Resultado = new ArrayList<String>();
		ArrayList<String> senhas = new ArrayList<String>();
		
		senhas.add("17a0a00212dde12b063af7dc22fdf02b");		            
		senhas.add("75abfe3020804dd73a2a6040da9df96c");
		senhas.add("c77aeec24015ad7e6e0b1db9d9deed68");

		try
		{
			Resultado.add(DivideThread.TempoExecucao(senhas.get(0)));
			Resultado.add(DivideThread.TempoExecucao(senhas.get(1)));
			Resultado.add(DivideThread.TempoExecucao(senhas.get(2)));						
		}
		catch (InterruptedException e){e.printStackTrace();}
		
		for (int i = 0; i < Resultado.size(); i++)
			System.out.println(Resultado.get(i));
	}				
}