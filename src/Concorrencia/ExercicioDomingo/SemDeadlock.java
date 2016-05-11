package Concorrencia.ExercicioDomingo;

public class SemDeadlock
{
	public static void main(String[] args)
	{
		Caixa caixa = new Caixa();
	  
		Cliente marcosVinicius = new Cliente("marcosVinicius", caixa);
		marcosVinicius.start();

		Cliente yuriMateus = new Cliente("yuriMateus", caixa);
		yuriMateus.start();

		Cliente gustavoMoraes = new Cliente("gustavoMoraes", caixa);
		gustavoMoraes.start();
	      
		Cliente elisonHenrique = new Cliente("elisonHenrique", caixa);
		elisonHenrique.start();
	      
		Cliente marcellaLeal = new Cliente("marcellaLeal", caixa);
		marcellaLeal.start();
	      
		Cliente mariCaetano = new Cliente("mariCaetano", caixa);
		mariCaetano.start();
	}
}