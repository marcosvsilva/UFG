package Persistencia;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.omg.IOP.TAG_RMI_CUSTOM_MAX_STREAM_FORMAT;

public class ExercicioSeis
{	
	public static void main(String[] args)
	{
		int quantidadeCaracteres;
		String arquivo;
		
		FileInputStream fis = null;
		DataInputStream dis = null;
		
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
			//quantidadeCaracteres = dis.readInt();
			arquivo = dis.readLine();
			String[] saida = arquivo.split("2");
		    for(int i=0 ; i<saida.length ; i++)
		    {  
		        char c = (char)Integer.parseInt(saida[i], 2);  
		        System.out.print(c);
		    }						
		}
		catch (IOException e)
		{
			e.printStackTrace();
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
		
	}

}
