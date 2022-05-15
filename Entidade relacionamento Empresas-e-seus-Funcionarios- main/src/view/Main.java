package view;
import modelo.Empresa;
import modelo.Funcionario;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empresa ti = new Empresa("Tecnologia Informação","15644984651");
		//add funcionario emerson na empresa
		Funcionario emerson = new Funcionario("Emerson Assis",2800.01,"199.265.915-05");
		ti.adicionaFuncionario(emerson);
		
		//add funcionaria Maria na empresa 
		Funcionario Maria = new Funcionario("Maria Fernanda Oliveira",1400.02,"119.274.345-16");
		ti.adicionaFuncionario(Maria);
		
		//add funcionario Jonas na empresa
		Funcionario jonas = new Funcionario("Jonas Santorine",1300.01,"265.859.710-89");
		ti.adicionaFuncionario(jonas);
		
		//add funcionario jumar na empresa 
		Funcionario jumar = new Funcionario("Jumar Costa Silva",1200.01,"169.132.525-45");
		ti.adicionaFuncionario(jumar);
		
		//mostra lista de funcionarios que tem na empresa 
		ti.getFuncionarios().forEach(System.out::println);
	}
	}
