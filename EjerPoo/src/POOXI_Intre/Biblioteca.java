package POOXI_Intre;

import javax.swing.JOptionPane;

public class Biblioteca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Datos datos = new Datos();
		boolean salir = false;
		while (!salir) {
			try {
				int option = Integer.valueOf(JOptionPane.showInputDialog("Elige que acción quiere realizar \n"
						+ "1. Ordenar Datos\n" + "2. Filtrar Datos\n" + "3. Salir"));
				switch (option) {
				case 1:
					datos.ordenarDatos();
					break;
				case 2:
					datos.filtarDatos();
					break;
				case 3:
					salir = !salir;
					JOptionPane.showMessageDialog(null, "¡Hasta luego!\n Gracias por usar nuestro servicio");
					break;
				default:
					JOptionPane.showMessageDialog(null, "Elige una opción valida");
				}
			} catch (NumberFormatException ex) {
				JOptionPane.showMessageDialog(null, "Dime un número válido.");
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Ocurrio un error: " + e.getMessage());
			}
		}

	}

}
