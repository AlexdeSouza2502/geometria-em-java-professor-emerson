package geometria;

public class retangulo {

private double lado, altura;
	
	// Métodos
	public void setLado(double lado) {
		if (lado > 0) {
			this.lado = lado;
		}
	}
	public void setAltura(double altura) {
		if (altura > 0) {
			this.altura = altura;
		}
	}
	
	public double calculaArea() {
		double area = lado * altura;
		
		return area; 
	}
	
	public void desenhar() {
		for (int i = 0; i < altura; i++) {
			System.out.print(". ");
			
			for (int j = 0; j < lado; j++) {
				if (i == 0 || i + 1 >= altura) {
					System.out.print(". ");
				} else {
					System.out.print("  ");
				}
			}
			
			System.out.println(".");
		}
	}
}
