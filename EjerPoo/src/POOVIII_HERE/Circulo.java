package POOVIII_HERE;

public class Circulo extends Figura {
	private double radio;

	// Constructor
	public Circulo(double radio) {
		this.radio = radio;
	}

	@Override
	double calcular_Area() {
		return Math.PI * Math.pow(this.radio, 2);
	}
}