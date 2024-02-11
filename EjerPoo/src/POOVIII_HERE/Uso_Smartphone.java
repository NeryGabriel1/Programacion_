package POOVIII_HERE;

import javax.swing.JOptionPane;

public class Uso_Smartphone {

	public static void main(String[] args) {

		// Crear un objeto Smartphone
		Smartphone miSmartphone = new Smartphone("Xaomi", 2024);
		miSmartphone.fabricante = "Jefferson";
		// He usado protected para demostrar que no es seguro
		// cuando tenemos la clase Main "UsoSmartphone" en el mismo paquete
		JOptionPane.showMessageDialog(null, "Nuevo fabricante es: " + miSmartphone.dimeFabricante());
		// Llamar y recibir llamadas
		miSmartphone.llamar("135689");
		miSmartphone.recibirLlamadas("135689");
		// Instalar una aplicación
		miSmartphone.instalarAplicacion("Skype");

	}

}
