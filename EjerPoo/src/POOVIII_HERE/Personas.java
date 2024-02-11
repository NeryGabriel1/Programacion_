package POOVIII_HERE;

public class Personas {
	private String nombre;
	private int edad;

	// Constructor
	public Personas(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

	// getter and setter for nombre
	public String dimeNombre() {
		return this.nombre;
	}

	public int dimeEdad() {
		return this.edad;
	}

	// Método para mostrar las caracteristicas de Persona
	public String toString() {
		return "El Nombre es: " + this.nombre + "\n y la Edad: " + this.edad + "\n";
	}

}
