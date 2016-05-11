package Persistencia;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class TamanhoEmBytes
{
	public static int main(Serializable s) throws IOException
	{
	   ByteArrayOutputStream baos = new ByteArrayOutputStream();
	   ObjectOutputStream oos = new ObjectOutputStream(baos);

	   oos.writeObject(s);
	   oos.close();

	   return baos.toByteArray().length;
	}
}
