package Persistencia;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExercicioTres
{	
	public static void main(String[] args)
	{
		FileOutputStream fos = null;
		DataOutputStream dos = null;
		int inteiro = 1;
		float single = (1/3);
		double valorPI = Math.PI;
		
		try
		{
			fos = new FileOutputStream(args[0]);
			dos = new DataOutputStream(fos);			
		}
		catch (FileNotFoundException e)
		{		
			e.printStackTrace();
		}
		
		try
		{
			dos.writeInt(inteiro);
			dos.writeFloat(single);
			dos.writeDouble(valorPI);			
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		
		try
		{
			dos.close();
			fos.close();			
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}