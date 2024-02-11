package POOVIII_HERE;

public class DispositivoElectronico {
	protected String fabricante;
	protected int yearFabricacion;

	// Constructor
	protected DispositivoElectronico(String fabricante, int yearFabricacion) {
		this.fabricante = fabricante;
		this.yearFabricacion = yearFabricacion;
	}

	// getter para los atributos
	protected String dimeFabricante() {
		return this.fabricante;
	}

	protected int dimeYearFabricacion() {
		return this.yearFabricacion;
	}

}
