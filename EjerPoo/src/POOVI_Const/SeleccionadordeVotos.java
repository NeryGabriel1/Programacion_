package POOVI_Const;

public class SeleccionadordeVotos {
	private final int EDAD_MINIMA = 18;
	private boolean elegible;

	// Constructor
	public SeleccionadordeVotos(int edad) {
		establecerElegible(edad);
	}

	// setter para elegible
	public void establecerElegible(int edad) {
		if (edad < EDAD_MINIMA) {
			this.elegible = false;
		} else {
			this.elegible = true;
		}
	}

	public String toString() {
		String descripcion = "";
		if (this.elegible) {
			descripcion += "El individuo es apto para votar";
		} else {
			descripcion += "El individuo no es apto para votar";
		}
		return descripcion;
	}

}
