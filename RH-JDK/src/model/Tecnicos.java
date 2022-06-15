package model;

public class Tecnicos extends Funcionarios {
	private String siape;
	private String departamento;

	public Tecnicos(String pCPF, String pNome, String pEndereco, 
			String pdataAdmissao, String pTitulacao, String pSiape, double pSalario, double pSalarioBase) {
		super(pCPF,pNome,pEndereco,pdataAdmissao,pTitulacao, pSalario, pSalarioBase);
		this.siape = pSiape;
	}

	public String getSiape() {
		return siape;
	}

	public void setSiape(String siape) {
		this.siape = siape;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	@Override
	public double calculaSalario()
	{
		double salarioBase = this.getSalarioBase();
		
		if(this.getTitulacao().equalsIgnoreCase("Mestre"))
		{
			salarioBase = salarioBase + 0.15*salarioBase;
		}
		else if(this.getTitulacao().equalsIgnoreCase("Doutor"))
		{
			salarioBase = salarioBase + 0.3*salarioBase;
		}
		
		this.setSalarioBase(salarioBase);
		return salarioBase;
	}
	
	@Override
	public String toString() 
	{
		return "\ncpf: " + this.getCpf() + "\n nome: " + this.getNome() + "\nendereço: " + this.getEndereco() + "\ndata de emissão:" + this.getDataAdmissao() + "\ntitulação: " + this.getTitulacao() + "\nsalario base: " + this.getSalarioBase()
		+ "\nsiape: " + this.siape + "\ndepartamento: " + this.departamento;
	}
}


