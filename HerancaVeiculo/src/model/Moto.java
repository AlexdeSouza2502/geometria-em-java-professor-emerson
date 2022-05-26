package model;

public class Moto extends Veiculo  {
	
	private String transmissao;
	
	public Moto(String pmarca, String pmodelo, String ptransmissao) {
		super(pmarca,pmodelo);
		
		this.transmissao = ptransmissao;
		
	}

	public String getTransmissao() {
		return this.transmissao;
	}

	public void setTransmissao(String transmissao) {
		this.transmissao = transmissao;
	}
    
    @Override
    public String dadosFormatados() {
    String dadosVeiculo = super.dadosFormatados();
    String dadosMoto = String.format("Transmissao: %s\n", this.transmissao);
	
    return dadosVeiculo + dadosMoto;
	}	
}
