package POOXI_Intre;

import javax.swing.JOptionPane;

public class UsoProcesadoresDePago {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int operaciones = Integer
					.valueOf(JOptionPane.showInputDialog("Ingrese la cantiadad de operaciones a realizar"));
			while (operaciones > 0) {
				ProcesadorDePago procesador = new Paypal();
				try {
					int optionProcesador = Integer.parseInt(JOptionPane.showInputDialog(
							"Elige un método de pago\n" + "1. PayPal\n" + "2. RedsysTPV\n" + "3. Salir"));
					switch (optionProcesador) {
					case 1:
						// Este caso se cubre con la inicialización
						break;
					case 2:
						procesador = new RedsysTPV();
						break;
					case 3:
						JOptionPane.showMessageDialog(null, "¡Hasta luego!\nGracias por usar nuestro servicio");
						return;
					default:
						JOptionPane.showMessageDialog(null, "Elige una de las opción válida");
						break;
					}
					int option = Integer
							.parseInt(JOptionPane.showInputDialog("Elige la operación que quieres realizar\n"
									+ "1. Realizar pago\n" + "2. Reembolsar pago\n3. Calcelar operación"));
					switch (option) {
					case 1:
						procesador.realizarPago();
						break;
					case 2:
						procesador.reembolsarPago();
						break;
					case 3:
						JOptionPane.showMessageDialog(null, "Operación cancelada");
						break;
					default:
						JOptionPane.showMessageDialog(null, "Elige una opción válida");
						;
						;
					}
					operaciones--;
				} catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(null, "Ingrese un número válido.");
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Ocurrió un error: " + e.getMessage());
				}
			}
		} catch (NumberFormatException ex) {
			JOptionPane.showMessageDialog(null, "Ingrese un número válido.");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Ocurrió un error: " + e.getMessage());
		}

	}

}
