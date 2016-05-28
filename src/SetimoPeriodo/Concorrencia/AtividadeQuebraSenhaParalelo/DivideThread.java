package SetimoPeriodo.Concorrencia.AtividadeQuebraSenhaParalelo;

import java.util.ArrayList;

public class DivideThread
{

	public static String TempoExecucao(String strHash) throws InterruptedException
	{
		ArrayList<String> strCaracteresPossiveis;
		long horaInicial, horaFinal;
		
		strCaracteresPossiveis = PreencheCaracteresPossiveis();
		
		CalculaTempoExecucao t01 = new CalculaTempoExecucao("a", strHash, strCaracteresPossiveis);
		CalculaTempoExecucao t02 = new CalculaTempoExecucao("b", strHash, strCaracteresPossiveis);		
		CalculaTempoExecucao t03 = new CalculaTempoExecucao("c", strHash, strCaracteresPossiveis);		
		CalculaTempoExecucao t04 = new CalculaTempoExecucao("d", strHash, strCaracteresPossiveis);
		CalculaTempoExecucao t05 = new CalculaTempoExecucao("e", strHash, strCaracteresPossiveis);
		CalculaTempoExecucao t06 = new CalculaTempoExecucao("f", strHash, strCaracteresPossiveis);
		CalculaTempoExecucao t07 = new CalculaTempoExecucao("g", strHash, strCaracteresPossiveis);
		CalculaTempoExecucao t08 = new CalculaTempoExecucao("h", strHash, strCaracteresPossiveis);
		CalculaTempoExecucao t09 = new CalculaTempoExecucao("i", strHash, strCaracteresPossiveis);
		CalculaTempoExecucao t10 = new CalculaTempoExecucao("j", strHash, strCaracteresPossiveis);
		CalculaTempoExecucao t11 = new CalculaTempoExecucao("k", strHash, strCaracteresPossiveis);
		CalculaTempoExecucao t12 = new CalculaTempoExecucao("l", strHash, strCaracteresPossiveis);
		CalculaTempoExecucao t13 = new CalculaTempoExecucao("m", strHash, strCaracteresPossiveis);
		CalculaTempoExecucao t14 = new CalculaTempoExecucao("n", strHash, strCaracteresPossiveis);
		CalculaTempoExecucao t15 = new CalculaTempoExecucao("o", strHash, strCaracteresPossiveis);
		CalculaTempoExecucao t16 = new CalculaTempoExecucao("p", strHash, strCaracteresPossiveis);
		CalculaTempoExecucao t17 = new CalculaTempoExecucao("q", strHash, strCaracteresPossiveis);
		CalculaTempoExecucao t18 = new CalculaTempoExecucao("r", strHash, strCaracteresPossiveis);
		CalculaTempoExecucao t19 = new CalculaTempoExecucao("s", strHash, strCaracteresPossiveis);
		CalculaTempoExecucao t20 = new CalculaTempoExecucao("t", strHash, strCaracteresPossiveis);
		CalculaTempoExecucao t21 = new CalculaTempoExecucao("u", strHash, strCaracteresPossiveis);		
		CalculaTempoExecucao t22 = new CalculaTempoExecucao("v", strHash, strCaracteresPossiveis);
		CalculaTempoExecucao t23 = new CalculaTempoExecucao("w", strHash, strCaracteresPossiveis);
		CalculaTempoExecucao t24 = new CalculaTempoExecucao("x", strHash, strCaracteresPossiveis);
		CalculaTempoExecucao t25 = new CalculaTempoExecucao("y", strHash, strCaracteresPossiveis);		
		CalculaTempoExecucao t26 = new CalculaTempoExecucao("z", strHash, strCaracteresPossiveis);
		CalculaTempoExecucao t27 = new CalculaTempoExecucao("0", strHash, strCaracteresPossiveis);
		CalculaTempoExecucao t28 = new CalculaTempoExecucao("1", strHash, strCaracteresPossiveis);
		CalculaTempoExecucao t29 = new CalculaTempoExecucao("2", strHash, strCaracteresPossiveis);
		CalculaTempoExecucao t30 = new CalculaTempoExecucao("3", strHash, strCaracteresPossiveis);
		CalculaTempoExecucao t31 = new CalculaTempoExecucao("4", strHash, strCaracteresPossiveis);
		CalculaTempoExecucao t32 = new CalculaTempoExecucao("5", strHash, strCaracteresPossiveis);
		CalculaTempoExecucao t33 = new CalculaTempoExecucao("6", strHash, strCaracteresPossiveis);
		CalculaTempoExecucao t34 = new CalculaTempoExecucao("7", strHash, strCaracteresPossiveis);
		CalculaTempoExecucao t35 = new CalculaTempoExecucao("8", strHash, strCaracteresPossiveis);
		CalculaTempoExecucao t36 = new CalculaTempoExecucao("9", strHash, strCaracteresPossiveis);		
		CalculaTempoExecucao.zeraSenha();
		
		horaInicial = System.currentTimeMillis();
				
		t01.start();
		t02.start();
		t03.start();
		t04.start();
		t05.start();
		t06.start();
		t07.start();
		t08.start();
		t09.start();
		t10.start();
		t11.start();
		t12.start();
		t13.start();
		t14.start();
		t15.start();
		t16.start();
		t17.start();
		t18.start();
		t19.start();
		t20.start();
		t21.start();
		t22.start();
		t23.start();
		t24.start();
		t25.start();
		t26.start();
		t27.start();
		t28.start();
		t29.start();
		t30.start();
		t31.start();
		t32.start();
		t33.start();
		t34.start();
		t35.start();
		t36.start();				
		
		while (CalculaTempoExecucao.getSenha() == null)
		{
			try {Thread.sleep (100);}
			catch (InterruptedException ex) {}
		}
	
		horaFinal = System.currentTimeMillis();
		
		String strSaida = "Senha = " + CalculaTempoExecucao.getSenha();							
		strSaida = strSaida + (", Tempo gasto:" + ((horaFinal - horaInicial)/1000) + " segundos");
		return strSaida;
	}
	
	private static ArrayList<String> PreencheCaracteresPossiveis()
	{
		ArrayList<String> arrayEntrada = new ArrayList<String>(); 

		for (char ch = 'a'; ch <= 'z'; ch++)
		{
			String tmp = ""+ch;
	    arrayEntrada.add(tmp);
		}
		
		for (char ch = '0'; ch <= '9'; ch++)
		{
			String tmp = ""+ch;
	    arrayEntrada.add(tmp);
		}
		
		return arrayEntrada;
	}
}