package POO4;

import javax.swing.JOptionPane;

public class Use_producto {
	public static void main(String[] args) {
		// declarar array
		Producto[] productos = new Producto[3];

		// bucle for para introducir los datos
		for (int i = 0; i < productos.length; i++) {
			Producto producto = new Producto();

			// introducir el nombre del producto
			producto.setNombre(JOptionPane.showInputDialog("Introduce el nombre del producto " + (i + 1) + ":"));

			// introducir la cantidad
			producto.setCantidad(Integer
					.parseInt(JOptionPane.showInputDialog("Introduce la cantidad del producto " + (i + 1) + ":")));

			// introducir el precio
			producto.setPrecio(Double
					.parseDouble(JOptionPane.showInputDialog("Introduce el precio del producto " + (i + 1) + ":")));

			// guardar los productos en el array
			productos[i] = producto;
		}

		// imprimir un resumen del inventario
		System.out.println("Resumen del inventario:");
		System.out.println();

		for (int i = 0; i < productos.length; i++) {
			Producto producto = productos[i];
			JOptionPane.showMessageDialog(null, "Nombre del producto " + (i + 1) + ": " + producto.getNombre()
					+ "\nCantidad" + ": " + producto.getCantidad() + "\nPrecio" + ": " + producto.getPrecio() + "€");

			System.out.println("Producto: " + productos[i].getNombre());
			System.out.println("Cantidad: " + productos[i].getCantidad());
			System.out.println("Precio: " + productos[i].getPrecio() + "€\n");



		}

	}
}
