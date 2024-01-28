package POO5;

import javax.swing.JOptionPane;

public class Uso_modificacion_Sueldo {

	public static void main(String[] args) {
		String nombre = JOptionPane.showInputDialog("Ingrese el nombre del empleado:");
		double sueldo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el sueldo:"));
		int yearContrato = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año de su contrato:"));
		int mesContrato = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el mes de su contrato:"));
		int diaContrato = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el día de la contratacion:"));

		Empleado empleado2 = new Empleado(nombre, sueldo, yearContrato, mesContrato, diaContrato);
		double aumento = Double
				.parseDouble(JOptionPane.showInputDialog("Ingrese cuanto porciento de aumento va a tener:"));
		empleado2.subeSueldo(aumento);
		JOptionPane.showMessageDialog(null, "Sueldo después del aumento: " + empleado2.dameSueldo());

	}

}
