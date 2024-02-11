package POOVIII_HERE;

public class Rectangulo extends Figura {
	private double base;
	private double altura;

	public Rectangulo(double base, double altura) {
		this.altura = altura;
		this.base = base;

	}

	@Override
	double calcular_Area() {
		return this.base * this.altura;
	}
}