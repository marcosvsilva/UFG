package SetimoPeriodo.Concorrencia.AtividadeQuebraSenhaParalelo;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

public class CalculaTempoExecucao extends Thread
{	
	String chrInicial, strHash;
	static String strSenha;
	ArrayList<String> strCaracteresPossiveis;
	
	public CalculaTempoExecucao(String chrInicial, String  strHash, ArrayList<String> strCaracteresPossiveis)
	{
		this.chrInicial = chrInicial;
		this.strCaracteresPossiveis = strCaracteresPossiveis;
		this.strHash = strHash;
	}
	
	public void run()
	{
		for (String ch1 : strCaracteresPossiveis)
			for (String ch2 : strCaracteresPossiveis)
				for (String ch3 : strCaracteresPossiveis)
					for (String ch4 : strCaracteresPossiveis)
					{
						String palavra = chrInicial + ch1 + ch2 + ch3 + ch4;
						if (VerificaPalavraGerada(palavra,strHash)) break;						
					}
	}	
	
	private static boolean VerificaPalavraGerada(String entrada, String hash)
	{
		boolean achou = false;
		String hashGerado = md5(entrada);
	
		achou = hash.equals(hashGerado);
		
		if (achou)
			strSenha = entrada;
		
		return achou;
	}
	
	public static String md5(String senha)
	{
		String sen = "";
		MessageDigest md = null;
		try
		{
			md = MessageDigest.getInstance("MD5");
		} catch (NoSuchAlgorithmException e) {e.printStackTrace();}
		BigInteger hash = new BigInteger(1, md.digest(senha.getBytes()));
		sen = hash.toString(16);			
		return sen;
	}	
	
	public static String getSenha()	
	{
		return strSenha;
	}
	
	public static void zeraSenha()
	{
		strSenha = null;
	}
}

	