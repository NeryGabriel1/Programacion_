package POOVIII_HERE;

import javax.swing.JOptionPane;

public class Use_Figura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Figura[] figuras = new Figura[2];

		figuras[0] = new Circulo(4);
		figuras[1] = new Rectangulo(9, 2);
		JOptionPane.showMessageDialog(null, "El área del circulo es de " + figuras[0].calcular_Area());
		JOptionPane.showMessageDialog(null, "El área del rectangulo es de " + figuras[1].calcular_Area());

	}

}
