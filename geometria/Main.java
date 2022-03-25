package geometria;

public class Main {

	public static void main(String[] args) {
		// Teste da classe Quadrado
		Quadrado primeiroQuadrado = new Quadrado();
		primeiroQuadrado.setLado(12);
		
		double areaPrimeiroQuadrado = primeiroQuadrado.calculaArea();
		System.out.println("Area quadrado: " + areaPrimeiroQuadrado);
		
		System.out.println("Desenho quadrado: ");
		primeiroQuadrado.desenhar();
		
		retangulo primeiroRetangulo = new retangulo();
		primeiroRetangulo.setAltura(6);
		primeiroRetangulo.setLado(12);
		
		
		double calculaarea = primeiroRetangulo.calculaArea();
		System.out.println("Area do Retangulo %s: %.2f\n" + calculaarea);
		
		System.out.println("Desenho retangulo: ");
		primeiroRetangulo.desenhar();
		
		triangulo primeiroTriangulo = new triangulo();
		primeiroTriangulo.setAltura(40);
		primeiroTriangulo.setbase(20);
		
		
		double calculaArea = primeiroTriangulo.calculaArea();
		System.out.println("Area do triangulo %s: %.2f\n" + calculaarea);
		
		System.out.println("Desenho triangulo: ");
		primeiroTriangulo.desenhar();
		
		
		
		
	}
}

	 
	
