package POOVII;

public class Contador_Instancias {
	private static int contador_Instancias = 0;

	// Constructor
	public Contador_Instancias() {
		++contador_Instancias;
	}

	// geter que devuelve la instancia actual
	public static int dimeInstanciaActual() {
		return contador_Instancias;
	}
}

