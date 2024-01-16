package POO_Getter_Setter;

public class Use_Producto {

	public static void main(String[] args) {
		Producto celular = new Producto();
		celular.establece_nombre();
		System.out.println(celular.dime_nombre());

		celular.establece_precio();
		System.out.println(celular.dime_precio());

		celular.establece_stock();
		System.out.println(celular.dime_stock());

	}

}
