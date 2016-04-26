package Persistencia;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExercicioSeis
{	
	static final int V_BYTE = 4;
	
	public static void main(String[] args)
	{
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		DataInputStream dis = null;
		
		try
		{
			fis = new FileInputStream(args[0]);
			bis = new BufferedInputStream(fis);
			dis = new DataInputStream(bis);			
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}	
		
		try
		{
			dis.mark(100000);
			int quantidaLinha = dis.readInt();					
			for (int count = 1; count <= (quantidaLinha / V_BYTE); count++)
			{
				dis.reset();				
				dis.skipBytes((count-1)*V_BYTE);
				int posicao = dis.readInt();
				dis.skipBytes(posicao-(V_BYTE*count));
				int quantidadeBytes = dis.readInt();
				for (int j = 0; j < quantidadeBytes; j++)
				{
					byte letra = dis.readByte();				
					System.out.print((char)letra);
				}
				System.out.println();
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
