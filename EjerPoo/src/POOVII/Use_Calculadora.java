package POOVII;

import javax.swing.JOptionPane;

public class Use_Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "La suma de 5 + 5 es " + Calculadora.sumar(5, 5));
		JOptionPane.showMessageDialog(null, "La resta de 50 - 5 es " + Calculadora.restar(50, 5));
		JOptionPane.showMessageDialog(null, "El producto de 50 * 5 es " + Calculadora.multiplicar(50, 5));
		JOptionPane.showMessageDialog(null, "La división de 50 / 0 es " + Calculadora.dividir(50, 0));
	}

}
