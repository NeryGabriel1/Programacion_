package POOVI_Const;

import javax.swing.JOptionPane;

public class Uso_Determinador_Bisiesto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year = Integer.parseInt(JOptionPane.showInputDialog("Dime el año para verificar si es un año bisiesto o no"));
		Determinador_Bisiesto determinador = new Determinador_Bisiesto(year);
		JOptionPane.showMessageDialog(null, determinador);
	}

}
