package SetimoPeriodo.Projetos;
import java.util.Scanner;

public class Fibonacci
{
	
	public static void main(String[] args)
	{
		int a, b, entrada, aux;
		Scanner scan = new Scanner(System.in);
		
		a = 0;
		b = 1;
		entrada = scan.nextInt();
		
		System.out.print(a + ", " + b);		
		for (int I = 0; I < entrada; I++)
		{
			System.out.print(", " + (a+b));
			aux = b;
			b = b+a;
			a = aux;
		}
		scan.close();
	}
}