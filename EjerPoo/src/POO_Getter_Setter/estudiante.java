package POO_Getter_Setter;

public class estudiante {

	private String nombre;
	private int edad;
	private double calificacion;
	
	public estudiante() { 
		nombre = "Gabriel";
		edad=90;
		calificacion =8.5;
	}

	public String dime_nombre() {

		return "El nombre del alumno es " + nombre;

	}

	public void establece_nombre() {
		nombre = "Gabriel";
	}

	public String dime_edad() {
		return "La edad del alumno es " + edad;
	}

	public void establece_edad() {
		

		if (edad >= 0 && edad <= 100) {
			edad = edad;
		} else {
			System.out.println("La edad solo puede ser de 0 a 100 años.");
		}
	}

	public String dime_calificacion() {
		return "La calificación del estudiante es " + calificacion;
	}

	public void establece_calificacion() {
		calificacion = 8.5;
	}

}
