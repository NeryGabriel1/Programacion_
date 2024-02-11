package POO5;

import java.util.*;

import javax.swing.JOptionPane;

public class Use_Empleado {

	public static void main(String[] args) {
		Empleado empleados = new Empleado(JOptionPane.showInputDialog("Introduce el nombre"),
				Double.parseDouble(JOptionPane.showInputDialog("Introduce el sueldo diario")),
				Integer.parseInt(JOptionPane.showInputDialog("Introduce el año de alta")),
				Integer.parseInt(JOptionPane.showInputDialog("Introduce el mes de incorporación")),
				Integer.parseInt(JOptionPane.showInputDialog("Introduce el día de incorporación")));
		mostrarinfo(empleados);
	}

	public static void mostrarinfo(Empleado t) {
		JOptionPane.showMessageDialog(null, "Nombre: " + t.dameNombre() + "\nSueldo" + t.dameSueldo()
				+ "\nAlta de contrato: " + t.dameFechaContrato());
	}

}