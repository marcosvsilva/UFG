package Persistencia;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class ExercicioUm
{
	public static void main(String[] args)
	{
		PrintWriter pw = null;
		
		try
		{
			pw = new PrintWriter(args[0],"UTF-8");
		}
		catch (FileNotFoundException | UnsupportedEncodingException e)
		{
			e.printStackTrace();
		}
		
		pw.write(args[1]);
		
		pw.close();
	}
}