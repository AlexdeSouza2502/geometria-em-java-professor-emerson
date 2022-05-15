package modelo;

public class Funcionario {
	private String nome;
	private String cpf;
	private double salario;
	
	public Funcionario(String nome, double salario, String cpf) {
		this.cpf = cpf;
		this.nome = nome;
		this.salario = salario;
		
	}
	
	
	
	public String getNome() {
		
		return this.nome;
	}
	
	public double getSalario() {
		
		return this.salario;
	}

	public String getCpf() {
		
		return this.cpf;
	}
	
}