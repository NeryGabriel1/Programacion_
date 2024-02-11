package POO5;

public class Uso_comparacionDeFechasDeContrato {

	public static void main(String[] args) {
		Empleado empleado3 = new Empleado("Javier Legal", 7500, 2022, 12, 10);
		Empleado empleado4 = new Empleado("Gael Legal", 1200, 2024, 04, 01);
		// Aquí vamos a comprobar quien fue contratado primero
		if (empleado3.dameFechaContrato().before(empleado4.dameFechaContrato())) {
			System.out.println("El empleado 3 fue contratado primero");
		} else if (empleado4.dameFechaContrato().before(empleado3.dameFechaContrato())) {
			System.out.println("El empleado 4 fue contratado primero");
		} else {
			System.out.println("Los dos fueron contratados en el mismo día");
		}
	}

}
