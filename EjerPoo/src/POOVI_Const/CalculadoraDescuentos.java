package POOVI_Const;

public class CalculadoraDescuentos {
	private final double PORCENTAJE_DESCUENTO = 0.9;
	private boolean descuento;
	private double precioFinal;

	// Constructor
	public CalculadoraDescuentos(double precioUnitario, int unidad) {
		establecerPrecioFinalAndDesucuento(precioUnitario, unidad);
	}

	// setter para precio final
	public void establecerPrecioFinalAndDesucuento(double precioUnitario, int unidad) {
		// si es mayor que 5 tenemos que aplicar un descuento de 10%
		this.precioFinal = unidad > 5 ? ((precioUnitario * unidad) * PORCENTAJE_DESCUENTO) : precioUnitario * unidad;
		this.descuento = this.precioFinal < precioUnitario * unidad;
	}

	public String toString() {
		return descuento ? "Precio final con el descuento es : " + this.precioFinal
				: " Precio final sin el descuento es : " + this.precioFinal;
	}

}
