package POOVIII_HERE;

import javax.swing.JOptionPane;

public class Use_Estudiantes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Estudiantes alumno = new Estudiantes("Gael Legal", 30, "Enfermeria");
		JOptionPane.showMessageDialog(null, alumno);
		JOptionPane.showMessageDialog(null, "Carrera: " + alumno.dimeCarrera());
	}

}
