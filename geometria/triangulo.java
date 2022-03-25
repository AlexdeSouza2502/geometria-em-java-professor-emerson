package geometria;

public class triangulo {
	
	private double base, altura;
	
	public void setAltura(double altura) {
		if (altura > 0) {
			this.altura = altura;
		}
	}		
		public void setbase(double base) {
				if (base > 0) {
					this.base = base;
		}
		
	}
	public double calculaArea() {
		double area = (base * altura)/2;
		return area;
	}
	public void desenhar() {
		for (int i = 0; i < base; i++) {
			System.out.print(". ");
			
			for (int j = 0; j < i; j++) {
				if (i == 0 || i + 1 >= i) {
					System.out.print(". ");
				} else {
					System.out.print("  ");
				}
			}
			
			System.out.println(".");
		}
	}
}

	

	
