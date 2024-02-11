package POOVIII_HERE;

import javax.swing.JOptionPane;

public class Use_Automovil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Automovil automovil1 = new Automovil("Toyota", "Premio", 2002, "Nafta");
		JOptionPane.showMessageDialog(null, "Caracteristicas básicas son :\n" + automovil1);
		JOptionPane.showMessageDialog(null,
				"El automóvil1 usa el tipo de combustible : " + automovil1.dimeTipo_Combustible());

	}

}
