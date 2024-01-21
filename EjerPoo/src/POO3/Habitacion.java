package POO3;

public class Habitacion {
	private int numero;
	private String tipo;
	private boolean ocupada;

	// Constructor
	public Habitacion(int numero, String tipo) {
		this.numero = numero;
		this.tipo = tipo;
		this.ocupada = false;
	}

	// Getters y Setters
	public int getNumero() {
		return numero;
	}

	public String getTipo() {
		return tipo;
	}

	public boolean getOcupada() {
		return ocupada;
	}
	
	public void setNumero(int numeroHab) {
		if (numeroHab < 1) {
			System.out.println("El número de la habitación debe ser mayor a cero");
		}else {
			this.numero = numeroHab;
		}
	}
	// setter para tipo
	public void setTipo(String tipo) {
		if (tipo.equalsIgnoreCase("simple") || tipo.equalsIgnoreCase("primera") || tipo.equalsIgnoreCase("suite")) {
			this.tipo = tipo;
		}else {
			System.out.println("Solo puede ser de tipo: simple, primera o suite.");
		}
	}

	public void setOcupada(boolean ocupada) {
		this.ocupada = ocupada;
	}

}
