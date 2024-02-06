package POOVI_Const;

import javax.swing.JOptionPane;

public class Uso_Calculadora_Impuesto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String precioProductoString = JOptionPane.showInputDialog("Dime el precio del producto");
		double precioProducto = Double.parseDouble(precioProductoString);
		Calculadora_de_impuestos calculadora1 = new Calculadora_de_impuestos(precioProducto);
		JOptionPane.showMessageDialog(null, calculadora1);

	}

}
