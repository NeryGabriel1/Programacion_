package POOVI_Const;

public class Pruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Empleados trabajador1 = new Empleados("Pendejo0");
		Empleados trabajador2 = new Empleados("Pendejo1");

		System.out.println(trabajador1.devuelveDatos());
		System.out.println(trabajador2.devuelveDatos());

		trabajador1.cambiaSeccion("Recursos Humanos");

	}

}

class Empleados {

	private final String nombre;
	private String seccion;

	public Empleados(String nom) {
		nombre = nom;

		seccion = "Administración";

	}

	public void cambiaSeccion(String seccion) {// SETTER
		this.seccion = seccion;

	}

	public String devuelveDatos() {
		return "El nombre es " + nombre + " y la sección es " + seccion;

	}

}
