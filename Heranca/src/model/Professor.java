package model;

public class Professor extends Usuario {
	//siap 
    private String Siape;
    private String area;
    
    public Professor(String pCPF, String pSiape) {
    	super (pCPF);
    	this.Siape = pSiape;
    	
    }
    public String getSiape() {
    	return this.Siape;
    	
    }
    public void setArea(String pArea) {
    	this.area = pArea;
    	
    }
    public String getArea() {
    	return this.area;
    }
    @Override 
    public String dadosFormatados() {
        String dadosUsuario = super.dadosFormatados();
    	String dadosProfessor =  String.format(" Siape:%s\n Area:%s\n", this.Siape, this.area);
    	return dadosUsuario + dadosProfessor;
    }
}
