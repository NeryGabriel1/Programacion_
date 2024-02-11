package POOVI_Const;

import javax.swing.JOptionPane;

public class Use_SeleccionadordeVotos {

	public static void main(String[] args) {
		int edad = Integer.parseInt(JOptionPane.showInputDialog("Dime la edad del individuo"));
		SeleccionadordeVotos comprobador = new SeleccionadordeVotos(edad);
		JOptionPane.showMessageDialog(null, comprobador);

	}

}
