package view;

import java.util.Scanner;

import model.Docente;
import model.Tecnicos;
import model.Tercerizados;


public class Menu {
	private String cpf;
	private String nome;
	private String endereco;
	private String DataAdmissao;
	private String titulacao;
	private double SalarioBase;
	private double Salario;
	private String Siape;
	private String area;
	private Scanner leitor;
	private String departamento;
	private String dataFim;
	private String funcao;
	
	{
		leitor = new Scanner(System.in);
	}
	
	private void informacoesFuncionario()
	{
		System.out.println("Qual o CPF? ");
		this.cpf = leitor.next();
		System.out.println("Qual o nome que deseja adionar? ");
		this.nome = leitor.next();
		System.out.println("Endereço do Funcionario: ");
		this.endereco = leitor.next();
		System.out.println("Qual a data de Admissão? ");
		this.DataAdmissao = leitor.next();
		System.out.println("Qual a titulação? ");
		this.titulacao = leitor.next();
		System.out.println("Quanto é o salario base? ");
		this.SalarioBase = leitor.nextDouble();
	}
	
	public Docente dadosDocente()
	{
		informacoesFuncionario();
		System.out.println("Digite o Siape:");
		this.Siape = leitor.next();
		System.out.println("De qual area é o mesmo? ");
		this.area = leitor.next();
		
		Docente d = new Docente(this.cpf, this.nome, this.endereco, 
	 			this.DataAdmissao, this.titulacao, this.Siape , this.Salario , this.SalarioBase , this.area );
		
		d.calculaSalario();
		return d;
	}
	
	public Tecnicos dadosTecnico()
	{
		informacoesFuncionario();
		System.out.println("Siape:");
		this.Siape = leitor.next();
		System.out.println("Departamento:");
		this.departamento = leitor.next();
		
		Tecnicos t = new Tecnicos(this.cpf, this.nome, this.endereco , 
				this.DataAdmissao, this.titulacao , this.Siape , this.Salario, this.SalarioBase);
		
		t.calculaSalario();
		return t;
	}
	
	public Tercerizados dadosTerceirizado()
	{
		informacoesFuncionario();
		System.out.println("data de fim de contrato:");
		this.dataFim = leitor.next();
		System.out.println("função:");
		this.funcao = leitor.next();
		
		Tercerizados tz = new Tercerizados( this.cpf, this.nome, this.endereco, 
				this.DataAdmissao, this.titulacao, this.Siape , this.Salario ,this.SalarioBase);
		
		tz.calculaSalario();
		return tz;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getDatadeEmissao() {
		return DataAdmissao;
	}

	public void setDatadeEmissao(String datadeEmissao) {
		this.DataAdmissao = datadeEmissao;
	}

	public String getTitulacao() {
		return titulacao;
	}

	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}

	public double getSalarioBase() {
		return SalarioBase;
	}

	public void setSalarioBase(double SalarioBase) {
		this.SalarioBase = SalarioBase;
	}

	public String getSiape() {
		return Siape;
	}

	public void setSiape(String Siape) {
		this.Siape = Siape;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public Scanner getLeitor() {
		return leitor;
	}

	public void setLeitor(Scanner leitor) {
		this.leitor = leitor;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento ;
	}

	public String getDataFim() {
		return dataFim;
	}

	public void setDataFim(String dataFim) {
		this.dataFim = dataFim;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	
	
}


