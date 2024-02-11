package POO5;

import java.util.*;

public class Use_AumentoSueldoCondicionado {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Empleado> listaEmpleado = crearListaDeEmpleados(sc);
		aumentar_Sueldo(listaEmpleado);
		// Mostramos los datos de los empleados depués de modificar el sueldo
		mostrar_Empleados(listaEmpleado);
		sc.close();
	}

	private static List<Empleado> crearListaDeEmpleados(Scanner sc) {
		List<Empleado> listaEmpleados = new ArrayList<>();
		System.out.println("¿Cuántos empleados quieres registrar? ");
		int numEmpleados = Integer.valueOf(sc.nextLine());
		for (int i = 0; i < numEmpleados; i++) {
			listaEmpleados.add(cargar_Empleado(sc, i + 1));
		}
		return listaEmpleados;
	}

	private static Empleado cargar_Empleado(Scanner sc, int numEmpleado) {
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

	private static void aumentar_Sueldo(List<Empleado> listaEmpleados) {
		for (Empleado empleado : listaEmpleados) {
			int annoContrato = empleado.dameFechaContrato().toInstant().atZone(java.time.ZoneId.systemDefault())
					.toLocalDate().getYear();
			if (annoContrato < 2021) {
				empleado.subeSueldo(5);
			}
		}
	}

	private static void mostrar_Empleados(List<Empleado> listaEmpleados) {
		String empleados = "\n";
		for (Empleado empleado : listaEmpleados) {
			empleados += empleado + "\n";
		}
		if (empleados.length() > 0) {
			System.out.println(empleados);
		} else {
			System.out.println("No hay ningun empleado en la lista.");
		}

	}

}
