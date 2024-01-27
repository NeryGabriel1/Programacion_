package POO4;

import javax.swing.JOptionPane;

public class Use_Registro_Estudiante {

	public static void main(String[] args) {

		Estudiante alumnos1 = new Estudiante();

		alumnos1.setNombre(JOptionPane.
				showInputDialog("Introduce el nombre del estudiante:"));	
		System.out.println(alumnos1.getNombre());

		alumnos1.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Introduce la edad del estudiante:")));	
		System.out.println(alumnos1.getEdad());

		alumnos1.setGrado(JOptionPane.showInputDialog("Introduce el grado del estudiante:"));	
		System.out.println(alumnos1.getGrado());

		//estudiante 2
		Estudiante alumnos2 = new Estudiante();

		alumnos2.setNombre(JOptionPane.showInputDialog("Introduce el nombre del estudiante:"));	
		System.out.println(alumnos2.getNombre());

		alumnos2.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Introduce la edad del estudiante:")));
		System.out.println(alumnos2.getEdad());

		alumnos2.setGrado(JOptionPane.showInputDialog("Introduce el grado del estudiante:"));	
		System.out.println(alumnos2.getGrado());

		//estudiante3
		Estudiante alumnos3 = new Estudiante();

		alumnos3.setNombre(JOptionPane.showInputDialog("Introduce el nombre del estudiante:"));	
		System.out.println(alumnos3.getNombre());

		alumnos3.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Introduce la edad del estudiante:")));	
		System.out.println(alumnos3.getEdad());

		alumnos3.setGrado(JOptionPane.showInputDialog("Introduce el grado del estudiante:"));	
		System.out.println(alumnos3.getGrado());

		//mostrar los datos de estudiantes
		alumnos1.mostrarInformacion();
		alumnos2.mostrarInformacion();
		alumnos3.mostrarInformacion();
	}
}
