package SetimoPeriodo.Persistencia.SegundaListaSerializacao;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class AtividadeSerializar
{
	public static void main(String args[])
	{
		Serializar obj = new Serializar();
		//realiza a serialização
		try
		{
			FileOutputStream fos = new FileOutputStream("teste.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(obj);
			oos.close();
			System.out.println("Serializar - object serializado com sucesso");
		}
		catch(Exception e){e.printStackTrace();}         
		//realiza a deserialização
		try
		{
			FileInputStream fis = new FileInputStream("teste.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			obj = (Serializar) ois.readObject();
			ois.close();
			System.out.println("Serializar - object deserializado com sucesso");
		}
		catch(Exception e){e.printStackTrace();}
	}
}
