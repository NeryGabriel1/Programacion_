package POO4;

import javax.swing.JOptionPane;

public class Use_Empleados {

	public static void main(String[] args) {
		Empleados[] empleado = new Empleados[5];

		// bucle for para introducir los datos
		for (int i = 0; i < empleado.length; i++) {
			Empleados empleados = new Empleados();

			// introducir el nombre del empleado
			empleados.setNombre(JOptionPane.showInputDialog("Introduce el nombre del empleado " + (i + 1) + ":"));

			// introducir las horas trabajadas
			empleados.setHoras(Integer.parseInt(
					JOptionPane.showInputDialog("Introduce las horas trabajadas por el empleado " + (i + 1) + ":")));

			// introducir la tarifa por hora
			empleados.setTarifa(Double.parseDouble(
					JOptionPane.showInputDialog("Introduce la tarifa por hora del empleado " + (i + 1) + ":")));

			// guardar el empleado en el array
			empleado[i] = empleados;
		}

		// calcular y mostrar el salario de cada empleado
		for (int i = 0; i < empleado.length; i++) {
			Empleados empleados = empleado[i];
			double salario = empleados.calcularSalario();
			JOptionPane.showMessageDialog(null,
					"Empleado " + (i + 1) + ": " + empleados.getNombre() + "\nSalario: " + salario);
		}
	}

}
