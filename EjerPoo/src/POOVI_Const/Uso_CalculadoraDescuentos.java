package POOVI_Const;

import javax.swing.JOptionPane;

public class Uso_CalculadoraDescuentos {

	public static void main(String[] args) {
		double precioUnitario = Double
				.parseDouble(JOptionPane.showInputDialog("Dime el precio unitario del producto:"));
		int cantidadProducto = Integer.parseInt(JOptionPane.showInputDialog("Dime la cantidad del producto:"));
		CalculadoraDescuentos calculadora = new CalculadoraDescuentos(precioUnitario, cantidadProducto);
		JOptionPane.showMessageDialog(null, calculadora);

	}

}
