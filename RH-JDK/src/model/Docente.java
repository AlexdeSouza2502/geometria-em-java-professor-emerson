package model;

public class Docente extends Funcionarios {
     private String area;
     private String siape;
     
     
     public Docente(String pCPF, String pNome, String pEndereco, 
 			String pdataAdmissao, String pTitulacao, String pSiape, double pSalario, double pSalarioBase, String Parea ) {
 		super(pCPF,pNome,pEndereco,pdataAdmissao,pTitulacao, pSalario ,pSalarioBase);
 		
 		 
 	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getSiape() {
		return siape;
	}

	public void setSiape(String siape) {
		this.siape = siape;
	}
	@Override
	public double calculaSalario(){
        double salario = getSalarioBase();
        if(this.getTitulacao().equalsIgnoreCase("Mestre")) {
            salario += getSalarioBase() * 0.2;
        }
        
        if (this.getTitulacao().equalsIgnoreCase("Doutor") ) {
            salario += getSalarioBase() * 0.4;
        }
        this.setSalarioBase(salario);
		return salario;
    }
	@Override
	public String toString() 
	{
		return "\ncpf: " + this.getCpf() + "\nnome: " + this.getNome() + "\nendereço: " + this.getEndereco() + "\ndata de emissão:" + this.getDataAdmissao() + "\ntitulação: " + this.getTitulacao() + "\nsalario base: " + this.getSalarioBase()
		+ "\nsiape: " + this.siape + "\narea: " + this.area;
	}
}

		 
	


