package POOXI_Intre;

import javax.swing.JOptionPane;

public class Datos implements Ordenable, Filtrable {

	@Override
	public void ordenarDatos() {
		JOptionPane.showMessageDialog(null, "Los datos han sido ordenados correctamente.");

	}

	@Override
	public void filtarDatos() {
		JOptionPane.showMessageDialog(null, "Los datos han sido filtrados correctamente");

	}
}
