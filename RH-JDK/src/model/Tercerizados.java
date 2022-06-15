package model;

public class Tercerizados extends Funcionarios {
	private String Siape;
	private int dataContrato;
	private String funcao;

	public Tercerizados (String pCPF, String pNome, String pEndereco, 
			String pdataAdmissao, String pTitulacao, String pSiape, double pSalario,double pSalarioBase) {
		super(pCPF,pNome,pEndereco,pdataAdmissao,pTitulacao, pSalario, pSalarioBase);
		this.Siape = pSiape;
	}

	public String getSiape() {
		return Siape;
	}

	public void setSiape(String siape) {
		Siape = siape;
	}

	public int getDataContrato() {
		return dataContrato;
	}

	public void setDataContrato(int dataContrato) {
		this.dataContrato = dataContrato;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	@Override
	public double calculaSalario()
	{
		double salarioBase = this.getSalarioBase();
		
		if (this.funcao.equalsIgnoreCase("professor")) 
		{
			if(this.getTitulacao().equalsIgnoreCase("Mestre"))
			{
				salarioBase = salarioBase + 500;
			}
			else if(this.getTitulacao().equalsIgnoreCase("Doutor"))
			{
				salarioBase = salarioBase + 1000;
			}
		}
		
		this.setSalarioBase(salarioBase);
		return salarioBase;
	}
	
	@Override
	public String toString() 
	{
		return "\ncpf: " + this.getCpf() + "\nnome: " + this.getNome() + "\nendereço: " + this.getEndereco() + "\ndata de emissão:" + this.getDataAdmissao() + "\ntitulação: " + this.getTitulacao() + "\nsalario base: " + this.getSalarioBase()
		+ "\ndata de fim de contrato: " + this.dataContrato + "\nfunçao: " + this.funcao;
	}






}
