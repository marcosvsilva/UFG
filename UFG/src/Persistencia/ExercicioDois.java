package Persistencia;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class ExercicioDois
{
	public static void main(String[] args)
	{
		FileInputStream fis 	= null;
		InputStreamReader isr = null;
		BufferedReader br 		= null;
		String linha;		
		
		try
		{
			fis = new FileInputStream(args[0]);
			isr = new InputStreamReader(fis,"UTF-8");
			br = new BufferedReader(isr);			
		}
		catch (FileNotFoundException | UnsupportedEncodingException e1)
		{
			e1.printStackTrace();			
		}
				
		try
		{
			while((linha = br.readLine()) != null)
				System.out.println(linha);
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
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}		
	}
}