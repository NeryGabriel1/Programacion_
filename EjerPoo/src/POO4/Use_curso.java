package POO4;

import javax.swing.JOptionPane;

public class Use_curso {

	public static void main(String[] args) {
		// instanciar la clase
		Curso notasCurso = new Curso();

		// introducir el nombre del curso y la calificación
		notasCurso.setNombre(JOptionPane.showInputDialog("Introduce el nombre del alumno: "));
		notasCurso.setCalificacion(Integer.parseInt(JOptionPane.showInputDialog("Introduce la calificación")));

		// mostrar la información del curso, calificación y categoría
		JOptionPane.showMessageDialog(null, "Alumno: " + notasCurso.getNombre() + "\nCalificación: "
				+ notasCurso.getCalificacion() + "\nCategoría: " + notasCurso.categorizarCalificacion());

	}

}
