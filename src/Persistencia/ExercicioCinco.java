package Persistencia;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.InterfaceAddress;
 

public class ExercicioCinco
{	
	private static String CompletaBits(byte[] entrada)
	{
		StringBuilder binario = new StringBuilder();
		for (byte b : entrada)
		{
			int val = b;
			for (int i = 0; i < 8; i++)
			{
				binario.append((val & 128) == 0 ? 0 : 1);
				val <<= 1;
			}
			binario.append("2");
		}
		return binario.toString();
	}
	
	public static void main(String[] args)
	{
		//Variaveis auxiliadoras
		int tamanhoLinha;
		String linha,tamanhoLinhaString;
		byte[] linhaBinario;
		
		//Váriáveis para leitura do arquivo texto
		FileInputStream fis 	= null;
		InputStreamReader isr   = null;
		BufferedReader br 		= null;		
		
		//Variáveis para gravação da conversão do texto em binário		
		FileOutputStream fos = null;
		DataOutputStream dos = null;
				
		linha = null;
		tamanhoLinha = 0;
		
		try
		{
			fis = new FileInputStream(args[0]);
			isr = new InputStreamReader(fis,"UTF-8");
			br  = new BufferedReader(isr);
			fos = new FileOutputStream(args[1]);
			dos = new DataOutputStream(fos);
		}
		catch (FileNotFoundException | UnsupportedEncodingException e1)
		{
			e1.printStackTrace();
		}
				
		try
		{
			while((linha = br.readLine()) != null)
			{
				tamanhoLinha = linha.length();
				tamanhoLinhaString = Integer.toString(tamanhoLinha);
				
				linhaBinario = tamanhoLinhaString.getBytes();
				dos.writeBytes(CompletaBits(linhaBinario));
				//dos.writeInt(tamanhoLinha);
				
				linhaBinario = linha.getBytes("UTF-8");
				dos.writeBytes(CompletaBits(linhaBinario));								
			}
		}
		catch (IOException e1)
		{
			e1.printStackTrace();
		}
		
		try
		{
			br.close();
			isr.close();
			fis.close();
			fos.close();
			dos.close();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}
	