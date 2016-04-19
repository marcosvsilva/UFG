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
			System.out.println("Bem vindo ao conversor texto para binário e vice versa do jomp16!");
			System.out.println();
			System.out.println("Digite 1 para converter texto para binário e 2 para converter binário para texto");
			escolher = sc.nextLine();
			escolher1 = Integer.parseInt(escolher); 
			if(escolher1 == 1)
			{
				System.out.println("Converter texto para binário escolhido, digite o texto para converter");
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
				System.out.println("O texto '" +texto+ "' para binário foi: " +binario);
			}
			if(escolher1 == 2)
			{
				System.out.println("Converter binário para texto escolhido, digite o código para decodificar");
				System.out.println();
				binario1 = sc.nextLine();
				System.out.println("O código dizia : " +textodecodificado);
			}
			break;
		}
	}
}