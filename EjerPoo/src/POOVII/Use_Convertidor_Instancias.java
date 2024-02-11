package POOVII;

import javax.swing.JOptionPane;

public class Use_Convertidor_Instancias {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null,
				"2 km equivalen a " + Convertidor_Unidades.convertirKilometrosAMillas(2) + " Millas");
		JOptionPane.showMessageDialog(null,
				"40 Celsius equivalen a " + Convertidor_Unidades.convertirCelsius_a_Fahrenheit(40) + " Fahrenheit");

	}

}
