package POOVII;

import javax.swing.JOptionPane;

public class Contador_Llamada_Metodo {
	private static int contador_Llamada = 0;

	// Constructor
	public Contador_Llamada_Metodo() {}

	// Método que muestra saludo
	public void saludar() {
		JOptionPane.showMessageDialog(null, "Saludos " + (++contador_Llamada));
	}

	public static int dimeTotalLlamadas() {
		return contador_Llamada;
	}
}
