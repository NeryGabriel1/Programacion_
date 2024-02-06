package POOVII;

import javax.swing.JOptionPane;

public class Use_Contador_Llamada_Metodo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Contador_Llamada_Metodo[] contadores = new Contador_Llamada_Metodo[10];

		for (int i = 0; i < contadores.length; i++) {
			contadores[i] = new Contador_Llamada_Metodo();
			contadores[i].saludar();
		}
		// Aquí usamos la clase para saber cuantas veces si hizo la llamada del método
		// saludar
		JOptionPane.showMessageDialog(null,
				"El método saludar ha sido llamado " + Contador_Llamada_Metodo.dimeTotalLlamadas() + " veces");

	}

}
