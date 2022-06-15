package model;
import java.util.ArrayList;

public class rh {
	private ArrayList<Funcionarios> Funcionarios = new ArrayList<>();
	
	public void adicionaFuncionarios(Funcionarios f)
	{
		Funcionarios.add(f);
	}
	
	public Funcionarios pesquisaFuncionario(String nome)
	{
		for (Funcionarios f : Funcionarios)
		{
			if (f.getNome().equalsIgnoreCase(nome))
			{
				return f;
			}
		}
		return null;
	}
	
	public ArrayList<Funcionarios> getFuncionarios()
	{
		return Funcionarios;
	}
}
	
  

