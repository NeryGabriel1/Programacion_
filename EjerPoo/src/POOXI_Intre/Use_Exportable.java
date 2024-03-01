package POOXI_Intre;

import javax.swing.JOptionPane;

public class Use_Exportable {

	public static void main(String[] args) {
		Exportable exportador = new ExportadorPDF();
		try {
			int cantidadReportes = Integer
					.valueOf(JOptionPane.showInputDialog("Dime la cantidad de reportes a generar"));
			while (cantidadReportes > 0) {
				try {
					int option = Integer.parseInt(
							JOptionPane.showInputDialog("\nElige el exportador que quieres usar en tu reporte\n"
									+ "1. ExportadorPDF\n" + "2. ExportadorCSV\n" + "3. Salir" + "Elige una opción"));
					switch (option) {
					case 1:
						break;
					case 2:
						exportador = new ExportadorCSV();
						break;
					case 3:
						cantidadReportes = 0;
						JOptionPane.showMessageDialog(null, "¡Hasta luego!\nGracias por usar nuestro servicio");
						return;
					default:
						JOptionPane.showMessageDialog(null, "La Opción es incorrecta, elige una correcta");
						break;
					}
					Reporte reporte = new Reporte(exportador);
					reporte.generarReporte();
					cantidadReportes--;
				} catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(null, "Dime un número válido.");
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Ocurrió un error: " + e.getMessage());
				}
			}
		} catch (NumberFormatException ex) {
			JOptionPane.showMessageDialog(null, "Dime un número válido.");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Ocurrió un error: " + e.getMessage());
		}

	}

}
