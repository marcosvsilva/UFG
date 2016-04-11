package Persistencia;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;	
import java.io.IOException;

public class ExercicioTres
{	
	public static void main(String[] args)
	{
		FileInputStream fis = null;
		DataInputStream dis = null;		
		int primeiro = 0;
		String primeiroStr = null;
		
		try
		{
			fis = new FileInputStream(args[0]);
			dis = new DataInputStream(fis);			
		}
		catch (FileNotFoundException e)
		{		
			e.printStackTrace();
		}
		
		try
		{
			primeiro = dis.readInt();
		}
		catch (IOException e1)
		{
			e1.printStackTrace();
		}		
		
		try
		{
			dis.close();
			fis.close();			
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		
		primeiroStr = Integer.toHexString(primeiro).toUpperCase();
		System.out.println(primeiroStr);				
	}
}