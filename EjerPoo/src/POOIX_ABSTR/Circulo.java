package POOIX_ABSTR;

public class Circulo extends FigurasGeo {
	private double radio;

	// Constructor
	public Circulo(double radio) {
		this.radio = radio;
	}
	@Override
	double calcularArea() {
		return Math.PI * Math.pow(this.radio, 2);
	}
}