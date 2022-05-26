package view;
import model.Carro;
import model.Moto;
import model.Veiculo;

public class Main {
	
	public static void main (String args[]) {
		Veiculo veiculo1 = new Veiculo ("BMW", "320i");
		
		
		System.out.println(veiculo1.dadosFormatados());
		
		Carro carro1 = new Carro("BMW", "320i", 4);
		
		System.out.println(carro1.dadosFormatados());
		
		Moto moto1 = new Moto("BMW","F800","6");
		
		System.out.println(moto1.dadosFormatados());
		
		
		
			
		
	}
}
