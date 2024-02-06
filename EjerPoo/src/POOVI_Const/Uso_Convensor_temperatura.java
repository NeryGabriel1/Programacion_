package POOVI_Const;

import javax.swing.JOptionPane;

public class Uso_Convensor_temperatura {

	public static void main(String[] args) {
		int temperatura = Integer.parseInt(JOptionPane.showInputDialog("Dime la temperatura"));
		String tipo = JOptionPane.showInputDialog("Dime el tipo de la temperatura");
		Conversor_de_temperatura conversor1 = new Conversor_de_temperatura(temperatura, tipo);
		JOptionPane.showMessageDialog(null, conversor1.dimeTemperatura());

	}

}
