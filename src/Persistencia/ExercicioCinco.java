package Persistencia;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class ExercicioCinco
{
	public static void main(String[] args)
	{
		//Variaveis auxiliadoras
		int tamanhoLinha;
		String linha, saida;
		byte[] linhaBinario;		
		
		//Váriáveis para leitura do arquivo texto
		FileInputStream fis 	= null;
		InputStreamReader isr = null;
		BufferedReader br 		= null;
		
		//Variáveis para gravação da conversão do texto em binário		
		FileOutputStream fos = null;
		DataOutputStream dos = null;
				
		linha = "";
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
				linhaBinario = linha.getBytes("UTF-8");				
				tamanhoLinha = linhaBinario.length;
				saida = new String(linhaBinario,"UTF-8");								
				dos.writeInt(tamanhoLinha);
				dos.writeUTF(saida);
				dos.write('\n');
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
	