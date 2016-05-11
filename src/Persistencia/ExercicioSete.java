package Persistencia;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExercicioSete
{	
	static final int VALOR_INTEIRO_BYTE = 4;

	public static void main(String[] args)
	{
		{
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
				int entrada = Integer.parseInt(args[1]);
				dis.skipBytes((entrada-1)*VALOR_INTEIRO_BYTE);
				int posicao = dis.readInt();
				dis.skipBytes(posicao-(VALOR_INTEIRO_BYTE*entrada));
				int quantidadeBytes = dis.readInt();
				for (int i = 0; i < quantidadeBytes; i++)
				{
					byte letra = dis.readByte();				
					System.out.print((char)letra);
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
}
