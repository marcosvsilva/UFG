package SetimoPeriodo.Concorrencia.AtividadeQuebraSenhaSerial;

import java.util.ArrayList;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class ClassMain
{
	private static ArrayList<String> Resultado = new ArrayList<String>();
	
	public static void main(String[] args)	
	{		
		ArrayList<String> caracteresPossiveis = null;   
		caracteresPossiveis = PreencheCaracteresPossiveis();

		for (int i = 0; i < caracteresPossiveis.size(); i++)
		{
			System.out.println(caracteresPossiveis.get(i));
		}
		
		ArrayList<String> senhas = new ArrayList<String>();
		senhas.add("17a0a00212dde12b063af7dc22fdf02b");		            
		senhas.add("75abfe3020804dd73a2a6040da9df96c");
		senhas.add("c77aeec24015ad7e6e0b1db9d9deed68");
		
		VerificaTempo(caracteresPossiveis, senhas.get(0));
		VerificaTempo(caracteresPossiveis, senhas.get(1));
		VerificaTempo(caracteresPossiveis, senhas.get(2));		
		
		for (int i = 0; i < Resultado.size(); i++)
			System.out.println(Resultado.get(i));
	}
	
	public static void VerificaTempo(ArrayList<String> strCaracteresPossiveis, String strHash)
	{
		long horaInicial, horaFinal;
		horaInicial = System.currentTimeMillis();
		for (String ch1 : strCaracteresPossiveis)
			for (String ch2 : strCaracteresPossiveis)
				for (String ch3 : strCaracteresPossiveis)
					for (String ch4 : strCaracteresPossiveis)
						for (String ch5 : strCaracteresPossiveis)
						{
							String palavra = ch1 + ch2 + ch3 + ch4 + ch5;
							if (VerificaPalavraGerada(palavra,strHash)) break;
						}
		
		horaFinal = System.currentTimeMillis();
		Resultado.add("Tempo gasto:" + ((horaFinal - horaInicial)/1000) + " segundos");
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
	
	private static boolean VerificaPalavraGerada(String entrada, String hash)
	{
		boolean achou = false;
		String hashGerado = md5(entrada);
	
		achou = hash.equals(hashGerado);
		
		if (achou)
			Resultado.add("Senha: " + entrada);
		
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
}