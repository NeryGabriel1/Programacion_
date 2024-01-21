package POO3;

public class Alarma {
	private String horaAlarma;
	private String horaActual;
	private boolean alarmaActivada;

	// Constructor
	public Alarma() {
		this.horaAlarma = "20:00";
		this.horaActual = "20:00";
		this.alarmaActivada = false;
	}

	// Getter y Setter para la hora de la alarma
	public String dime_horaAlarma() {// Getter
		return "La hora de la alarma es " + horaAlarma;
	}

	public void establece_horaAlarma(String horaAlarma) {// Setter
		this.horaAlarma = horaAlarma;
	}

	// Getter y Setter para la hora actual
	public String dime_HoraActual() {// Getter
		return "La hora actual es " + horaActual;
	}

	public void establecer_HoraActual(String horaActual) {// setter
		this.horaActual = horaActual;
	}

	// Método para activar/desactivar la alarma
	public void establecer_AlarmaActivada(boolean alarmaActivada) {
		this.alarmaActivada = alarmaActivada;
	}

	// Método que comprueba si la alarma debe sonar
	public void comprobaralarmaActivada() {
		if (alarmaActivada && horaActual.equals(horaAlarma)) {
			System.out.println("Alarma sonando");
		}
	}

}
