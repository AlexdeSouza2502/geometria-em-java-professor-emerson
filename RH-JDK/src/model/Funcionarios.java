package model;

public abstract class Funcionarios {
	private String nome;
	private String cpf;
	private String endereco;
	private String dataAdmissao;
	private String titulacao;
	private double salario;
	private double SalarioBase;

	public Funcionarios(String pCPF, String pNome, String pEndereco, 
			String pdataAdmissao, String pTitulacao, double pSalario, double pSalarioBase) {
		this.nome = pNome;
		this.cpf = pCPF;
		this.dataAdmissao = pdataAdmissao;
		this.endereco = pEndereco;
		this.titulacao = pTitulacao;
		this.salario = pSalario;
		this.SalarioBase = pSalarioBase;
	}

	public double getSalarioBase() {
		return SalarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.SalarioBase = salarioBase;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getDataAdmissao() {
		return dataAdmissao;
	}

	public void setDataAdmissao(String dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}

	public String getTitulacao() {
		return titulacao;
	}

	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double calculaSalario() {
		return this.getSalario();
	}
	public String toString() 
	{
		return "\ncpf: " + this.cpf + "\n nome: " + this.nome + "\nendereço: " + this.endereco + "\ndata de emissão:" + this.dataAdmissao + "\ntitulação: " + this.titulacao + "\nsalario base: " + this.SalarioBase;
	}
}
