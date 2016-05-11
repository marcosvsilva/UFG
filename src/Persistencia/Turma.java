package Persistencia;

public class Turma
{

	public Turma()
	{
		// TODO Auto-generated constructor stub
		private List<Aluno> alunos;
	}
}

class Aluno {
	private String codigo;
	private Nome nome;
	private Pai pai;
}

class Nome {
	private String primeiroNome;
	private String segundoNome;
}

class Pai {
	private String cpf;
	private Aluno aluno;
}
