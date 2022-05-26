package model;

public class Carro extends Veiculo  {

	private int numPortas;
	
	public Carro(String pmarca, String pmodelo, int pnumPortas ){
		super(pmarca, pmodelo);
		this.numPortas = pnumPortas;
		
		
		
	}

	public int getNumPortas() {
		return this.numPortas;
	}

	public void setNumPortas(int numPortas) {
		this.numPortas = numPortas;
	}
	@Override
    public String dadosFormatados() {
    String dadosVeiculo = super.dadosFormatados();
    String dadosCarro = String.format("Numero de portas: %d\n", this.numPortas);
	
    return dadosVeiculo + dadosCarro;
	}	
}
