package POOVII;

import javax.swing.JOptionPane;

public class Use_Validador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null,"-1234 es un número: " + Validador.isNumber("-1234"));
		JOptionPane.showMessageDialog(null,"-1234- es un número: " + Validador.isNumber("-1234-"));
		JOptionPane.showMessageDialog(null,"-12-34 es un número: " + Validador.isNumber("-12-34"));
		JOptionPane.showMessageDialog(null,"1234 es un número: " + Validador.isNumber("1234"));
		JOptionPane.showMessageDialog(null, "El 4 está en el rango 0 y 10: " + Validador.isInRange(4, 0, 10));
		JOptionPane.showMessageDialog(null, "El 15 está en el rango 0 y 10: " + Validador.isInRange(15, 0, 10));

	}

}
