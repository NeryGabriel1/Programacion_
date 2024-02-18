package POOIX_ABSTR;

public class Rectangulo extends FigurasGeo {
	private double base;
	private double altura;

	public Rectangulo(double base, double altura) {
		this.altura = altura;
		this.base = base;

	}

	@Override
	double calcularArea() {
		return this.base * this.altura;
	}
}