package POOVIII_HERE;

public class Estudiantes extends Personas {
	private String carrera;

	// Constructor
	public Estudiantes(String nombre, int edad, String carrera) {
		super(nombre, edad);
		this.carrera = carrera;
	}

	// Método getter and setter for carrera
	public String dimeCarrera() {
		return this.carrera;
	}

	public void establecerCarrera(String carrera) {
		this.carrera = carrera;
	}
}