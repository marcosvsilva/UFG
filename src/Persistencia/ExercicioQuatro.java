package Persistencia;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExercicioQuatro
{
	public static void main(String[] args)
	{
		FileInputStream fis = null;
		DataInputStream dis = null;
		String hexa = null;
		int primeiro = 0;
		int hexaInteiro = 0;
				
		hexa = "25504446"; //hexa da assinatura do PDF
		hexaInteiro = Integer.parseInt(hexa, 16);		
		
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
				
		if (primeiro == hexaInteiro)
			System.out.println("Arquivo em formato PDF");
	}
}
