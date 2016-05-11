package Concorrencia.ExercicioDomingo;

public class Cliente extends Thread
{
	private String nome;
	private Caixa caixa;

	public Cliente(String nome, Caixa caixa)
	{
		this.nome = nome;
		this.caixa = caixa;
	}

	public String getNome()
	{
		return nome;
	}

	public void setNome(String nome)
	{
		this.nome = nome;
	}

	public void run()
	{
		System.out.println("Cliente " + nome + " começou!");
		while (true)
		{
			try
			{
				caixa.depositar(this, 300);
				Thread.sleep((int) (Math.random() * 1000));
        
				caixa.sacar(this, 200);
				Thread.sleep((int) (Math.random() * 1000));
                
				caixa.depositar(this, 500);
				Thread.sleep((int) (Math.random() * 1000));
        
				caixa.sacar(this, 250);
				Thread.sleep((int) (Math.random() * 1000));				
			} catch (InterruptedException e) {e.printStackTrace();}
		}
	}
}