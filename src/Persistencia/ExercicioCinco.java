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
	static final int VALOR_INTEIRO_BYTE = 4;	
	
	public static void main(String[] args)
	{		
		//Váriáveis para leitura do arquivo texto
		FileInputStream fis 	= null;
		InputStreamReader isr   = null;
		BufferedReader br 		= null;		
		
		//Variáveis para gravação da conversão do texto em binário		
		FileOutputStream fos = null;
		DataOutputStream dos = null;
		
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
			String linha;
			int quantidadeLinhas = 0;
			String[] entrada = new String[10000];
			while((linha = br.readLine()) != null)
			{
				entrada[quantidadeLinhas] = linha;
				quantidadeLinhas++;				
			}
			
			int[] indice = new int[quantidadeLinhas+1];
			indice[0] = (quantidadeLinhas * VALOR_INTEIRO_BYTE); //tamanho do sumário				
			for (int i = 0; i < quantidadeLinhas; i++)
			{
				linha = entrada[i];
				int tamanhoLinha = linha.length();
				indice[i+1] = indice[i] + tamanhoLinha + VALOR_INTEIRO_BYTE;
			}
			
			for (int i = 0; i < quantidadeLinhas; i++)
				dos.writeInt(indice[i]);
			
			byte[] linhaBinario;
			for (int i = 0; i < quantidadeLinhas; i++)
			{
				dos.writeInt(entrada[i].length());
				linhaBinario = entrada[i].getBytes();
				dos.write(linhaBinario);
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
	