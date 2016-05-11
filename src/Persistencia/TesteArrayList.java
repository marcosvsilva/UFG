package Persistencia;

import java.util.List;
import java.io.Serializable;

public class TesteArrayList implements Serializable
{
	List<String> list;
	
	public TesteArrayList(List<String> list)
	{
		this.list = list; 
	}

}
