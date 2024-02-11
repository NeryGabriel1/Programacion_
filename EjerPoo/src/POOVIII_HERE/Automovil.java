package POOVIII_HERE;

public class Automovil extends Vehiculo {
	private String tipo_Combustible;

	// Constructor
	public Automovil(String marca, String modelo, int year, String tipo_Combustible) {
		super(marca, modelo, year);
		this.tipo_Combustible = tipo_Combustible;
	}

	// getter and setter para tipo de combustible
	public String dimeTipo_Combustible() {
		return this.tipo_Combustible;
	}

	public void establecerTipo_Combustible(String tipo_Combustible) {
		this.tipo_Combustible = tipo_Combustible;
	}
}