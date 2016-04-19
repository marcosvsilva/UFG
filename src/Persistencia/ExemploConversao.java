package Persistencia;

import java.util.Scanner;

public class ExemploConversao
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String escolher;
		String texto;
		String binario1;
		String textodecodificado = "";
		int escolher1;

		while(true)
		{
			System.out.println("Bem vindo ao conversor texto para bin�rio e vice versa do jomp16!");
			System.out.println();
			System.out.println("Digite 1 para converter texto para bin�rio e 2 para converter bin�rio para texto");
			escolher = sc.nextLine();
			escolher1 = Integer.parseInt(escolher); 
			if(escolher1 == 1)
			{
				System.out.println("Converter texto para bin�rio escolhido, digite o texto para converter");
				System.out.println();
				texto = sc.nextLine();
				byte[] bytes = texto.getBytes();
				StringBuilder binario = new StringBuilder();
				for (byte b : bytes)
				{
					int val = b;
					for (int i = 0; i < 8; i++)
					{
						binario.append((val & 128) == 0 ? 0 : 1);
						val <<= 1;
					}
					binario.append(' ');
				}
				System.out.println();
				System.out.println("O texto '" +texto+ "' para bin�rio foi: " +binario);
			}
			if(escolher1 == 2)
			{
				System.out.println("Converter bin�rio para texto escolhido, digite o c�digo para decodificar");
				System.out.println();
				binario1 = sc.nextLine();
				System.out.println("O c�digo dizia : " +textodecodificado);
			}
			break;
		}
	}
}