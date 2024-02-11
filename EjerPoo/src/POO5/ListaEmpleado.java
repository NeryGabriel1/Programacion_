package POO5;

import java.util.*;

public class ListaEmpleado {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Empleado> listaEmpleados = new ArrayList<>();
		for (int i = 0; i < 2; i++) {
			listaEmpleados.add(cargarEmpleado(sc, i + 1));
		}
		// for para mostrar nombre y sueldo del empleado
		for (Empleado empleado : listaEmpleados) {
			System.out.println("-----------------------------------------------");
			System.out.println("Nombre del empleado: " + empleado.dameNombre());
			System.out.println("Sueldo: " + empleado.dameSueldo() + " €");
		}
		System.out.println("-----------------------------------------------");
		sc.close();
	}

	private static Empleado cargarEmpleado(Scanner sc, int numEmpleado) {
		System.out.println("-----------------------------------------------");
		System.out.print("Ingrese el nombre del empleado " + numEmpleado + ": ");
		String nombre = sc.nextLine();
		System.out.print("Ingrese el sueldo: ");
		double sueldo = Double.parseDouble(sc.nextLine());
		System.out.print("Ingrese el año del contrato: ");
		int annoContrato = Integer.parseInt(sc.nextLine());
		System.out.print("Ingrese el mes del contrato: ");
		int mes = Integer.parseInt(sc.nextLine());
		System.out.print("Ingrese el día del contrato: ");
		int dia = Integer.parseInt(sc.nextLine());
		return new Empleado(nombre, sueldo, annoContrato, mes, dia);

	}

}
