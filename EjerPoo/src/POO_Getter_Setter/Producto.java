package POO_Getter_Setter;

public class Producto {

	private String nombre;
	private double precio;
	private int stock;

	public Producto() {
		nombre = "Celular";
		precio = 769.89;
		stock = 5;
	}

	public String dime_nombre() {

		return "El nombre del producto es " + nombre;

	}

	public void establece_nombre() {
		nombre = "Celular";
	}

	public String dime_precio() {
		return "El precio del producto es de " + precio + " euros.";
	}

	public void establece_precio() {
		precio = 769.89;
	}

	public String dime_stock() {
		return "El stock del producto es de: " + stock;
	}

	public void establece_stock() {
		if (stock >= 0) {
			stock = stock;
		} else {
			System.out.println("El stock no puede estar en negativo.");
		}
	}
}

