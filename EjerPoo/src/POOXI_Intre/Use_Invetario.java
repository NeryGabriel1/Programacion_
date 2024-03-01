package POOXI_Intre;

import javax.swing.JOptionPane;

public class Use_Invetario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean continuar = true;
		InventarioTienda inventario = new InventarioTienda();
		do {
			try {
				int option = Integer.parseInt(JOptionPane.showInputDialog(null,
						"\nMenú de las opciones:" + "\n1. Agregar producto" + "\n2. Eliminar producto"
								+ "\n3. Actualizar stock de un producto" + "\n4. Mostrar inventario" + "\n5. Salir"));

				switch (option) {
				case 1:
					inventario.agregarProducto();
					break;
				case 2:
					inventario.eliminarProducto();
					break;
				case 3:
					inventario.actualizarStockProduct();
					break;
				case 4:
					inventario.mostrarInventario();
					break;
				case 5:
					continuar = false;
					break;
				default:
					JOptionPane.showMessageDialog(null, "La opción es incorrecta");
					break;
				}
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "" + "Ingrese un número válido.");
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Ocurre un error: " + e.getMessage());
			}
		} while (continuar);

	}

}
