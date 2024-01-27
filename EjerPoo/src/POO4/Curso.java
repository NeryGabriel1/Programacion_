package POO4;

public class Curso {
	// atributos
	private String nombre;
	private int calificacion;

	// constructor
	public Curso() {
		this.nombre = nombre;
		this.calificacion = calificacion;
	}

	// getters y setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(int calificacion) {
		this.calificacion = calificacion;
	}

	// método para calificar por letras
	public String categorizarCalificacion() {
		switch ((int) (calificacion/10)) {
		case 10:
		case 9:
			return "A - Sobresaliente";
		case 8:
			return "B - Excelente";
		case 7:
			return "C - Bueno";
		case 6:
			return "D - Aprobado";
		default:
			return "F - Reprobado";
		}
	}

}
